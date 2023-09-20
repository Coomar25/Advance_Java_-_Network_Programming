/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Some_Reports_Code;

/**
 *
 * @author kumar
 */
import javax.swing.*;
import java.awt.*;

public class TwoDimensionalObjects extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Create a Graphics2D object for advanced drawing
        Graphics2D g2d = (Graphics2D) g;

        // Draw a rectangle
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 50, 100, 60);

        // Draw an ellipse (oval)
        g2d.setColor(Color.BLUE);
        g2d.fillOval(200, 50, 80, 80);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("2D Objects");
                frame.setSize(400, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TwoDimensionalObjects());
                frame.setVisible(true);
            }
        });
    }
}
