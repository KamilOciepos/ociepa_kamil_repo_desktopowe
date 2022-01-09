package pl.com.kamil.ociepa.popupmenu;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class JFrame extends javax.swing.JFrame {
    private ArrayList<Data> dataList;
    private DefaultListModel dlm;
    private int dialogMode;
    
    public JFrame() {
        initComponents();
        dataList = new ArrayList<>();
        dlm = new DefaultListModel();


    }
    
    public void add(Data data) {
        int id = dataList.size();
        dataList.add(id, data);
        dlm.add(id, dataList.get(id).getObjectName());
        ko_JList.setModel(dlm);
    }
    
   
    public void modify(Data data) {
        int id = ko_JList.getSelectedIndex();
        dataList.set(id, data);
        dlm.set(id, dataList.get(id).getObjectName());
        ko_JList.setModel(dlm);
    }
    
    public void remove() {
        ko_JLImie.setText(dataList.get(ko_JList.getSelectedIndex()).getObjectName());
        ko_JDWarning.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ko_JPopup = new javax.swing.JPopupMenu();
        ko_JMenuItem = new javax.swing.JMenuItem();
        ko_jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ko_JMIDelete = new javax.swing.JMenuItem();
        ko_JMModify = new javax.swing.JMenuItem();
        ko_jDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        ko_jLImie = new javax.swing.JLabel();
        ko_jLNazwisko = new javax.swing.JLabel();
        ko_jLKlasa = new javax.swing.JLabel();
        ko_JLRokRozp = new javax.swing.JLabel();
        ko_JTFImie = new javax.swing.JTextField();
        ko_JTFNazwisko = new javax.swing.JTextField();
        ko_JTFKlasa = new javax.swing.JTextField();
        ko_JLRok = new javax.swing.JTextField();
        ko_jBConfirm = new javax.swing.JButton();
        ko_JDWarning = new javax.swing.JDialog();
        ko_jPWarning = new javax.swing.JPanel();
        ko_jBConfrimDelete = new javax.swing.JButton();
        ko_JLImie = new javax.swing.JLabel();
        ko_jLConfrim = new javax.swing.JLabel();
        ko_JPMain = new javax.swing.JPanel();
        ko_jScrollPane1 = new javax.swing.JScrollPane();
        ko_JList = new javax.swing.JList<>();
        ko_JB_Add = new javax.swing.JButton();

        ko_JPopup.setBackground(new java.awt.Color(255, 204, 204));
        ko_JPopup.setBorderPainted(false);
        ko_JPopup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                ko_JPopupPopupMenuWillBecomeVisible(evt);
            }
        });

        ko_JMenuItem.setText("Zaznaczono x opcje");
        ko_JMenuItem.setEnabled(false);
        ko_JMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_JMenuItemActionPerformed(evt);
            }
        });
        ko_JPopup.add(ko_JMenuItem);
        ko_JPopup.add(ko_jSeparator1);

        ko_JMIDelete.setText("Usuń");
        ko_JMIDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_JMIDeleteActionPerformed(evt);
            }
        });
        ko_JPopup.add(ko_JMIDelete);

        ko_JMModify.setText("Modyfikuj");
        ko_JMModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_JMModifyActionPerformed(evt);
            }
        });
        ko_JPopup.add(ko_JMModify);

        ko_jDialog.setTitle("Dodawanie ucznia");
        ko_jDialog.setMinimumSize(new java.awt.Dimension(398, 285));
        ko_jDialog.setModal(true);
        ko_jDialog.setResizable(false);
        ko_jDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ko_jDialogKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        ko_jLImie.setText("Imię");

        ko_jLNazwisko.setText("Nazwisko");

        ko_jLKlasa.setText("Klasa");

        ko_JLRokRozp.setText("Rok rozpoczęcia nauki");

        ko_JTFImie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ko_JTFKlasaKeyPressed(evt);
            }
        });

        ko_JTFNazwisko.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ko_JTFKlasaKeyPressed(evt);
            }
        });

        ko_JTFKlasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ko_JTFKlasaKeyPressed(evt);
            }
        });

        ko_JLRok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ko_JTFKlasaKeyPressed(evt);
            }
        });

        ko_jBConfirm.setText("Potwierdź");
        ko_jBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jBConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ko_JLRokRozp)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ko_jLNazwisko, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(ko_jLImie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ko_jLKlasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ko_JLRok, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(ko_JTFNazwisko)
                            .addComponent(ko_JTFImie)
                            .addComponent(ko_JTFKlasa)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(ko_jBConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jLImie)
                    .addComponent(ko_JTFImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jLNazwisko)
                    .addComponent(ko_JTFNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jLKlasa)
                    .addComponent(ko_JTFKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_JLRokRozp)
                    .addComponent(ko_JLRok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(ko_jBConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ko_jDialogLayout = new javax.swing.GroupLayout(ko_jDialog.getContentPane());
        ko_jDialog.getContentPane().setLayout(ko_jDialogLayout);
        ko_jDialogLayout.setHorizontalGroup(
            ko_jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_jDialogLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ko_jDialogLayout.setVerticalGroup(
            ko_jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_jDialogLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ko_JDWarning.setTitle("Warning");
        ko_JDWarning.setMinimumSize(new java.awt.Dimension(210, 205));
        ko_JDWarning.setModal(true);
        ko_JDWarning.setResizable(false);

        ko_jPWarning.setBackground(new java.awt.Color(255, 204, 204));

        ko_jBConfrimDelete.setText("Potwierdź");
        ko_jBConfrimDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jBConfrimDeleteActionPerformed(evt);
            }
        });

        ko_JLImie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ko_JLImie.setText("Imie");

        ko_jLConfrim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ko_jLConfrim.setText("Proszę potwierdzić usunięcie");

        javax.swing.GroupLayout ko_jPWarningLayout = new javax.swing.GroupLayout(ko_jPWarning);
        ko_jPWarning.setLayout(ko_jPWarningLayout);
        ko_jPWarningLayout.setHorizontalGroup(
            ko_jPWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_jPWarningLayout.createSequentialGroup()
                .addGroup(ko_jPWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ko_jPWarningLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(ko_jPWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ko_JLImie, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ko_jLConfrim)))
                    .addGroup(ko_jPWarningLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(ko_jBConfrimDelete)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        ko_jPWarningLayout.setVerticalGroup(
            ko_jPWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ko_jPWarningLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ko_jLConfrim)
                .addGap(18, 18, 18)
                .addComponent(ko_JLImie, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ko_jBConfrimDelete)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ko_JDWarningLayout = new javax.swing.GroupLayout(ko_JDWarning.getContentPane());
        ko_JDWarning.getContentPane().setLayout(ko_JDWarningLayout);
        ko_JDWarningLayout.setHorizontalGroup(
            ko_JDWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_JDWarningLayout.createSequentialGroup()
                .addComponent(ko_jPWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ko_JDWarningLayout.setVerticalGroup(
            ko_JDWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_JDWarningLayout.createSequentialGroup()
                .addComponent(ko_jPWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");
        setResizable(false);

        ko_JPMain.setBackground(new java.awt.Color(255, 204, 204));

        ko_JList.setComponentPopupMenu(ko_JPopup);
        ko_jScrollPane1.setViewportView(ko_JList);

        ko_JB_Add.setText("Dodaj");
        ko_JB_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_JB_AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ko_JPMainLayout = new javax.swing.GroupLayout(ko_JPMain);
        ko_JPMain.setLayout(ko_JPMainLayout);
        ko_JPMainLayout.setHorizontalGroup(
            ko_JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_JPMainLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(ko_JB_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ko_JPMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ko_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        ko_JPMainLayout.setVerticalGroup(
            ko_JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_JPMainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ko_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ko_JB_Add)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ko_JPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ko_JPMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ko_JPopupPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ko_JPopupPopupMenuWillBecomeVisible
        int id = ko_JList.getSelectedIndex();
        if(id > -1) {
            ko_JMenuItem.setText(dataList.get(id).getObjectName());
            ko_JMIDelete.setEnabled(true);
            ko_JMModify.setEnabled(true);
        }
        else {
            ko_JMenuItem.setText("Nie zaznaczono żadnego ucznia");
            ko_JMIDelete.setEnabled(false);
            ko_JMModify.setEnabled(false);
        }
    }//GEN-LAST:event_ko_JPopupPopupMenuWillBecomeVisible

    private void ko_JMIDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_JMIDeleteActionPerformed
        remove();
    }//GEN-LAST:event_ko_JMIDeleteActionPerformed

    private void ko_JMModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_JMModifyActionPerformed
        Data data = dataList.get(ko_JList.getSelectedIndex());
        
        ko_JTFImie.setText(data.imie);
        ko_JTFNazwisko.setText(data.nazwisko);
        ko_JTFKlasa.setText(data.klasa);
        ko_JLRok.setText(data.rok);
        
        dialogMode = 1;
        ko_jDialog.setVisible(true);
    }//GEN-LAST:event_ko_JMModifyActionPerformed

    private void ko_JB_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_JB_AddActionPerformed
        ko_JTFImie.setText("");
        ko_JTFNazwisko.setText("");
        ko_JTFKlasa.setText("");
        ko_JLRok.setText("");
        
        dialogMode = 0;
        ko_jDialog.setVisible(true);
    }//GEN-LAST:event_ko_JB_AddActionPerformed

    private void ko_jDialogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ko_jDialogKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) dialogProceed();
    }//GEN-LAST:event_ko_jDialogKeyPressed

    private void ko_jBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jBConfirmActionPerformed
        dialogProceed();
    }//GEN-LAST:event_ko_jBConfirmActionPerformed

    private void ko_JTFKlasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ko_JTFKlasaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) dialogProceed();
    }//GEN-LAST:event_ko_JTFKlasaKeyPressed

    private void ko_jBConfrimDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jBConfrimDeleteActionPerformed
        int id = ko_JList.getSelectedIndex();
        dataList.remove(id);
        dlm.remove(id);
        ko_JList.setModel(dlm);
        ko_JDWarning.setVisible(false);
    }//GEN-LAST:event_ko_jBConfrimDeleteActionPerformed

    private void ko_JMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_JMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ko_JMenuItemActionPerformed

    private void dialogProceed() {
        ko_jDialog.setVisible(false);
        Data data = new Data(ko_JTFImie.getText().strip(), ko_JTFNazwisko.getText().strip(), ko_JTFKlasa.getText().strip(), ko_JLRok.getText().strip());
        
        if(dialogMode == 0) add(data);
        if(dialogMode == 1) modify(data);
    }
    
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ko_JB_Add;
    private javax.swing.JDialog ko_JDWarning;
    private javax.swing.JLabel ko_JLImie;
    private javax.swing.JTextField ko_JLRok;
    private javax.swing.JLabel ko_JLRokRozp;
    private javax.swing.JList<String> ko_JList;
    private javax.swing.JMenuItem ko_JMIDelete;
    private javax.swing.JMenuItem ko_JMModify;
    private javax.swing.JMenuItem ko_JMenuItem;
    private javax.swing.JPanel ko_JPMain;
    private javax.swing.JPopupMenu ko_JPopup;
    private javax.swing.JTextField ko_JTFImie;
    private javax.swing.JTextField ko_JTFKlasa;
    private javax.swing.JTextField ko_JTFNazwisko;
    private javax.swing.JButton ko_jBConfirm;
    private javax.swing.JButton ko_jBConfrimDelete;
    private javax.swing.JDialog ko_jDialog;
    private javax.swing.JLabel ko_jLConfrim;
    private javax.swing.JLabel ko_jLImie;
    private javax.swing.JLabel ko_jLKlasa;
    private javax.swing.JLabel ko_jLNazwisko;
    private javax.swing.JPanel ko_jPWarning;
    private javax.swing.JScrollPane ko_jScrollPane1;
    private javax.swing.JPopupMenu.Separator ko_jSeparator1;
    // End of variables declaration//GEN-END:variables
}
