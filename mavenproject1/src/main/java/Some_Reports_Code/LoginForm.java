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

public class LoginForm extends JFrame {
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JComboBox<String> accountTypeComboBox;
    private JButton okButton;

    public LoginForm() {
        // Set frame properties
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        userIdField = new JTextField(20);
        passwordField = new JPasswordField(20);
        accountTypeComboBox = new JComboBox<>(new String[]{"admin", "user"});
        okButton = new JButton("OK");

        // Create a panel for the form
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("User ID:"));
        panel.add(userIdField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel("Account Type:"));
        panel.add(accountTypeComboBox);
        panel.add(new JLabel());
        panel.add(okButton);

        // Add an action listener to the OK button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                String password = new String(passwordField.getPassword());
                String accountType = (String) accountTypeComboBox.getSelectedItem();

                // Perform login validation here
                if (isValidLogin(userId, password, accountType)) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login failed. Please check your credentials.");
                }
            }
        });

        // Add the panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    private boolean isValidLogin(String userId, String password, String accountType) {
        // Perform your login validation logic here
        // For this example, we'll assume a valid login is admin/admin or user/user
        return ("admin".equals(userId) && "admin".equals(password) && "admin".equals(accountType))
                || ("user".equals(userId) && "user".equals(password) && "user".equals(accountType));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm();
            }
        });
    }
}
