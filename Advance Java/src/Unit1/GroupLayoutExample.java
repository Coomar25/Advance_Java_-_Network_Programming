/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.Color;

import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class GroupLayoutExample {
    
    
    GroupLayoutExample(){
        
    JFrame  f = new JFrame("Group Layout");
    JPanel  p= new JPanel();
    GroupLayout l =new GroupLayout(p);
    p.setLayout(l);
    p.setBackground(Color.GRAY);
    f.add(p);
    l.setAutoCreateGaps(true);
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    l.setHorizontalGroup(l.createSequentialGroup()
    .addComponent(b1).addComponent(b2)
           .addGroup(l.createParallelGroup()
            .addComponent(b3).addComponent(b4)
    )
    );
    
    l.setVerticalGroup(l.createSequentialGroup()
    .addGroup(l.createParallelGroup()
    .addComponent(b1).addComponent(b2)
            .addComponent(b3)
    ).addComponent(b4)
    );
    f.setSize(300, 150);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
    }
    
    public static void main(String[] args){
        new GroupLayoutExample();
    }
       
}
