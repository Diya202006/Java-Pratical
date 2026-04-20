import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame implements ActionListener {

    JTextField inputField, resultField;
    JButton binaryBtn, octalBtn, hexBtn;

    BorderLayoutExample() {
        setTitle("Number Converter");
        setSize(400, 200);
        setLayout(new BorderLayout(5, 5));
 
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Enter the number"));
        inputField = new JTextField(10);
        topPanel.add(inputField);
 
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 3, 5, 5));

        binaryBtn = new JButton("Binary");
        octalBtn = new JButton("Octal");
        hexBtn = new JButton("Hex");

        centerPanel.add(binaryBtn);
        centerPanel.add(octalBtn);
        centerPanel.add(hexBtn);
 
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JLabel("Result"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        bottomPanel.add(resultField);
 
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
 
        binaryBtn.addActionListener(this);
        octalBtn.addActionListener(this);
        hexBtn.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());

            if (e.getSource() == binaryBtn) {
                resultField.setText(Integer.toBinaryString(number));
            } else if (e.getSource() == octalBtn) {
                resultField.setText(Integer.toOctalString(number));
            } else if (e.getSource() == hexBtn) {
                resultField.setText(Integer.toHexString(number).toUpperCase());
            }

        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}