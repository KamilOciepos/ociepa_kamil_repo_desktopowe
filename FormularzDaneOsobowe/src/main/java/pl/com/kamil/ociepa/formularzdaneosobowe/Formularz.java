/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.formularzdaneosobowe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import static javax.print.attribute.Size2DSyntax.MM;

/**
 *
 * @author a20ko
 */
public class Formularz extends javax.swing.JFrame {

    /**
     * Creates new form Formularz
     */
    public Formularz() {
        initComponents();
        addKeyListenerTojTextFieldWaga();
        addKeyListenerTojTextFieldWzrost();
        addKeyListenerTojTextFieldEmail();
    }
    private void addKeyListenerTojTextFieldWaga(){
        jTextFieldWaga.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if ((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE)) {
                    jTextFieldWaga.setEditable(true);
                } else {
                    jTextFieldWaga.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    private void addKeyListenerTojTextFieldWzrost(){
        jTextFieldWzrost.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if ((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE)) {
                    jTextFieldWzrost.setEditable(true);
                } else {
                    jTextFieldWzrost.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
     private void addKeyListenerTojTextFieldEmail(){
        jTextFieldEmail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp= jTextFieldEmail.getText();
                char ch=e.getKeyChar();
                if((ch=='@' || ch>='a' && ch<='z')){
                    jTextFieldEmail.setEditable(true);
                }
                else{
                    jTextFieldEmail.setEditable(false);
                }
                if(temp.contains("@")){
                   if(ch >= 'a' && ch <= 'z' || ch == '.'){
                        jTextFieldEmail.setEditable(true);
                    }
                   else{
                        jTextFieldEmail.setEditable(false);
                   }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldWzrost = new javax.swing.JTextField();
        jTextFieldWaga = new javax.swing.JTextField();
        jDateChooserUrodzenie = new com.toedter.calendar.JDateChooser();
        jLabelLogin = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelWzrost = new javax.swing.JLabel();
        jLabelWaga = new javax.swing.JLabel();
        jLabelDataUrodzenia = new javax.swing.JLabel();
        jLabelFormularz = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(255, 204, 204));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelLogin.setText("Login");

        jLabelEmail.setText("E-mail");

        jLabelWzrost.setText("Wzrost");

        jLabelWaga.setText("Waga");

        jLabelDataUrodzenia.setText("Data urodzenia");

        jLabelFormularz.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelFormularz.setText("FORMULARZ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Zapisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataUrodzenia)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelLogin)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelWaga)
                                    .addComponent(jLabelWzrost)
                                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jDateChooserUrodzenie, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(jTextFieldWaga)
                                        .addComponent(jTextFieldWzrost)
                                        .addComponent(jTextFieldEmail)
                                        .addComponent(jTextFieldLogin)))
                                .addGap(103, 103, 103)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabelFormularz)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFormularz)
                .addGap(17, 17, 17)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmail)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabelWzrost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWzrost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWaga)
                        .addGap(8, 8, 8)
                        .addComponent(jTextFieldWaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabelDataUrodzenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooserUrodzenie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File f=new File("DaneOsobowe.txt");
        String login = jTextFieldLogin.getText();
        String email = jTextFieldEmail.getText();
        String wzrost = jTextFieldWzrost.getText();
        String waga = jTextFieldWaga.getText();
        Date data= jDateChooserUrodzenie.getDate();
        
        try{
            FileWriter fw= new FileWriter(f);
            fw.write(login+";"+email+";"+wzrost+";"+waga+";"+data+";");
            fw.close();
        }catch(IOException e){
            System.out.println("ERROR "+e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Formularz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formularz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formularz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formularz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formularz().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooserUrodzenie;
    private javax.swing.JLabel jLabelDataUrodzenia;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFormularz;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelWaga;
    private javax.swing.JLabel jLabelWzrost;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldWaga;
    private javax.swing.JTextField jTextFieldWzrost;
    // End of variables declaration//GEN-END:variables
}
