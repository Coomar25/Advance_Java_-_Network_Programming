/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kumar
 */
import java.awt.*;
import java.awt.event.*;

public class TwoDimensionalObjects extends Frame {

    private Canvas canvas;
    private Point point;

    public TwoDimensionalObjects() {
        setTitle("Two Dimensional Objects");
        setLayout(new FlowLayout());

        canvas = new Canvas();
        add(canvas);

        point = new Point(100, 100);

        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                point.x = e.getX();
                point.y = e.getY();
                canvas.repaint();
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawRect(point.x, point.y, 10, 10);
    }

    public static void main(String[] args) {
        new TwoDimensionalObjects();
    }
}
