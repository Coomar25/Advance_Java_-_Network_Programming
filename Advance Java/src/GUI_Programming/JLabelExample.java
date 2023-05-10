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
class JLabelExample 
{ 
public static void main(String args[]) 
 { 
 JFrame f= new JFrame("Label Example"); 
  f.setSize(300,300); 
 f.setLayout(null); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JLabel l1=new JLabel("First Label."); 
  l1.setBounds(50,50, 100,30); 
   f.add(l1);
 JLabel l2=new JLabel("Second Label."); 
 l2.setBounds(50,100, 100,30); 
 f.add(l2); 
 f.setVisible(true); 
 } 
 }