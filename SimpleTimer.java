import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTimer extends JFrame {

    JLabel timeLabel;
    JButton startBtn, stopBtn;

    int seconds = 0;
    Timer timer;

    SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());
 
        timeLabel = new JLabel("Time: 0 sec");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
 
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");

        add(timeLabel);
        add(startBtn);
        add(stopBtn);
 
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timeLabel.setText("Time: " + seconds + " sec");
            }
        });
 
        startBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
 
        stopBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}