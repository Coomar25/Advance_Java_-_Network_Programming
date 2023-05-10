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
public class JButtonExample { 
public static void main(String[] args) { 
 JFrame f=new JFrame("Button Example"); 
 JButton b1=new JButton("Ok");
 JButton b2=new JButton("Cancel");
 b1.setBounds(50,100,95,30); 
 b2.setBounds(150,100,95,30);
 f.add(b1);
 f.add(b2);
 f.setSize(400,400); 
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
} 
}