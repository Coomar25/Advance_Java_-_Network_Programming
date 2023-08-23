package LabReport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    // Components
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JComboBox<String> accountTypeComboBox;
    private JButton okButton;

    // Constructor
    public LoginForm() {
        // Set frame properties
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        userIdField = new JTextField(15);
        passwordField = new JPasswordField(15);
        String[] accountTypes = {"Admin", "User"};
        accountTypeComboBox = new JComboBox<>(accountTypes);
        okButton = new JButton("OK");

        // Add action listener to the OK button
        okButton.addActionListener(this);

        // Create the form layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));
        panel.add(new JLabel("User ID:"));
        panel.add(userIdField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel("Account Type:"));
        panel.add(accountTypeComboBox);
        panel.add(okButton);

        // Add the panel to the frame
        add(panel);

        // Show the form
        setVisible(true);
    }

    // Action listener for the OK button
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String userId = userIdField.getText();
            String password = new String(passwordField.getPassword());
            String accountType = (String) accountTypeComboBox.getSelectedItem();

            // Simple validation - check if user ID and password are not empty
            if (!userId.isEmpty() && !password.isEmpty()) {
                // Perform login logic here
                // For simplicity, let's just display the input values
                JOptionPane.showMessageDialog(this,
                        "User ID: " + userId + "\nPassword: " + password + "\nAccount Type: " + accountType,
                        "Login Successful",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Please enter User ID and Password.",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginForm::new);
    }
}
