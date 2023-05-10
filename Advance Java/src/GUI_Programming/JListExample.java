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
public class JListExample 
{ 
 JListExample(){ 
 JFrame f= new JFrame(“JList Example”); 
 DefaultListModel<String> l1 = new DefaultListModel<>(); 
 l1.addElement("Circket"); 
 l1.addElement("Football"); 
 l1.addElement("Volleyball"); 
 l1.addElement("TableTenis"); 
 JList<String> list = new JList<>(l1); 
 list.setBounds(100,100,75,75); 
 f.add(list); 
 f.setSize(400,400); 
 f.setLayout(null); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
 } 
public static void main(String args[]) 
 { 
 new JListExample(); 
 }
} 
