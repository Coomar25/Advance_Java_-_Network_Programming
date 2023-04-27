/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */

package Unit_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ScrollResultSetUpdate {
    
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            String str= "select * from tblStudent";
            PreparedStatement ptmt = conn.prepareStatement (str, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ptmt.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getInt(1) + " "+ rs.getInt(2) + " " + rs.getString(3)+ " " + rs.getString(4));
            }
            
          rs.moveToInsertRow();
          rs.updateInt("Rolno", 101);
          rs.updateString("Name",  "coomar");
          rs.updateString("Address",  "chitwan");
          rs.insertRow();
          rs.absolute(3);
          rs.deleteRow();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
