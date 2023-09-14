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

public class FactorialCalculator extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        add(inputLabel);
        add(inputField);
        add(calculateButton);
        add(resultLabel);
    }

    private void calculateFactorial() {
        String inputText = inputField.getText();
        try {
            int n = Integer.parseInt(inputText);
            long factorial = calculateRecursiveFactorial(n);
            resultLabel.setText("Factorial of " + n + " is " + factorial);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    private long calculateRecursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateRecursiveFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
                FactorialCalculator calculator = new FactorialCalculator();
                calculator.setVisible(true);
    }
}

