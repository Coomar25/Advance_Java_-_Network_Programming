/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Programming;

/**
 *
 * @author ADMIN
 */
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
 
public class JTableExample { 
 JTableExample() 
 { 
JFrame f = new JFrame(); 
 f.setTitle("JTable Example"); 
 String[][] data = { 
 { "Rabin Shrestha", "BCA" }, 
 { "Suhana Baral","BIT" },
 {"Adarsha Parajuli","BSCCSIT"}
 }; 
 String[] columnNames = { "Name", "Department" }; 
 JTable j = new JTable(data, columnNames); 
 j.setBounds(30, 40, 200, 300); 
 JScrollPane sp = new JScrollPane(j); 
 f.add(sp); 
 f.setSize(500, 200); 
 f.setVisible(true); 
 } 
 public static void main(String[] args) 
 { 
 new JTableExample(); 
 } 
}
