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

public class EmployeeInfoGUI extends JFrame {
    public EmployeeInfoGUI() {
        // Set up the JFrame
        setTitle("Employee Information");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the labels
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Dummy data
        String employeeID = "EMP001";
        String employeeName = "John Doe";
        String employeeSalary = "$50,000.00";

        // Create labels and add them to the panel
        JLabel idLabel = new JLabel("Employee ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel salaryLabel = new JLabel("Salary:");

        JLabel idValueLabel = new JLabel(employeeID);
        JLabel nameValueLabel = new JLabel(employeeName);
        JLabel salaryValueLabel = new JLabel(employeeSalary);

        panel.add(idLabel);
        panel.add(idValueLabel);
        panel.add(nameLabel);
        panel.add(nameValueLabel);
        panel.add(salaryLabel);
        panel.add(salaryValueLabel);

        // Add the panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmployeeInfoGUI();
        });
    }
}
