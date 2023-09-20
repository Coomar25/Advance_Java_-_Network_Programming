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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private int num1, num2;
    private boolean isMousePressed;

    public MouseEventCalculator() {
        setTitle("Mouse Event Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2Field);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);

        num1Field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isMousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isMousePressed = false;
                calculateResult();
            }
        });

        num2Field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isMousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isMousePressed = false;
                calculateResult();
            }
        });

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void calculateResult() {
        try {
            num1 = Integer.parseInt(num1Field.getText());
            num2 = Integer.parseInt(num2Field.getText());

            if (isMousePressed) {
                // Sum when mouse is pressed
                resultField.setText(Integer.toString(num1 + num2));
            } else {
                // Difference when mouse is released
                resultField.setText(Integer.toString(num1 - num2));
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MouseEventCalculator();
            }
        });
    }
}
