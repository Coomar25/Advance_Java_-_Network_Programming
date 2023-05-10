/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Programming;

/**
 *
 * @author ADMIN
 */
import java.awt.*; 
import javax.swing.*; 
 
public class MyFlowLayout
{ 
MyFlowLayout()
{ 
  JFrame f=new JFrame();
 JButton b1=new JButton("OK"); 
 JButton b2=new JButton("Cancel"); 
 f.add(b1);
 f.add(b2); 
 f.setLayout(new FlowLayout(FlowLayout.LEFT)); 
 f.setSize(300,300); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
} 
public static void main(String[] args) 
{ 
 new MyFlowLayout(); 
} 
} 