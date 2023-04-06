/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;


import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Kumar Chaudhary
 */
public class odd_or_even {
    odd_or_even(){
        JFrame f = new JFrame(" Odd or Even");
        JLabel lblNumber = new JLabel("Enter a NUmber");
        lblNumber.setBounds(10,20,150,20);
        f.add(lblNumber);
        JTextField txtNumber = new JTextField();
        txtNumber.setBounds(150,20,150,20);
        f.add(txtNumber);
        JButton btnCheck = new JButton("Check");
        btnCheck.setBounds(80, 60, 80, 20);
        f.add(btnCheck);
        JLabel lblResult  = new JLabel(" ");
        lblResult.setBounds(70, 100, 150,20);
        f.add(lblResult);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        btnCheck.addActionListener( new ActionListener() 
        {
                public void actionPerformed(ActionEvent ae){
                    
                    int a = Integer.parseInt(txtNumber.getText());
                    if(a%2 == 0)
                        lblResult.setText(a + "is even number");
                    else
                        lblResult.setText(a + "odd Number");
                }
        }
        );
    } 
    
    
     public static void main(String[] args){
        new odd_or_even();
    }
    
  
    
}


