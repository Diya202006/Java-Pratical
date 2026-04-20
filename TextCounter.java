import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextCounter extends JFrame implements KeyListener {

    JTextArea textArea;
    JLabel countLabel;

    TextCounter() {
        setTitle("Text Counter");
        setSize(400, 300);
        setLayout(new BorderLayout());
 
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.addKeyListener(this);
 
        JScrollPane scrollPane = new JScrollPane(textArea);
 
        countLabel = new JLabel("Characters: 0  Words: 0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 14));

        add(scrollPane, BorderLayout.CENTER);
        add(countLabel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public void updateCounts() {
        String text = textArea.getText();

        int charCount = text.length();
 
        String trimmed = text.trim();

        int wordCount = 0;
        if (!trimmed.isEmpty()) {
            wordCount = trimmed.split("\\s+").length;
        }

        countLabel.setText("Characters: " + charCount + "  Words: " + wordCount);
    }
 
    public void keyReleased(KeyEvent e) {
        updateCounts();
    }

    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new TextCounter();
    }
}