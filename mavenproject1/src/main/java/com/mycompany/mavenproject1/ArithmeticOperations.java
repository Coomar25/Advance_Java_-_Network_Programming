/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kumar
 */
import java.awt.*;
import java.awt.event.*;

public class ArithmeticOperations extends Frame {

    private TextField firstNumber, secondNumber, result;
    private Button add, subtract, multiply, divide;

    public ArithmeticOperations() {
        setTitle("Arithmetic Operations");
        setLayout(new FlowLayout());

        firstNumber = new TextField(10);
        add(firstNumber);

        secondNumber = new TextField(10);
        add(secondNumber);

        result = new TextField(10);
        result.setEditable(false);
        add(result);

        add = new Button("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNumberInt = Integer.parseInt(firstNumber.getText());
                int secondNumberInt = Integer.parseInt(secondNumber.getText());
                int sum = firstNumberInt + secondNumberInt;
                result.setText(String.valueOf(sum));
            }
        });
        add(add);

        subtract = new Button("Subtract");
        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNumberInt = Integer.parseInt(firstNumber.getText());
                int secondNumberInt = Integer.parseInt(secondNumber.getText());
                int difference = firstNumberInt - secondNumberInt;
                result.setText(String.valueOf(difference));
            }
        });
        add(subtract);

        multiply = new Button("Multiply");
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNumberInt = Integer.parseInt(firstNumber.getText());
                int secondNumberInt = Integer.parseInt(secondNumber.getText());
                int product = firstNumberInt * secondNumberInt;
                result.setText(String.valueOf(product));
            }
        });
        add(multiply);

        divide = new Button("Divide");
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNumberInt = Integer.parseInt(firstNumber.getText());
                int secondNumberInt = Integer.parseInt(secondNumber.getText());
                double quotient = (double) firstNumberInt / secondNumberInt;
                result.setText(String.valueOf(quotient));
            }
        });
        add(divide);

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ArithmeticOperations();
    }
}
