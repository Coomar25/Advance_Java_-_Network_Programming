
package Until;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.ImageIcon;


public class FrameByAssociation {
    
    FrameByAssociation(){
      //  JFrame f = new JFrame("Frame By Association"); 
        JFrame f = new JFrame();
        f.setTitle("rame By Association");
        f.setSize(400, 400);
        f.setLayout(null); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit when  click on the cross button
        f.setResizable(false); //prevent frame from being resizable
        f.setVisible(true); // make frame visible
        
        ImageIcon image = new ImageIcon("admission.png"); //create an imageicon
        f.setIconImage(image.getImage());
    }

    public static void main(String[] args) {
//        FrameByAssociation frameByAssociation = new FrameByAssociation();

new FrameByAssociation();
        
    }
    
}
