package EventHandling;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
/**
 *
 * @author Coo_Mar
 */
public class MouseEventExample implements MouseListener{
    
    JTextField txt;
    JLabel lbl;
    
    
    MouseEventExample(){
        
        JFrame f = new JFrame("Mouse Event Example");
        txt = new JTextField();
        txt.setBounds(10, 10, 100,40);
        txt.addMouseListener(this);
        f.add(txt);
        lbl = new JLabel( " ");
        lbl.setBounds(150,10,100,20);
        f.add(lbl);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
               
        
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   lbl.setText("Mouse is pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    lbl.setText("Mouse is relesed");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   lbl.setText("Mouse has been entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    lbl.setText("Mouse is exited");
    }
    
    public static void main(String[] args){
        new MouseEventExample();
    }
    
}
