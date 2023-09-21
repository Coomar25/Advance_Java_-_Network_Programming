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
import java.util.ArrayList;
import java.util.List;

class Student {
    String rollNo;
    String name;
    String level;
    String division;
    String major;

    public Student(String rollNo, String name, String level, String division, String major) {
        this.rollNo = rollNo;
        this.name = name;
        this.level = level;
        this.division = division;
        this.major = major;
    }
}

public class DistinctionDataScienceStudentsGUI extends JFrame {
    private JTextArea resultTextArea;

    public DistinctionDataScienceStudentsGUI() {
        setTitle("Students with Distinction in Data Science");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        add(scrollPane);

        displayFilteredStudents();
    }

    private void displayFilteredStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "John", "Undergraduate", "A", "Data Science"));
        students.add(new Student("2", "Alice", "Undergraduate", "B", "Computer Science"));
        students.add(new Student("3", "Bob", "Graduate", "A", "Data Science"));
        students.add(new Student("4", "Eve", "Undergraduate", "A", "Data Science"));
        students.add(new Student("5", "Mike", "Graduate", "B", "Computer Science"));

        resultTextArea.append("Students with Distinction in Data Science:\n\n");

        for (Student student : students) {
            if ("Data Science".equals(student.major) && "A".equals(student.division)) {
                resultTextArea.append("Roll No: " + student.rollNo + "\n");
                resultTextArea.append("Name: " + student.name + "\n");
                resultTextArea.append("Level: " + student.level + "\n");
                resultTextArea.append("Division: " + student.division + "\n");
                resultTextArea.append("Major: " + student.major + "\n");
                resultTextArea.append("\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DistinctionDataScienceStudentsGUI().setVisible(true);
        });
    }
}
