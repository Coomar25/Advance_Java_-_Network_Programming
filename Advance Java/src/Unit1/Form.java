package Unit1;
import javax.swing.*;
public class Form{
    Form()
    {
        JFrame f=new JFrame("From Design");
        
        JLabel lblName=new JLabel("Name");
        lblName.setBounds(10, 20, 100, 20);
        f.add(lblName);
        
        JTextField txtName=new JTextField();
        txtName.setBounds(100,20,100,20);
        f.add(txtName);
        
        JLabel lblAddress=new JLabel("Address");
        lblAddress.setBounds(10, 45, 100, 20);
        f.add(lblAddress);
        
        JTextField txtAddress=new JTextField();
        txtAddress.setBounds(100,45,100,20);
        f.add(txtAddress);
        
        JLabel lblSubjects=new JLabel("Subjects");
        lblSubjects.setBounds(10, 70, 100, 20);
        f.add(lblSubjects);
        
        JCheckBox cbAJP=new JCheckBox("Advanced Java Programming");
        cbAJP.setBounds(100, 70, 200, 20);
        f.add(cbAJP);
        
        JCheckBox cbAE=new JCheckBox("Applied Economics");
        cbAE.setBounds(100, 95, 200, 20);
        f.add(cbAE);
        
        JCheckBox cbNP=new JCheckBox("Network Programming");
        cbNP.setBounds(100, 120, 200, 20);
        f.add(cbNP);
        
        JCheckBox cbMP=new JCheckBox("Mobile Programming");
        cbMP.setBounds(100, 145, 200, 20);
        f.add(cbMP);
        
        JCheckBox cbDS=new JCheckBox("Distributed System");
        cbDS.setBounds(100, 175, 200, 20);
        f.add(cbDS);
        
        JLabel lblProgram = new JLabel("Program");
        lblProgram.setBounds(10, 195, 100, 20);
        f.add(lblProgram);
        
        
        JRadioButton b1 = new JRadioButton("BCA");
        b1.setBounds(100, 195, 70, 20);
        f.add(b1);
        b1.setSelected(true);
        
        JRadioButton b2 = new JRadioButton("CSIT");
        b2.setBounds(170, 195, 80, 20);
        f.add(b2);
        
        JRadioButton b3 = new JRadioButton("BIT");
        b3.setBounds(250, 195,70,20);
        f.add(b3);
        
        ButtonGroup program = new ButtonGroup();
        program.add(b1);
        program.add(b2);
        program.add(b3);
        
        JLabel lblCollege = new JLabel("College");
       lblCollege.setBounds(10, 220, 100, 20);
        f.add(lblCollege);
       
       String c[] = { "Sungava College", "Birendra Multiple Campus", "Indreni College", "Saheed smriti colllege", "Saptagandaki"};
       JComboBox cbCollege = new JComboBox(c);
       cbCollege.setBounds(110, 220, 200, 20);
       f.add(cbCollege);
       
       JButton btnOk = new JButton("Ok");
       btnOk.setBounds(60, 270, 60,20);
       f.add(btnOk);
       JButton btnCancel = new JButton("Cancel");
       btnCancel.setBounds(140, 270, 90, 20);
       f.add(btnCancel);
        
        f.setSize(400,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Form();
    }
}