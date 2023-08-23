import javax.swing.*;
import java.awt.*;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class AuthenticationExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Authentication Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> authenticate(usernameField.getText(), new String(passwordField.getPassword())));

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(loginButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void authenticate(String username, String password) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });

        // Simulate accessing a secured resource
        // For a real use case, you might make a network request here
        try {
            java.net.URL url = new java.net.URL("http://www.example.com");
            url.openConnection().connect();
            System.out.println("Authentication successful!");
        } catch (java.io.IOException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
