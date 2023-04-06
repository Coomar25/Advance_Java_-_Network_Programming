package EventHandling;
import javax.swing.*;
import java.awt.event.*;

public class SumofTwoNumbers {
    SumofTwoNumbers() {
        JFrame f = new JFrame("Sum");
        JLabel lblFirstNum = new JLabel("First Number");
        lblFirstNum.setBounds(10, 45, 100, 20);
        f.add(lblFirstNum);
        JTextField txtFirstNum = new JTextField();
        txtFirstNum.setBounds(150, 45, 150, 20);
        f.add(txtFirstNum);
        JTextField txtSecondNum = new JTextField();
        txtSecondNum.setBounds(150, 70, 150, 20);
        f.add(txtSecondNum);
        JLabel lblResult = new JLabel("Result");
        lblResult.setBounds(10, 70, 100, 20);
        f.add(lblResult);
        JTextField txtResult = new JTextField();
        txtResult.setBounds(150, 95, 150, 20);
        f.add(txtResult);
        JButton btnSum = new JButton("Sum");
        btnSum.setBounds(90, 140, 80, 20);
        f.add(btnSum);
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(180, 140, 80, 20);
        f.add(btnCancel);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        btnSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(txtFirstNum.getText());
                int b = Integer.parseInt(txtSecondNum.getText());
                int c = a + b;
                txtResult.setText(Integer.toString(c));
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtFirstNum.setText("");
                txtSecondNum.setText("");
                txtResult.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new SumofTwoNumbers();
    }

}
