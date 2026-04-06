import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CounterGUI extends JFrame implements ActionListener {

    private int count = 0;
    private JTextField textField;
    private JButton upButton, downButton, resetButton;

    public CounterGUI() {
        setTitle("Counter");
 
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));
 
        JLabel label = new JLabel("Counter");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        add(label);
 
        textField = new JTextField("0", 10);
        textField.setFont(new Font("Arial", Font.BOLD, 16));
        textField.setEditable(false);  
        add(textField);
 
        upButton = new JButton("Count Up");
        downButton = new JButton("Count Down");
        resetButton = new JButton("Reset");

        add(upButton);
        add(downButton);
        add(resetButton);
 
        upButton.addActionListener(this);
        downButton.addActionListener(this);
        resetButton.addActionListener(this);
 
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == upButton) {
            count++;
        } else if (e.getSource() == downButton) {
            count--;
        } else if (e.getSource() == resetButton) {
            count = 0;
        }

        textField.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}