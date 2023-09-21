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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeForm extends JFrame {
    private JTextField id, name, salary;
    private JButton insert, update, delete, search;
    private Map<Integer, Employee> employees = new HashMap<>();
    
    public EmployeeForm() {
        setTitle("Employee Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        id = new JTextField();
        name = new JTextField();
        salary = new JTextField();

        insert = createButton("Insert");
        update = createButton("Update");
        delete = createButton("Delete");
        search = createButton("Search");

        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(new JLabel("ID:"));
        panel.add(id);
        panel.add(new JLabel("Name:"));
        panel.add(name);
        panel.add(new JLabel("Salary:"));
        panel.add(salary);
        panel.add(insert);
        panel.add(update);
        panel.add(delete);
        panel.add(search);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(label);
            }
        });
        return button;
    }

    private void performOperation(String operation) {
        int employeeId = Integer.parseInt(id.getText());

        if (operation.equals("Insert")) {
            employees.put(employeeId, new Employee(name.getText(), Double.parseDouble(salary.getText())));
        } else if (operation.equals("Update")) {
            if (employees.containsKey(employeeId)) {
                employees.get(employeeId).setName(name.getText());
                employees.get(employeeId).setSalary(Double.parseDouble(salary.getText()));
            }
        } else if (operation.equals("Delete")) {
            employees.remove(employeeId);
        } else if (operation.equals("Search")) {
            if (employees.containsKey(employeeId)) {
                name.setText(employees.get(employeeId).getName());
                salary.setText(String.valueOf(employees.get(employeeId).getSalary()));
            } else {
                name.setText("");
                salary.setText("");
                JOptionPane.showMessageDialog(this, "Employee not found.");
            }
        }

        id.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeForm());
    }

    private class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
}

