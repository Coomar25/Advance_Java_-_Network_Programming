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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField firstNumberField, secondNumberField, resultField;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));

        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        inputPanel.add(new JLabel("First :"));
        inputPanel.add(firstNumberField);
        inputPanel.add(new JLabel("Second :"));
        inputPanel.add(secondNumberField);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(resultField);

        addButton(buttonPanel, "+");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "/");

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addButton(Container container, String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(label);
            }
        });
        container.add(button);
    }

    private void performOperation(String operator) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Division by zero is not allowed.");
                        return;
                    }
                    break;
            }

            resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleCalculator();
            }
        });
    }
}
