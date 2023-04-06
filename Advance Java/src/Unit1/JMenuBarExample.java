/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author ADMIN
 */
public class JMenuBarExample extends JFrame {
    
    static JMenuBar mb;
    static JMenu file, edit, format, view, help,
            subMenu;
    static JMenuItem neww, newWindow, open, save, saveAs, pageSetUp, print, exit, subMenuItem1, subMenuItem2;
    static JFrame f;
    public static void main(String[] args)
    {
        JMenuBarExample m = new JMenuBarExample();
        f = new JFrame("Menu Demo");
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu ("Format");
        view = new JMenu("View");
        save = new JMenu("Save");
        help = new JMenu("SubMenu");
        subMenu = new JMenu("SubMenu");
        neww = new JMenu("New");
        newWindow = new JMenuItem("New Window");
        open = new JMenuItem("Open");
        saveAs = new JMenuItem("Save As");
        pageSetUp = new JMenuItem("Page Setup");
        print = new JMenuItem("Print");
        exit = new JMenuItem("Exit");
        subMenuItem1 = new JMenuItem("SubMenuItem1");
        subMenuItem2 = new JMenuItem("SubMenuItem2");
        file.add(neww);
        file.add(newWindow);
        file.add(open);
        file.add(save);
        file.add(pageSetUp);
        file.add(saveAs);
        file.add(print);
        file.add(exit);
        file.add(subMenuItem1);
        file.add(subMenuItem2);
        file.add(subMenu);
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);
        f.setJMenuBar(mb);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
    
}
