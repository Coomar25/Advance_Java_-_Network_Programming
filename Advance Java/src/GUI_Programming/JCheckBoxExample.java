/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Programming;

/**
 *
 * @author ADMIN
 */
import javax.swing.*; 
public class JCheckBoxExample 
{ 
 JCheckBoxExample(){ 
 JFrame f= new JFrame("CheckBox Example"); 
 JCheckBox checkBox1 = new JCheckBox("C++"); 
 checkBox1.setBounds(100,50, 200,50); 
 JCheckBox checkBox2 = new JCheckBox("Java"); 
 checkBox2.setBounds(100,100, 200,50); 
 JCheckBox checkBox3 = new JCheckBox("Web Technology"); 
 checkBox3.setBounds(100,150, 200,50); 
 JCheckBox checkBox4 = new JCheckBox("SAD"); 
 checkBox4.setBounds(100,200, 200,50); 
 f.add(checkBox1); 
 f.add(checkBox2); 
 f.add(checkBox3); 
 f.add(checkBox4); 
 f.setSize(400,400); 
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
 } 
public static void main(String args[]) 
 { 
 new JCheckBoxExample(); 
 }
}