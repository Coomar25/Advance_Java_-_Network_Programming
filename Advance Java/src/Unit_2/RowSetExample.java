/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit_2;
import java.sql.*;
import javax.sql.RowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;


/**
 *
 * @author ADMIN
 */
public class RowSetExample {
    
    public static void main(String args[]){
        try{
            RowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            String mysqlUrl = "jdbc:mysql://localhost:3306/bca";
            rowSet.setUrl(mysqlUrl);
            rowSet.setUsername("root");
            rowSet.setPassword("");
            rowSet.setCommand(" select * from tblStudent ");
            rowSet.execute();
            System.out.println("Content of the table");
            While(rowSet.next()){
            System.out.println(rowSet.getInt(2)+ " "+ rowSet.getString(3)+ " "  +rowSet.getString(4));
        }
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
 
}}
}
}
