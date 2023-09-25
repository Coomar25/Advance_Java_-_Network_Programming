/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabReport;

/**
 *
 * @author kumar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleCaluculator extends JFrame {
    private JTextField radiusTextField;
    private JTextField resultTextField;

    private double radius;

    public CircleCaluculator() {
        setTitle("Circle Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel radiusLabel = new JLabel("Enter Radius:");
        radiusTextField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        resultTextField = new JTextField(15);
        resultTextField.setEditable(false);

        add(radiusLabel);
        add(radiusTextField);
        add(calculateButton);
        add(resultTextField);

        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    radius = Double.parseDouble(radiusTextField.getText());
                    double area = Math.PI * radius * radius;
                    resultTextField.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    resultTextField.setText("Invalid Input");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    radius = Double.parseDouble(radiusTextField.getText());
                    double circumference = 2 * Math.PI * radius;
                    resultTextField.setText("Circumference: " + circumference);
                } catch (NumberFormatException ex) {
                    resultTextField.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircleCaluculator calculator = new CircleCaluculator();
            calculator.setVisible(true);
        });
    }
}
}
