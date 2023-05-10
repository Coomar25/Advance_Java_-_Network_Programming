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
public class FrameByInheritance extends JFrame //inheriting JFrame 
{ 
JFrame f; 
FrameByInheritance()
{ 
setSize(400,500); 
setLayout(null); 
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
public static void main(String[] args) { 
new FrameByInheritance(); 
}
}
