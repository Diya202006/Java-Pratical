import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall extends JFrame {

    public BouncingBall() {
        setTitle("Bouncing Ball");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BallPanel panel = new BallPanel();
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BouncingBall();
    }
}
 
class BallPanel extends JPanel implements Runnable, MouseListener {

    int x = 50, y = 50;        
    int dx = 3, dy = 3;         
    int diameter = 30;

    Thread thread;

    BallPanel() {
        addMouseListener(this);
    }
 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
    }

    // Thread logic
    public void run() {
        while (true) {
            x += dx;
            y += dy;

           
            if (x <= 0 || x + diameter >= getWidth()) {
                dx = -dx;
            }

           
            if (y <= 0 || y + diameter >= getHeight()) {
                dy = -dy;
            }

            repaint();

            try {
                Thread.sleep(10);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
    public void mousePressed(MouseEvent e) {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
 
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}