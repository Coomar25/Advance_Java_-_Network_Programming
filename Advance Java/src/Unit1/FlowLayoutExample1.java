package Unit1;

import static Unit1.JMenuBarExample.f;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample1 {
    
    FlowLayoutExample1(){
        JFrame = new JFrame("Flow Layout");
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");
        f.add(b1);
        f.add(b2);
        f.setLayout(new FlowLayout(FlowLayout.LEFT);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
