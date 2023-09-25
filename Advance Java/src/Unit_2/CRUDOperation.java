package Unit_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


public class CRUDOperation {
    private JTextField txtRollno;
    private JTextField txtName;
    private JTextField txtAddress;

    public CRUDOperation() {
        JFrame f = new JFrame("CRUD Operation");
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

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(10, 70, 100, 20);
        f.add(lblAddress);

        txtAddress = new JTextField();
        txtAddress.setBounds(100, 70, 100, 20);
        f.add(txtAddress);

        JButton btnInsert = new JButton("Insert");
        btnInsert.setBounds(10, 120, 80, 20);
        f.add(btnInsert);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(100, 120, 80, 20);
        f.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(190, 120, 80, 20);
        f.add(btnDelete);

        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(280, 120, 80, 20);
        f.add(btnSearch);

        f.setVisible(true);

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bca", "root", "");

                    String str = "INSERT INTO employee(ID, name, salary) VALUES(NULL,?,?,?)";
                    PreparedStatement ptmt = conn.prepareStatement(str);
                    ptmt.setInt(1, Integer.parseInt(txtRollno.getText()));
                    ptmt.setString(2, txtName.getText());
                    ptmt.setString(3, txtAddress.getText());
                    ptmt.executeUpdate();

                    if (ptmt.getUpdateCount() > 0) {
                            JOptionPane.showMessageDialog(null, "Data inserted successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data not inserted");
                    }
                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        
  

btnSearch.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");

            String str2 = "SELECT * FROM tblStudent WHERE Rollno=?";
            PreparedStatement ptmt2 = conn.prepareStatement(str2);
            ptmt2.setInt(1, Integer.parseInt(txtRollno.getText()));
            ResultSet rs = ptmt2.executeQuery();
            if (rs.next()) {
                txtName.setText(rs.getString("Name"));
                txtAddress.setText(rs.getString("Address"));
            } else {
                txtName.setText("");
                txtAddress.setText("");
                JOptionPane.showMessageDialog(null, "Data not found");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
});


btnUpdate.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");

            String str = "update tblStudent set Rollno=?, Name=?, Address=? where Rollno=?";
            PreparedStatement ptmt = conn.prepareCall(str);
            ptmt.setInt(1, Integer.parseInt(txtRollno.getText()));
            ptmt.setString(2, txtName.getText());
            ptmt.setString(3, txtAddress.getText());
            ptmt.setString(4, txtRollno.getText());
            ptmt.executeUpdate();

            if (ptmt.getUpdateCount() > 0) {
                JOptionPane.showMessageDialog(null, "Data updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data not found");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
});

btnDelete.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
        
        try {
                
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            
            String str = "DELETE FROM   tblStudent Where Rollno=?";
            PreparedStatement ptmt  = conn.prepareStatement(str);
            ptmt.setInt(1, Integer.parseInt(txtRollno.getText()));
            
            int rowsDeleted = ptmt.executeUpdate();
            if(rowsDeleted>0){
             JOptionPane.showMessageDialog(null, "Data deleted successfully");
             txtName.setText("");
             txtAddress.setText("");
             
        }else{
                JOptionPane.showMessageDialog(null, "Date not found");
            }
            
            conn.close();
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
});    
    }

    public static void main(String[] args) {
        new CRUDOperation();
    }
}
