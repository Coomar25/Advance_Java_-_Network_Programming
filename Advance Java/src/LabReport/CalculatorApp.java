import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
    // Components
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    // Constructor
    public CalculatorApp() {
        // Set frame properties
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        // Add action listeners to the buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // Create the form layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));
        panel.add(new JLabel("First Number:"));
        panel.add(firstNumberField);
        panel.add(new JLabel("Second Number:"));
        panel.add(secondNumberField);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        // Add the panel to the frame
        add(panel);

        // Show the form
        setVisible(true);
    }

    // Action listener for the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, result;
        try {
            num1 = Double.parseDouble(firstNumberField.getText());
            num2 = Double.parseDouble(secondNumberField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Invalid input! Please enter valid numbers.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(this,
                        "Cannot divide by zero!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            result = num1 / num2;
        } else {
            return; // Do nothing if no button is matched
        }

        // Display the result in the resultField
        resultField.setText(String.valueOf(result));
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorApp::new);
    }
}

 *
 * @author ADMIN
 */
public class CalculatorApp {
    
}
