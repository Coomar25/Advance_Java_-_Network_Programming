/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kumar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private String input = "";

    public CalculatorGUI() {
        setTitle("Basic Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789.".contains(command)) {
            input += command;
            textField.setText(input);
        } else if ("+-*/".contains(command)) {
            input += " " + command + " ";
            textField.setText(input);
        } else if ("=".equals(command)) {
            try {
                // Perform the calculation and display the result
                double result = evaluateExpression(input);
                textField.setText(Double.toString(result));
                input = Double.toString(result);
            } catch (Exception ex) {
                textField.setText("Error");
                input = "";
            }
        }
    }

    private double evaluateExpression(String expression) {
        // Implement the logic to evaluate the expression here
        // You may use libraries like javax.script.ScriptEngine for evaluation
        // Handle exceptions for invalid input or division by zero
        return 0.0; // Placeholder for the result
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setVisible(true);
        });
    }
}

