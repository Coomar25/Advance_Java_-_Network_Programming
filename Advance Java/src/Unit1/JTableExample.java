/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.Font;
import javax.swing.*;



/**
 *
 * @author ADMIN
 */
public class JTableExample {
    
    
    JTableExample(){
        JFrame f = new JFrame("JTable Example");
            String[][] data ={
                {"Tara aryal", "BCA"},
                {"Coomar", "BIT"},
                {"Binod", "SCIT"}
            };
            
            String[] columnNames = {"Name", "Department"};
            Font font =new Font("Times New Roman", Font.BOLD,12);
            JTable tbl =new JTable(data, columnNames);
            JScrollPane sp =new JScrollPane(tbl);
            tbl.getTableHeader().setFont(font);
            sp.setBounds(10,20,200,100);
            f.add(sp);
            f.setSize(400, 500);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);

        }
            public static void main(String[] args){
                new JTableExample();
            }
    }
    
    

