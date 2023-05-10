/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Programming;



import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class JMenubarExample extends JFrame 
{ 
static JMenuBar mb;
static JMenu a,b,c,d,e,x1;
static JMenuItem a1,a2,a3,a4,a5,a6,a7,a8,s1,s2;
static JFrame f;
public static void main(String[] args)
{
 JMenubarExample m=new JMenubarExample();
 f=new JFrame("Menu demo");
 mb=new JMenuBar();
 a=new JMenu("File");
 b=new JMenu("Edit");
 c=new JMenu("Format");
 d=new JMenu("View");
 e=new JMenu("Help");
 x1=new JMenu("submenu");
 a1=new JMenuItem("New");
 a2=new JMenuItem("New Window");
 a3=new JMenuItem("Open");
 a4=new JMenuItem("Save");
 a5=new JMenuItem("Save As");
 a6=new JMenuItem("Page Setup");
 a7=new JMenuItem("Print");
 a8=new JMenuItem("Exit");
 s1=new JMenuItem("SubMenuItem1");
 s2=new JMenuItem("SubMenuItem2");
 a.add(a1);
 a.add(a2);
 a.add(a3);
 a.add(a4);
 a.add(a5);
 a.add(a6);
 a.add(a7);
 a.add(a8);
 x1.add(s1);
 x1.add(s2);
 a.add(x1);
 mb.add(a);
 mb.add(b);
 mb.add(c);
 mb.add(d);
 mb.add(e);
 f.setJMenuBar(mb);
 f.setSize(300,300);
 f.setVisible(true);
}
}




