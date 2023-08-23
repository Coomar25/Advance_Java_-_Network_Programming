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
class KeyListenerExample extends Frame implements KeyListener {
 Label l;
 TextArea area;
 KeyListenerExample()
 {
 l=new Label();
 l.setBounds(20,50,100,20);
 area=new TextArea();
 area.setBounds(20,80,300,300);
 area.addKeyListener(this);
 add(l);
 add(area);
 setTitle("Key Event");
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 }
 @Override
 public void keyPressed(KeyEvent e)
 {
 l.setText("Key Pressed");
 }
 @Override
 public void keyReleased(KeyEvent e) {
 l.setText("Key Released");
 }
 @Override
 public void keyTyped(KeyEvent e)
 {
 l.setText("Key Typed");
 }
 public static void main(String[] args)
 {
 new KeyListenerExample();
 }
}

