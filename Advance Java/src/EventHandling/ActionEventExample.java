/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventExample extends JFrame implements ActionListener
{
 private int count=0;
 JLabel lblData;
 EventExample()
 {
 setLayout(new FlowLayout());
 {
 lblData=new JLabel("Button clicked 0 times");
 JButton btnClick=new JButton("Click Me");
 btnClick.addActionListener(this);
 add(lblData);
add(btnClick);
 }
 }
 @Override
 public void actionPerformed(ActionEvent e)
 {
 count++;
 lblData.setText("Button Clicked "+count+" Times ");
 }
}
public class ActionEventExample {
 public static void main(String[] args)
 { 
 EventExample frame=new EventExample();
 frame.setTitle("Action Event");
 frame.setSize(300,100);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 } 
}
