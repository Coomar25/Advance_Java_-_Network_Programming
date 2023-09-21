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

public class TwoDimensionalObjectsDisplay extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a hexagon
        int[] xPoints = {150, 200, 300, 350, 300, 200};
        int[] yPoints = {100, 50, 50, 100, 150, 150};
        int numPoints = 6;

        g.setColor(Color.BLUE);
        g.fillPolygon(xPoints, yPoints, numPoints);

        // Draw a rectangle
        g.setColor(Color.RED);
        g.fillRect(400, 50, 100, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("2D Objects Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 200);
            frame.add(new TwoDimensionalObjectsDisplay());
            frame.setVisible(true);
        });
    }
}
