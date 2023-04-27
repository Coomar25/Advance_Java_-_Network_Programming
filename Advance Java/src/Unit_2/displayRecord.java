package Unit_2;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayRecord{
    
    private JTextField txtRollno;
    private JTextField txtName;
    private JTextField txtLabel;
    private JTextField txtDivision;
    private JTextField txtResult;

public displayRecord(){
    JFrame f = new JFrame("Display Record");
    f.setSize(400, 500);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

        JLabel lblRollno = new JLabel("Rollno");
        lblRollno.setBounds(10, 10, 100, 20);
        f.add(lblRollno);

        txtRollno = new JTextField();
        txtRollno.setBounds(100, 10, 100, 20);
        f.add(txtRollno);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(10, 40, 100, 20);
        f.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(100, 40, 100, 20);
        f.add(txtName);
        
        JLabel lblLebel = new JLabel("Level");
        lblLebel.setBounds(10, 70, 100, 20);
        f.add(lblLebel);
        
        txtLabel =  new JTextField();
        txtLabel.setBounds(100, 70, 100, 20);
        f.add(txtLabel);
        
        JLabel lblDivison = new JLabel("Divison");
        lblDivison.setBounds(10, 100, 100, 20);
        f.add(lblDivison);
        
        txtDivision = new JTextField();
        txtDivision.setBounds(100, 100, 100, 20);
        f.add(txtDivision);  
        
        JButton btnDisplay = new JButton("Display");
        btnDisplay.setBounds(10, 130, 80, 20);
        f.add(btnDisplay);
        
        JButton btnInsert = new JButton("Insert");
        btnInsert.setBounds(100, 130, 80, 20);
        f.add(btnInsert);
        
        txtResult =  new JTextField();
        txtResult.setBounds(10, 160, 200, 200);
        f.add(txtResult);
        
       
        f.setVisible(true);
        
        
        btnInsert.addActionListener(new ActionListener(){
                     @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca",  "root", "");
                    
                    String str = "INSERT INTO displayrecord(ID, Rollno, Name, Level, Division) VALUES (NULL, ?,?,?,?)";
                    PreparedStatement ptmt = conn.prepareStatement(str);
                    ptmt.setInt(1, Integer.parseInt(txtRollno.getText()));
                    ptmt.setString(2, txtName.getText());
                    ptmt.setString(3, txtLabel.getText());
                    ptmt.setString(4, txtDivision.getText());
                    ptmt.executeUpdate();
                    
                    if(ptmt.getUpdateCount()>0){
                        JOptionPane.showMessageDialog(null, "Data Has Been Inserted Successfully");
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Failed in Data Insertion");
                    }
                    
                    conn.close();
                           
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        
        
        
        
    
}

public static void main(String[] args){
       new displayRecord();
}
}