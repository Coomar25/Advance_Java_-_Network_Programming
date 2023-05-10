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
class JPanelExample extends JFrame{ 
 static JFrame f;
 static JButton b,b1,b2;
 public static void main(String[] args) 
 { 
 f=new JFrame("panel");
  f.setSize(400,500);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JPanel p=new JPanel();
  p.setBounds(40,80,300,300); 
 p.setBackground(Color.red);
  b=new JButton("Bibas");
 p.add(b);
 b1=new JButton("Asha");
 p.add(b1);
  b2=new JButton("Rojana");
 p.add(b2);
 f.add(p);
 f.setVisible(true);
 } 
 } 
