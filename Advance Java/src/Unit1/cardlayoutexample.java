

import javax.swing.*;
import java.awt.*;

public class cardlayoutexample extends Frame {
    static CardLayout c1;
    cardlayoutexample(){
        c1=new CardLayout();
        setLayout(c1);
        JPanel p1=new JPanel();
        p1.setBackground(Color.RED);
        p1.setForeground(Color.BLACK);
        p1.add(new Label("This is Red Pannel "));
        add(p1);
        JPanel p2=new JPanel();
        p2.setBackground(Color.GREEN);
        p2.setForeground(Color.BLACK);
        p2.add(new Label("This is Green Panel "));
        add(p2);
        JPanel p3=new JPanel();
        p3.setBackground(Color.YELLOW);
        p3.setForeground(Color.BLACK);
        p3.add(new Label("This is Yellow Panel "));
        add(p3);
        setSize(300,200);
        setVisible(true);
        

    }

    public static void main(String[] args) {
        cardlayoutexample first=new cardlayoutexample();
        cardlayoutexample second=new cardlayoutexample();
        c1.next(second);
        cardlayoutexample third=new cardlayoutexample();
        c1.last(third);
    }

}