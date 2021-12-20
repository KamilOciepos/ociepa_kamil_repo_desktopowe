/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.pierwszagra;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author a20ko
 */
public class MainWindow extends JFrame{
    
    public MainWindow(){
            initUI();
            
            add(new Board());
            //pack();
        }
    
    private void initUI(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    public static void main(String[] args){
        
        EventQueue.invokeLater(() -> {
            MainWindow mw = new MainWindow();
            mw.setVisible(true);
        });
        
    }
    
}
