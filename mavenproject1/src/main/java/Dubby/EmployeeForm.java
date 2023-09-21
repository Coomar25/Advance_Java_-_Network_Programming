/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dubby;

/**
 *
 * @author kumar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeForm extends JFrame implements ActionListener {
    // GUI Components
    private JTextField idField, nameField, salaryField;
    private JButton insertButton, updateButton, deleteButton, searchButton;

    private JLabel idValueLabel, nameValueLabel, salaryValueLabel;

    public EmployeeForm() {
        // Set up the JFrame
        setTitle("Employee Management System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add components to the JFrame
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        JLabel idLabel = new JLabel("Employee ID:");
        idField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField();

        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        searchButton = new JButton("Search");

        // Add action listeners to buttons
        insertButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        searchButton.addActionListener(this);

        // Add components to the panel
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(insertButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(searchButton);

        // Create a panel to display employee information
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 2));
        JLabel idInfoLabel = new JLabel("Employee ID:");
        idValueLabel = new JLabel("");
        JLabel nameInfoLabel = new JLabel("Name:");
        nameValueLabel = new JLabel("");
        JLabel salaryInfoLabel = new JLabel("Salary:");
        salaryValueLabel = new JLabel("");

        infoPanel.add(idInfoLabel);
        infoPanel.add(idValueLabel);
        infoPanel.add(nameInfoLabel);
        infoPanel.add(nameValueLabel);
        infoPanel.add(salaryInfoLabel);
        infoPanel.add(salaryValueLabel);

        // Add panels to the frame
        add(panel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.CENTER);

        // Display the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == insertButton) {
            // Implement insert operation
            idValueLabel.setText(idField.getText());
            nameValueLabel.setText(nameField.getText());
            salaryValueLabel.setText(salaryField.getText());
        } else if (e.getSource() == updateButton) {
            // Implement update operation
            // You can update the displayed data here
        } else if (e.getSource() == deleteButton) {
            // Implement delete operation
            idValueLabel.setText("");
            nameValueLabel.setText("");
            salaryValueLabel.setText("");
        } else if (e.getSource() == searchButton) {
            // Implement search operation
            // You can search for and display employee data here
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmployeeForm();
        });
    }
}

