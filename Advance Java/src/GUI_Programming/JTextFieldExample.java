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
class JTextFieldExample 
{ 
public static void main(String args[]) 
 { 
 JFrame f= new JFrame("TextField Example"); 
  f.setSize(400,400); 
 f.setLayout(null); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JTextField t1=new JTextField(); 
 t1.setBounds(50,100, 200,30); 
  f.add(t1);
JTextField t2=new JTextField("Bharatpur"); 
 t2.setBounds(50,150, 200,30); 
 f.add(t2); 
 f.setVisible(true); 
 } 
 }