/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

//import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class WorkingWithFont {
    
    WorkingWithFont(){
        JFrame f = new JFrame("Working with Font");
        JLabel lblName = new JLabel("Name");
        Font ArialBlack = new Font("Arial BLack", Font.BOLD,24);
        lblName.setFont(ArialBlack);
        lblName.setBackground(new Color(45, 255, 80));
        lblName.setBounds(10,20,100,20);
        f.add(lblName);
        JTextField txtName = new JTextField();
        txtName.setBounds(120, 20, 200, 20);
        f.add(txtName);
        
        JLabel lblNewname = new JLabel("s'df/");
        lblNewname.setBounds(10, 50, 100, 30);
        Font preeti = new Font("preeti", Font.BOLD,24);
        lblNewname.setFont(preeti);
        f.add(lblNewname);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setBackground(new Color(123, 70, 89));
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(new Color(90, 194, 245));
        
        
    }
    
    public static void main(String args[]){
        
        new WorkingWithFont();
        
    }
    
}
