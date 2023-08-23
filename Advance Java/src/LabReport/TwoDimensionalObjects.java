import javax.swing.*;
import java.awt.*;

public class TwoDimensionalObjects extends JFrame {
    // Constructor
    public TwoDimensionalObjects() {
        // Set frame properties
        setTitle("Two-Dimensional Objects");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel to draw the objects
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawObjects(g);
            }
        };

        // Add the panel to the frame
        add(panel);

        // Show the frame
        setVisible(true);
    }

    // Method to draw the objects
    private void drawObjects(Graphics g) {
        // Draw a rectangle
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 150, 100);

        // Draw a circle
        g.setColor(Color.RED);
        g.fillOval(200, 250, 100, 100);
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TwoDimensionalObjects::new);
    }
}
