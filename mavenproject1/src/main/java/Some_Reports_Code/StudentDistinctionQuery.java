/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Some_Reports_Code;

/**
 *
 * @author kumar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDistinctionQuery {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/College"; // Change this URL to your database connection URL
        String username = "root"; // Change to your database username
        String password = ""; // Change to your database password

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // SQL query to retrieve students with distinction in Data Science
            String sqlQuery = "SELECT Rollno, Name, Level, Division, Major FROM Students " +
                              "WHERE Level = 'Distinction' AND Major = 'Data Science'";

            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Display the results
            System.out.println("Students with Distinction in Data Science:");
            System.out.println("Rollno\tName\tLevel\tDivision\tMajor");
            while (resultSet.next()) {
                int rollno = resultSet.getInt("Rollno");
                String name = resultSet.getString("Name");
                String level = resultSet.getString("Level");
                String division = resultSet.getString("Division");
                String major = resultSet.getString("Major");

                System.out.println(rollno + "\t" + name + "\t" + level + "\t" + division + "\t" + major);
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

