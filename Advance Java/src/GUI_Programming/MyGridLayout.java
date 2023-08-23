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
public class MyGridLayout{ 
JFrame f; 
MyGridLayout(){ 
 f=new JFrame("GridLayout"); 
 JButton b1=new JButton("Button 1"); 
 JButton b2=new JButton("Button 2"); 
 JButton b3=new JButton("Button 3"); 
 JButton b4=new JButton("Button 4"); 
 JButton b5=new JButton("Button 5"); 
 JButton b6=new JButton("Button 6"); 
 JButton b7=new JButton("Button 7"); 
 JButton b8=new JButton("Buttton 8"); 
 JButton b9=new JButton("Button 9"); 
 f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5); 
 f.add(b6);f.add(b7);f.add(b8);f.add(b9); 
 f.setLayout(new GridLayout(3,3)); 
 f.setSize(300,300);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
} 
public static void main(String[] args) { 
 new MyGridLayout(); 
} 
} 
