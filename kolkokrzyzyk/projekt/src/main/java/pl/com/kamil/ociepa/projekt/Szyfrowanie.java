/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.projekt;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a20ko
 */
public class Szyfrowanie extends javax.swing.JFrame {

    /**
     * Creates new form Szyfrowanie
     */
    public Szyfrowanie() {
        initComponents();
    }

    boolean Essa = true;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonKodowanie = new javax.swing.JRadioButton();
        jRadioButtonDekodowanie = new javax.swing.JRadioButton();
        jBKoduj = new javax.swing.JButton();
        jBWyczysc = new javax.swing.JButton();
        jBZapisz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTALewo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAPrawo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButtonKodowanie);
        jRadioButtonKodowanie.setSelected(true);
        jRadioButtonKodowanie.setText("Kodowanie");
        jRadioButtonKodowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKodowanieActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDekodowanie);
        jRadioButtonDekodowanie.setText("Dekodowanie");
        jRadioButtonDekodowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDekodowanieActionPerformed(evt);
            }
        });

        jBKoduj.setText("Zakoduj");
        jBKoduj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKodujActionPerformed(evt);
            }
        });

        jBWyczysc.setText("Wyczyśc");
        jBWyczysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWyczyscActionPerformed(evt);
            }
        });

        jBZapisz.setText("Zapisz");
        jBZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZapiszActionPerformed(evt);
            }
        });

        jTALewo.setColumns(20);
        jTALewo.setRows(5);
        jScrollPane1.setViewportView(jTALewo);

        jTAPrawo.setColumns(20);
        jTAPrawo.setRows(5);
        jScrollPane2.setViewportView(jTAPrawo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonKodowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButtonDekodowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBKoduj, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonKodowanie)
                    .addComponent(jRadioButtonDekodowanie))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBKoduj)
                    .addComponent(jBWyczysc)
                    .addComponent(jBZapisz))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonKodowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKodowanieActionPerformed
        Essa = true;
        Main();
    }//GEN-LAST:event_jRadioButtonKodowanieActionPerformed

    private void jRadioButtonDekodowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDekodowanieActionPerformed
        Essa = false;
        Main();
    }//GEN-LAST:event_jRadioButtonDekodowanieActionPerformed

    private void jBKodujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKodujActionPerformed
        if(jBKoduj.getText().equals("Zakoduj")){
            jTAPrawo.setText("");
            ArrayList<String> alfabet = new ArrayList<String>();
            ArrayList<String> zakodowanyalfabet = new ArrayList<String>();
            alfabet.add("abcdefghijklmnopqrstuvwxyz");
            zakodowanyalfabet.add("poiuytrewqasdfghjklzxcvbnm");
            char znak, zakodowanyznak;
            int index;
            for(int i=0; i<jTALewo.getText().length();i++){
                znak=jTALewo.getText().charAt(i);
                if(alfabet.get(0).contains(alfabet.get(0).valueOf(znak))){
                    index=alfabet.get(0).indexOf(znak);
                    zakodowanyznak=zakodowanyalfabet.get(0).charAt(index);
                    jTAPrawo.setText(jTAPrawo.getText()+zakodowanyznak);
                }
                else{
                    jTAPrawo.setText(jTAPrawo.getText()+znak);
                }
            }
        }else{
            jTAPrawo.setText("");
            ArrayList<String> alfabet = new ArrayList<String>();
            ArrayList<String> zakodowanyalfabet = new ArrayList<String>();
            zakodowanyalfabet.add("abcdefghijklmnopqrstuvwxyz");
            alfabet.add("poiuytrewqasdfghjklzxcvbnm");
            char znak, zakodowanyznak;
            int index;
            for(int i=0; i<jTALewo.getText().length();i++){
                znak=jTALewo.getText().charAt(i);
                if(alfabet.get(0).contains(alfabet.get(0).valueOf(znak))){
                    index=alfabet.get(0).indexOf(znak);
                    zakodowanyznak=zakodowanyalfabet.get(0).charAt(index);
                    jTAPrawo.setText(jTAPrawo.getText()+zakodowanyznak);
                }
                else{
                    jTAPrawo.setText(jTAPrawo.getText()+znak);
                }
            }
        }
    }//GEN-LAST:event_jBKodujActionPerformed

    private void jBWyczyscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBWyczyscActionPerformed
        Wyczysc();
    }//GEN-LAST:event_jBWyczyscActionPerformed

    private void jBZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZapiszActionPerformed
        if(Essa)Zapisz();
        else Wczytaj();
    }//GEN-LAST:event_jBZapiszActionPerformed
                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szyfrowanie().setVisible(true);
            }
        });
    }
    private void Main(){
        if(Essa){
            jBKoduj.setText("Zakoduj");
            jBZapisz.setText("Zapisz");
            Wyczysc();
        }else{
            jBKoduj.setText("Odkoduj");
            jBZapisz.setText("Wczytaj");
            Wyczysc();
        }
    }
    
    private void Wyczysc(){
        jTALewo.setText("");
        jTAPrawo.setText("");
    }
    
    private void Zapisz(){
        File f = new File("kodowanie.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f,false);
            fw.append(jTAPrawo.getText());
            fw.close();
        } catch (Exception e) {
        }
    }
    
    private void Wczytaj(){
        File f = new File("kodowanie.txt");
        try {
            String Tekst = "";
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                Tekst = Tekst+"\n"+sc.nextLine();
            }
            jTALewo.setText(Tekst);
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBKoduj;
    private javax.swing.JButton jBWyczysc;
    private javax.swing.JButton jBZapisz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDekodowanie;
    private javax.swing.JRadioButton jRadioButtonKodowanie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTALewo;
    private javax.swing.JTextArea jTAPrawo;
    // End of variables declaration//GEN-END:variables
}
