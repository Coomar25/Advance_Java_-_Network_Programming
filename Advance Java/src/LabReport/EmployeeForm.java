import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class EmployeeForm extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField salaryField;
    private JButton insertButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private Map<String, Employee> employeeMap;

    public EmployeeForm() {
        setTitle("Employee Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        employeeMap = new HashMap<>();

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

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertEmployee();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployee();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchEmployee();
            }
        });

        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(salaryLabel);
        add(salaryField);
        add(insertButton);
        add(updateButton);
        add(deleteButton);
        add(searchButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void insertEmployee() {
        String id = idField.getText();
        String name = nameField.getText();
        String salaryText = salaryField.getText();

        try {
            double salary = Double.parseDouble(salaryText);
            Employee employee = new Employee(id, name, salary);
            employeeMap.put(id, employee);
            JOptionPane.showMessageDialog(this, "Employee inserted successfully.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid salary input.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateEmployee() {
        String id = idField.getText();
        String name = nameField.getText();
        String salaryText = salaryField.getText();

        if (!employeeMap.containsKey(id)) {
            JOptionPane.showMessageDialog(this, "Employee with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double salary = Double.parseDouble(salaryText);
            Employee employee = new Employee(id, name, salary);
            employeeMap.put(id, employee);
            JOptionPane.showMessageDialog(this, "Employee updated successfully.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid salary input.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteEmployee() {
        String id = idField.getText();

        if (!employeeMap.containsKey(id)) {
            JOptionPane.showMessageDialog(this, "Employee with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        employeeMap.remove(id);
        JOptionPane.showMessageDialog(this, "Employee deleted successfully.");
    }

    private void searchEmployee() {
        String id = idField.getText();

        if (!employeeMap.containsKey(id)) {
            JOptionPane.showMessageDialog(this, "Employee with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Employee employee = employeeMap.get(id);
        nameField.setText(employee.getName());
        salaryField.setText(String.valueOf(employee.getSalary()));
    }

    private static class Employee {
        private String id;
        private String name;
        private double salary;

        public Employee(String id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeForm::new);
    }
}
