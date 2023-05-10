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
public class JComboBoxExample {
 JFrame f;
 JComboBoxExample() {
 f = new JFrame("ComboBox Example");
 String p[] = {"BCA", "BIT", "BSCCSIT", "BE Computer", 
"BIM",};
 JComboBox cb = new JComboBox(p);
 cb.setBounds(50, 50, 90, 20);
 f.add(cb);
 f.setLayout(null);
 f.setSize(400, 500);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true);
 }
 public static void main(String[] args) {
 new JComboBoxExample();
 }
}
