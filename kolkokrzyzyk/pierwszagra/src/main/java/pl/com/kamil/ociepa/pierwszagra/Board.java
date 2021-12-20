/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.pierwszagra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author a20ko
 */
public class Board extends JPanel {
    
    public Board(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(800,600));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setStroke(new BasicStroke(4));
                   //x1   x2  y1   y2
        g2d.drawLine(10, 10, 10, 210); // |
        g2d.drawLine(10, 10, 210, 10);//  -
        g2d.drawLine(210, 10, 210, 210);
        g2d.drawLine(10, 210, 210, 210);
    }
}