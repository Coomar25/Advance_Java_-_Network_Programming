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

public class LoginForm extends JFrame implements ActionListener {
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JComboBox<String> accountTypeComboBox;
    private JButton okButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel userIdLabel = new JLabel("User ID:");
        userIdField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel accountTypeLabel = new JLabel("Account Type:");
        String[] accountTypes = {"Admin", "User"};
        accountTypeComboBox = new JComboBox<>(accountTypes);
        okButton = new JButton("OK");

        okButton.addActionListener(this);

        panel.add(userIdLabel);
        panel.add(userIdField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(accountTypeLabel);
        panel.add(accountTypeComboBox);
        panel.add(new JLabel()); // Empty cell for spacing
        panel.add(okButton);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        String userId = userIdField.getText();
        String password = new String(passwordField.getPassword());
        String accountType = (String) accountTypeComboBox.getSelectedItem();

        // Perform validation and authentication logic here
        // For demonstration purposes, we'll just display the input values.
        JOptionPane.showMessageDialog(this,
                "User ID: " + userId + "\nPassword: " + password + "\nAccount Type: " + accountType,
                "Login Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        });
    }
}

