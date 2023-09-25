/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

/**
 *
 * @author kumar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManagementSystem extends JFrame {
    private List<Employee> employees = new ArrayList<>();
    private JTextField idField, nameField, salaryField;
    private JTextArea outputArea;

    public EmployeeManagementSystem() {
        setTitle("Employee Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Employee ID:"));
        idField = new JTextField();
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        inputPanel.add(salaryField);

        JButton insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertEmployee();
            }
        });

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployee();
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee();
            }
        });

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchEmployee();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(insertButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(searchButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);
    }

    private void insertEmployee() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        double salary = Double.parseDouble(salaryField.getText());
        employees.add(new Employee(id, name, salary));
        clearFields();
        displayEmployees();
    }

    private void updateEmployee() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        double salary = Double.parseDouble(salaryField.getText());

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee = new Employee(id, name, salary);
                clearFields();
                displayEmployees();
                return;
            }
        }
        outputArea.setText("Employee with ID " + id + " not found.");
    }

    private void deleteEmployee() {
        int id = Integer.parseInt(idField.getText());

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                clearFields();
                displayEmployees();
                return;
            }
        }
        outputArea.setText("Employee with ID " + id + " not found.");
    }

    private void searchEmployee() {
        int id = Integer.parseInt(idField.getText());

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                idField.setText(String.valueOf(employee.getId()));
                nameField.setText(employee.getName());
                salaryField.setText(String.valueOf(employee.getSalary()));
                return;
            }
        }
        clearFields();
        outputArea.setText("Employee with ID " + id + " not found.");
    }

    private void displayEmployees() {
        outputArea.setText("Employee List:\n");
        for (Employee employee : employees) {
            outputArea.append("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary() + "\n");
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        salaryField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EmployeeManagementSystem ems = new EmployeeManagementSystem();
                ems.setVisible(true);
            }
        });
    }
}

