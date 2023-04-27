package Unit_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ScrollResultSetReadOnly {
    
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
            
            rs.first();
            System.out.println("\nFirst Record");
            System.out.println(rs.getInt(1) + " "+ rs.getInt(2) + " " + rs.getString(3)+ " " + rs.getString(4));
            
            rs.absolute(3);
            System.out.println("\nSecond Record");
            System.out.println(rs.getInt(1) + " "+ rs.getInt(2) + " " + rs.getString(3)+ " " + rs.getString(4));
            
            rs.last();
            System.out.println("\nThird Record");
            System.out.println(rs.getInt(1) + " "+ rs.getInt(2) + " " + rs.getString(3)+ " " + rs.getString(4));
            
            rs.previous();
            System.out.println("\nLast Record");
            System.out.println(rs.getInt(1) + " "+ rs.getInt(2) + " " + rs.getString(3)+ " " + rs.getString(4));
            
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
