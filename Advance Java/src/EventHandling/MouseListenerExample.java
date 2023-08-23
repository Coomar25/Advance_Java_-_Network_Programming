/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;

/**
 *
 * @author ADMIN
 */
import java.awt.*; 
import java.awt.event.*; 
public class MouseListenerExample extends Frame implements 
MouseListener{ 
 Label l; 
 MouseListenerExample(){ 
 addMouseListener(this); 
 
 l=new Label(); 
 l.setBounds(20,50,100,20); 
 add(l); 
 setSize(300,300); 
 setLayout(null); 
 setVisible(true); 
 } 
 @Override
 public void mouseClicked(MouseEvent e) { 
 l.setText("Mouse Clicked"); 
 } 
 @Override
 public void mouseEntered(MouseEvent e) { 
 l.setText("Mouse Entered"); 
 } 
 @Override
 public void mouseExited(MouseEvent e) { 
 l.setText("Mouse Exited"); 
 } 
 @Override
 public void mousePressed(MouseEvent e) { 
 l.setText("Mouse Pressed"); 
 } 
 @Override
 public void mouseReleased(MouseEvent e) { 
 l.setText("Mouse Released"); 
 } 
public static void main(String[] args) { 
     MouseListenerExample mouseListenerExample = new MouseListenerExample(); 
} 
} 
