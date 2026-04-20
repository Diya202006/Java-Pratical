import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample extends JFrame {

    JCheckBox javaBox, pythonBox, cppBox;

    FlowLayoutExample() {
        setTitle("FlowLayout Example");
 
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
 
        javaBox = new JCheckBox("Java");
        pythonBox = new JCheckBox("Python");
        cppBox = new JCheckBox("C++");
 
        add(javaBox);
        add(pythonBox);
        add(cppBox);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}