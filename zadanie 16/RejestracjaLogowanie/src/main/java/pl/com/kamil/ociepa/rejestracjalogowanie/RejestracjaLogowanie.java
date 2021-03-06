/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.rejestracjalogowanie;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author a20ko
 */
public class RejestracjaLogowanie extends javax.swing.JFrame {

    /**
     * Creates new form RejestracjaLogowanie
     */
    public RejestracjaLogowanie() {
        initComponents();
        addKeyListenerTojTextFieldEmailLogowanie();
        addKeyListenerTojTextFieldEmail();
        addKeyListenerTojTextFieldUsername();
        addkeyListenerTojPasswordFieldLogowanie();
        addkeyListenerTojConfirmPasswordField();
        addkeyListenerTojPasswordField();
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
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelLogowanie = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelEmailLogowanie = new javax.swing.JLabel();
        jLabelPasswordLogowanie = new javax.swing.JLabel();
        jTextFieldEmailLogowanie = new javax.swing.JTextField();
        jPasswordFieldLogowanie = new javax.swing.JPasswordField();
        jButtonZaloguj = new javax.swing.JButton();
        jPanelRejestracja = new javax.swing.JPanel();
        jLabelTytul = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jConfirmPasswordField = new javax.swing.JPasswordField();
        jButtonRejestruj = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLogowanie.setBackground(new java.awt.Color(255, 204, 204));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitle.setText("Logowanie");

        jLabelEmailLogowanie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmailLogowanie.setText("E-mail");

        jLabelPasswordLogowanie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPasswordLogowanie.setText("Password");

        jTextFieldEmailLogowanie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPasswordFieldLogowanie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonZaloguj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonZaloguj.setText("Zaloguj");
        jButtonZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZalogujActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogowanieLayout = new javax.swing.GroupLayout(jPanelLogowanie);
        jPanelLogowanie.setLayout(jPanelLogowanieLayout);
        jPanelLogowanieLayout.setHorizontalGroup(
            jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTitle)
                        .addComponent(jLabelEmailLogowanie)
                        .addComponent(jLabelPasswordLogowanie)
                        .addComponent(jPasswordFieldLogowanie, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addComponent(jTextFieldEmailLogowanie))
                    .addComponent(jButtonZaloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanelLogowanieLayout.setVerticalGroup(
            jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogowanieLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmailLogowanie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEmailLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelPasswordLogowanie)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonZaloguj)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Logowanie", jPanelLogowanie);

        jPanelRejestracja.setBackground(new java.awt.Color(255, 204, 204));

        jLabelTytul.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTytul.setText("Rejestracja");

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUsername.setText("Username");

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmail.setText("E-mail");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setText("Password");

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jLabelConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelConfirmPassword.setText("Confirm password");

        jConfirmPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonRejestruj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRejestruj.setText("Zarejestruj");
        jButtonRejestruj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRejestrujActionPerformed(evt);
            }
        });

        jButtonClear.setText("Wyczyść");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRejestracjaLayout = new javax.swing.GroupLayout(jPanelRejestracja);
        jPanelRejestracja.setLayout(jPanelRejestracjaLayout);
        jPanelRejestracjaLayout.setHorizontalGroup(
            jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTytul)
                        .addComponent(jLabelUsername)
                        .addComponent(jLabelEmail)
                        .addComponent(jLabelPassword)
                        .addComponent(jPasswordField)
                        .addComponent(jLabelConfirmPassword)
                        .addComponent(jConfirmPasswordField)
                        .addComponent(jTextFieldEmail)
                        .addComponent(jTextFieldUsername))
                    .addComponent(jButtonRejestruj, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(401, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRejestracjaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanelRejestracjaLayout.setVerticalGroup(
            jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTytul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonRejestruj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClear)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Rejestracja", jPanelRejestracja);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButtonRejestrujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRejestrujActionPerformed
        
        String haslo = jPasswordField.getText();
        String potwierdzenie = jConfirmPasswordField.getText();
        
        if(potwierdzenie.equals(haslo)){
            JOptionPane.showMessageDialog(null, "Rejestracja powiodła się");
            String username = jTextFieldUsername.getText();
            String email = jTextFieldEmail.getText();
            String password = jPasswordField.getText();

            String wynik = (""+username+";"+email+";"+password+"\n");
            File f = new File("sekretnehasla.csv");

            try{
                FileWriter fw = new FileWriter(f,false);
                fw.write(wynik+"\n");
                fw.close();
            }catch(IOException e){
                System.out.println("BŁĄD: "+e.toString());
            }
        }else if(haslo.length() < 4){
            JOptionPane.showMessageDialog(null, "Hasło ma mniej niż 4 znaki");
        }else{
            JOptionPane.showMessageDialog(null, "Hasła różnią się od siebie");
            
        }
    }//GEN-LAST:event_jButtonRejestrujActionPerformed

    private void jButtonZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZalogujActionPerformed
       
        JOptionPane.showMessageDialog(null, "Niestety ta funkcja to nie działa");
    }//GEN-LAST:event_jButtonZalogujActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldUsername.setText("");
        jTextFieldEmail.setText("");
        jPasswordField.setText("");
        jConfirmPasswordField.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed
    private void addKeyListenerTojTextFieldEmailLogowanie(){
        jTextFieldEmailLogowanie.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldEmailLogowanie.getText();
                char ch = e.getKeyChar();
                if(  (ch == '@' || ch >= 'a' && ch <= 'z') || ch == KeyEvent.VK_BACK_SPACE ){
                    jTextFieldEmailLogowanie.setEditable(true);
                }else{
                    jTextFieldEmailLogowanie.setEditable(false);
                }
                if(temp.contains("@")){
                   if(ch >= 'a' && ch <= 'z' || ch == '.' || ch == KeyEvent.VK_BACK_SPACE){
                        jTextFieldEmailLogowanie.setEditable(true);
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void addkeyListenerTojConfirmPasswordField(){
        jConfirmPasswordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                
                if(ch >= 'a' && ch <= 'z' || ch >= '0'  && ch <= '9'){
                    jConfirmPasswordField.setEditable(true);
                }else{
                    jConfirmPasswordField.setEditable(false);
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
    private void addkeyListenerTojPasswordFieldLogowanie(){
        jPasswordFieldLogowanie.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                
                if(ch >= 'a' && ch <= 'z' || ch >= '0'  && ch <= '9'){
                    jPasswordFieldLogowanie.setEditable(true);
                }else{
                    jPasswordFieldLogowanie.setEditable(false);
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
    private void addkeyListenerTojPasswordField(){
        jPasswordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                
                if(ch >= 'a' && ch <= 'z' || ch >= '0'  && ch <= '9'){
                    jPasswordField.setEditable(true);
                }else{
                    jPasswordField.setEditable(false);
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
                
                String temp = jTextFieldEmail.getText();
                char ch = e.getKeyChar();
                if(  (ch == '@' || ch >= 'a' && ch <= 'z') || ch == KeyEvent.VK_BACK_SPACE ){
                    jTextFieldEmail.setEditable(true);
                }else{
                    jTextFieldEmail.setEditable(false);
                }
                if(temp.contains("@")){
                   if(ch >= 'a' && ch <= 'z' || ch == '.' || ch == KeyEvent.VK_BACK_SPACE){
                        jTextFieldEmail.setEditable(true);
                    }
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void addKeyListenerTojTextFieldUsername(){
        jTextFieldUsername.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldUsername.getText();
                char ch = e.getKeyChar();
                if((ch >= 'a' && ch <= 'z' || ch == KeyEvent.VK_BACK_SPACE ) 
                   && (temp.length() <=19 || ch == KeyEvent.VK_BACK_SPACE  )) {
                    jTextFieldUsername.setEditable(true);
                }else{
                    jTextFieldUsername.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
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
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RejestracjaLogowanie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonRejestruj;
    private javax.swing.JButton jButtonZaloguj;
    private javax.swing.JPasswordField jConfirmPasswordField;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmailLogowanie;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPasswordLogowanie;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTytul;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelLogowanie;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelRejestracja;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldLogowanie;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailLogowanie;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
