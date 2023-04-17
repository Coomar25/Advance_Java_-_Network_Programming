package EventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MouseEventNumberResult implements MouseListener {
    JLabel lblFirstNum, lblSecondNum, lblResult, lblStatus;
    JTextField txtFirstNum, txtSecondNum, txtResult;

    MouseEventNumberResult() {
        JFrame f = new JFrame("Mouse event number result example");

        lblFirstNum = new JLabel("First Number");
        lblFirstNum.setBounds(10, 20, 100, 20);
        f.add(lblFirstNum);

        txtFirstNum = new JTextField();
        txtFirstNum.setBounds(150, 20, 150, 20);
        f.add(txtFirstNum);

        lblSecondNum = new JLabel("Second Number");
        lblSecondNum.setBounds(10, 70, 150, 20);
        f.add(lblSecondNum);

        txtSecondNum = new JTextField();
        txtSecondNum.setBounds(150, 70, 150, 20);
        f.add(txtSecondNum);

        lblResult = new JLabel("Result");
        lblResult.setBounds(10, 150, 100, 20);
        f.add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(150, 150, 150, 20);
        f.add(txtResult);

        lblStatus = new JLabel(" ");
        lblStatus.setBounds(10, 200, 100, 20);
        f.add(lblStatus);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int a = Integer.parseInt(txtFirstNum.getText());
        int b = Integer.parseInt(txtSecondNum.getText());
        int c = a + b;
        txtResult.setText(Integer.toString(c));
        lblResult.setText("Result");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lblStatus.setText("Mouse is released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lblStatus.setText("Mouse has entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lblStatus.setText("Mouse has exited");
    }

    public static void main(String[] args) {
        new MouseEventNumberResult();
    }
}
