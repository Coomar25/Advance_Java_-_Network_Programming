/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dubby;

/**
 *
 * @author kumar
 */
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

public class DistinctionDataScienceStudents {
    public static void main(String[] args) {
        // Create a list of Student objects with dummy data
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "ram", "Undergraduate", "A", "Data Science"));
        students.add(new Student("2", "shyam", "Undergraduate", "B", "Computer "));
        students.add(new Student("3", "hari", "Graduate", "A", "Data Science"));
        students.add(new Student("4", "geeta", "Undergraduate", "A", "Data Science"));
        students.add(new Student("5", "sita", "Graduate", "B", "Computer"));

        // Filter and display students who have received a distinction and major in Data Science
        System.out.println("Students with Distinction in Data Science:");
        for (Student student : students) {
            if ("Data Science".equals(student.major) && "A".equals(student.division)) {
                System.out.println("Roll No: " + student.rollNo);
                System.out.println("Name: " + student.name);
                System.out.println("Level: " + student.level);
                System.out.println("Division: " + student.division);
                System.out.println("Major: " + student.major);
                System.out.println();
            }
        }
    }
}
