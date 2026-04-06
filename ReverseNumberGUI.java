import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReverseNumberGUI extends JFrame implements ActionListener {

    private JTextField inputField, resultField;
    private JButton reverseButton;

    public ReverseNumberGUI() {
        setTitle("Reverse Number");
 
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));
 
        add(new JLabel("Enter Number:"));
        inputField = new JTextField(10);
        add(inputField);
 
        reverseButton = new JButton("Reverse");
        add(reverseButton);
 
        add(new JLabel("Reversed Number:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);
 
        reverseButton.addActionListener(this);
 
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            resultField.setText(String.valueOf(reverse));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new ReverseNumberGUI();
    }
}