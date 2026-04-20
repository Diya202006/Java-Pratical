import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField textField;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator() {
        setTitle("Swing Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);
 
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "%", "√", "x²"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
 
        if (command.matches("[0-9.]")) {
            textField.setText(textField.getText() + command);
        }
 
        else if (command.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        }
 
        else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }
 
        else if (command.equals("C")) {
            textField.setText("");
        }
 
        else if (command.equals("%")) {
            double val = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(val / 100));
        }
 
        else if (command.equals("x²")) {
            double val = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(val * val));
        }
 
 
        else if (command.equals("√")) {
            double val = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(Math.sqrt(val)));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}