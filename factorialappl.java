import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class factorialappl extends Applet implements ActionListener {

    TextField input, result;
    Button btn;

    public void init() {
        setLayout(new FlowLayout());

        add(new Label("Enter Number:"));
        input = new TextField(10);
        add(input);

        btn = new Button("Find Factorial");
        add(btn);

        add(new Label("Result:"));
        result = new TextField(15);
        result.setEditable(false);
        add(result);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(input.getText());
            long fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            result.setText(String.valueOf(fact));
        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }
}