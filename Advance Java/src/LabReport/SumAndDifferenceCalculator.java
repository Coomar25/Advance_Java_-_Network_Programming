import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SumAndDifferenceCalculator extends JFrame {
    private JTextField numField1;
    private JTextField numField2;
    private JTextField resultField;

    public SumAndDifferenceCalculator() {
        setTitle("Sum and Difference Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Number 1:");
        numField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        numField2 = new JTextField();
        JLabel label3 = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        add(label1);
        add(numField1);
        add(label2);
        add(numField2);
        add(label3);
        add(resultField);

        // Attach MouseListener to handle mouse events
        numField1.addMouseListener(new MyMouseListener());
        numField2.addMouseListener(new MyMouseListener());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            calculateSum();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            calculateDifference();
        }
    }

    private void calculateSum() {
        try {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int sum = num1 + num2;
            resultField.setText(Integer.toString(sum));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    private void calculateDifference() {
        try {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int difference = num1 - num2;
            resultField.setText(Integer.toString(difference));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SumAndDifferenceCalculator::new);
    }
}
