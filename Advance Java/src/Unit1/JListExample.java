/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import javax.swing.*;
import javax.swing.JFrame;



/**
 *
 * @author ADMIN
 */
public class JListExample {
    
    
    JListExample(){
        
    JFrame f= new JFrame("List Example");
    DefaultListModel<String> l = new DefaultListModel<>();

    l.addElement("Cricket");
    l.addElement("FOotball");
    l.addElement("game");
    JList<String>list = new JList(l);
    list.setBounds(100,20, 150, 150);
    f.add(list);
    f.setSize(400,500);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
   
    }
    
    public static void main(String[] args){
 
   new JListExample();
        
        
    }
    

    
    
    
}
