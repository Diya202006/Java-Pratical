import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageViewer extends JFrame implements ItemListener {

    JComboBox<String> comboBox;
    JLabel imageLabel;

    String[] imageNames = {"Select", "Image1", "Image2", "Image3"};

    ImageViewer() {
        setTitle("Image Viewer");
        setSize(400, 400);
        setLayout(new FlowLayout());

        comboBox = new JComboBox<>(imageNames);
        comboBox.addItemListener(this);

        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(300, 250));

        add(comboBox);
        add(imageLabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selected = (String) comboBox.getSelectedItem();

            switch (selected) {
                case "Image1":
                    imageLabel.setIcon(new ImageIcon("image1.jpg"));
                    break;
                case "Image2":
                    imageLabel.setIcon(new ImageIcon("image2.jpg"));
                    break;
                case "Image3":
                    imageLabel.setIcon(new ImageIcon("image3.jpg"));
                    break;
                default:
                    imageLabel.setIcon(null);
            }
        }
    }

    public static void main(String[] args) {
        new ImageViewer();
    }
}