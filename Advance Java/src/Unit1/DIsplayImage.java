/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class DIsplayImage {
    public static void main(String[] args)  throws IOException{
        File file = new File("C:\\Users\\ADMIN\\Downloads\\CARD\\Screenshot 2023-03-24 075635.png");
        BufferedImage bufferedImage =  ImageIO.read(file);
        ImageIcon imageicon  = new ImageIcon(bufferedImage);
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(400, 500);
        JLabel jlabel = new JLabel();
        jlabel.setIcon(imageicon);
        f.add(jlabel);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}
