import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseCoordinates extends JFrame implements MouseMotionListener {

    JLabel label;

    MouseCoordinates() {
        setTitle("Mouse Coordinates Tracker");
        setSize(400, 300);
        setLayout(new FlowLayout());

        label = new JLabel("Move mouse inside the window");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        add(label);
 
        addMouseMotionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setText("X: " + x + "  Y: " + y);
    }
 
    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseCoordinates();
    }
}