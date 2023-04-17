/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class KeyEventExample implements KeyListener {
    
    JTextArea txt;
    JLabel lbl;
    
    KeyEventExample(){
        JFrame f = new JFrame("Key Event Example Just like Hover Effect");
        txt = new JTextArea();
        txt.setBounds(10, 10, 100, 40);
        txt.addKeyListener(this);
        f.add(txt);
        lbl  = new JLabel(" ");
        lbl.setBounds(150,10,100,20);
        f.add(lbl);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     lbl.setText("Key is typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        lbl.setText("key is pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   lbl.setText("key is released");
    }
    
    
    public static void main(String[] args){
        new KeyEventExample();
    }
    
}
