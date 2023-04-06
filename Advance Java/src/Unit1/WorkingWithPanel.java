
package Unit1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorkingWithPanel {
    
    WorkingWithPanel(){
        JFrame f= new JFrame("Working with pannel");
        JPanel p = new JPanel();
        JButton btn1 = new JButton("Button");
        p.add(btn1);
        JButton btn2 = new JButton("Button2");
        p.add(btn2);
        JButton btn3 = new JButton("Button3");
        p.add(btn3);
        JButton btn4 = new JButton("Button4");
        p.add(btn4);
        p.setBackground(new Color(123, 45, 65));
        p.setSize(300, 100);
        f.add(p);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
    }
    
    public static void main(String args[]){
        new WorkingWithPanel();
    }
    
}
