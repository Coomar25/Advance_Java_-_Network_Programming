package Registration_Form;
import javax.swing.*;

public class Registration_Form{
    Registration_Form()
    {
        JFrame f=new JFrame("From Design");
        
        JLabel lblName=new JLabel("Name");
        lblName.setBounds(50, 50, 100, 20);
        f.add(lblName);
        
        JTextField txtName=new JTextField();
        txtName.setBounds(150,50,200,20);
        f.add(txtName);
        
        JLabel lblAddress=new JLabel("Address");
        lblAddress.setBounds(50, 80, 100, 20);
        f.add(lblAddress);
        
        JTextField txtAddress=new JTextField();
        txtAddress.setBounds(150,80,200,20);
        f.add(txtAddress);
        
        JLabel lblSubjects=new JLabel("Subjects");
        lblSubjects.setBounds(50, 110, 100, 20);
        f.add(lblSubjects);
        
        JCheckBox cbAJP=new JCheckBox("Advanced Java Programming");
        cbAJP.setBounds(150, 110, 200, 20);
        f.add(cbAJP);
        
       JCheckBox cbAE=new JCheckBox("Applied Economics");
       cbAE.setBounds(150, 140, 200, 20);
       f.add(cbAE);
       
       JCheckBox cbNP = new JCheckBox("Network Programming");
       cbNP.setBounds(150, 170,  200, 20);
       f.add(cbNP);
       
       JCheckBox cbMP = new JCheckBox("Mobile Programming");
       cbMP.setBounds(150, 200, 200, 20);
       f.add(cbMP);
        

        JCheckBox cbDS=new JCheckBox("Distributed System");
        cbDS.setBounds(150, 230, 200, 20);
        f.add(cbDS);
        
        JLabel lblProgram = new JLabel("Program");
        lblProgram.setBounds(50, 260, 100, 20);
        f.add(lblProgram);
        
        JRadioButton b1 = new JRadioButton("BCA");
        b1.setBounds(150, 260, 60, 20);
        f.add(b1);
        b1.setSelected(true);
        
        JRadioButton b2 = new JRadioButton("CSIT");
        b2.setBounds(220,260, 60, 20);
        f.add(b2);
        
        JRadioButton b3 = new JRadioButton("BIT");
        b3.setBounds(290, 260, 60, 20);
        f.add(b3);
   
        ButtonGroup program = new ButtonGroup();
        program.add(b1);
        program.add(b2);
        program.add(b3);
        
        JLabel lblCollege = new JLabel("College");
        lblCollege.setBounds(50, 290, 100, 20);
        f.add(lblCollege);
        
         String c[] = { "Sungava College", "Birendra Multiple Campus", "Indreni College", "Saheed smriti colllege", "Saptagandaki"};
         JComboBox cbCollege = new JComboBox(c);
         cbCollege.setBounds(150 ,290, 200, 20);
         f.add(cbCollege);
         
         JButton btnSubmit = new JButton("Submit");
         btnSubmit.setBounds(170, 330, 80, 20);
         f.add(btnSubmit);
         
         JButton btnCancel = new JButton("Cancel");
         btnCancel.setBounds(260, 330, 80, 20);
         f.add(btnCancel);
       
        f.setSize(400,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Registration_Form();
    }
}