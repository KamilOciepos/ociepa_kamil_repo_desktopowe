/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.kalkulatorek;

import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author a20ko
 */
public class kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ko_jPanelGlowny = new javax.swing.JPanel();
        ko_jTextFieldDzialania = new javax.swing.JTextField();
        ko_jButton1 = new javax.swing.JButton();
        ko_jButton2 = new javax.swing.JButton();
        ko_jButton3 = new javax.swing.JButton();
        ko_jButton4 = new javax.swing.JButton();
        ko_jButton5 = new javax.swing.JButton();
        ko_jButton6 = new javax.swing.JButton();
        ko_jButton7 = new javax.swing.JButton();
        ko_jButton8 = new javax.swing.JButton();
        ko_jButton9 = new javax.swing.JButton();
        ko_jButton0 = new javax.swing.JButton();
        ko_jButtonPotega = new javax.swing.JButton();
        ko_jButtonUsun = new javax.swing.JButton();
        ko_jButtonPlus = new javax.swing.JButton();
        ko_jButtonDzielenie = new javax.swing.JButton();
        ko_jButtonPierwiastek = new javax.swing.JButton();
        ko_jButtonMnozenie = new javax.swing.JButton();
        ko_jButtonMinus = new javax.swing.JButton();
        ko_jButtonWynik = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ko_jMenuPlik = new javax.swing.JMenu();
        ko_jMenuItemZamknij = new javax.swing.JMenuItem();
        ko_jMenuItemOProgramie = new javax.swing.JMenuItem();
        ko_jMenuTools = new javax.swing.JMenu();
        ko_jMenuItemIleDni = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator by Kamil Ociepa");
        setFocusable(false);
        setResizable(false);

        ko_jPanelGlowny.setBackground(new java.awt.Color(255, 204, 255));

        ko_jTextFieldDzialania.setEditable(false);
        ko_jTextFieldDzialania.setBackground(new java.awt.Color(255, 51, 255));
        ko_jTextFieldDzialania.setForeground(new java.awt.Color(51, 0, 51));

        ko_jButton1.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton1.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton1.setText("1");
        ko_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton1ActionPerformed(evt);
            }
        });

        ko_jButton2.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton2.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton2.setText("2");
        ko_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton2ActionPerformed(evt);
            }
        });

        ko_jButton3.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton3.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton3.setText("3");
        ko_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton3ActionPerformed(evt);
            }
        });

        ko_jButton4.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton4.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton4.setText("4");
        ko_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton4ActionPerformed(evt);
            }
        });

        ko_jButton5.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton5.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton5.setText("5");
        ko_jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton5ActionPerformed(evt);
            }
        });

        ko_jButton6.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton6.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton6.setText("6");
        ko_jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton6ActionPerformed(evt);
            }
        });

        ko_jButton7.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton7.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton7.setText("7");
        ko_jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton7ActionPerformed(evt);
            }
        });

        ko_jButton8.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton8.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton8.setText("8");
        ko_jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton8ActionPerformed(evt);
            }
        });

        ko_jButton9.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton9.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton9.setText("9");
        ko_jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton9ActionPerformed(evt);
            }
        });

        ko_jButton0.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButton0.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButton0.setText("0");
        ko_jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButton0ActionPerformed(evt);
            }
        });

        ko_jButtonPotega.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonPotega.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ko_jButtonPotega.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonPotega.setText("potęgowanie");
        ko_jButtonPotega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonPotegaActionPerformed(evt);
            }
        });

        ko_jButtonUsun.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonUsun.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonUsun.setText("usuń");
        ko_jButtonUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonUsunActionPerformed(evt);
            }
        });

        ko_jButtonPlus.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonPlus.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonPlus.setText("+");
        ko_jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonPlusActionPerformed(evt);
            }
        });

        ko_jButtonDzielenie.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonDzielenie.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonDzielenie.setText("/");
        ko_jButtonDzielenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonDzielenieActionPerformed(evt);
            }
        });

        ko_jButtonPierwiastek.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonPierwiastek.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ko_jButtonPierwiastek.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonPierwiastek.setText("pierwiastek");
        ko_jButtonPierwiastek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonPierwiastekActionPerformed(evt);
            }
        });

        ko_jButtonMnozenie.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonMnozenie.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonMnozenie.setText("*");
        ko_jButtonMnozenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonMnozenieActionPerformed(evt);
            }
        });

        ko_jButtonMinus.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonMinus.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonMinus.setText("-");
        ko_jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonMinusActionPerformed(evt);
            }
        });

        ko_jButtonWynik.setBackground(new java.awt.Color(255, 51, 255));
        ko_jButtonWynik.setForeground(new java.awt.Color(51, 0, 51));
        ko_jButtonWynik.setText("=");
        ko_jButtonWynik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jButtonWynikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ko_jPanelGlownyLayout = new javax.swing.GroupLayout(ko_jPanelGlowny);
        ko_jPanelGlowny.setLayout(ko_jPanelGlownyLayout);
        ko_jPanelGlownyLayout.setHorizontalGroup(
            ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                        .addComponent(ko_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ko_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ko_jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ko_jButtonPotega, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ko_jButtonUsun, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ko_jTextFieldDzialania, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                        .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                                .addComponent(ko_jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ko_jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ko_jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                                .addComponent(ko_jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ko_jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ko_jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                                .addComponent(ko_jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ko_jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ko_jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ko_jButtonDzielenie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                                .addComponent(ko_jButtonPierwiastek, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ko_jButtonWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ko_jButtonMnozenie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        ko_jPanelGlownyLayout.setVerticalGroup(
            ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ko_jPanelGlownyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ko_jTextFieldDzialania, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonPotega, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonUsun, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonPierwiastek, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonMnozenie, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ko_jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ko_jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonDzielenie, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ko_jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ko_jMenuPlik.setText("Plik");

        ko_jMenuItemZamknij.setText("Zamknij");
        ko_jMenuItemZamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jMenuItemZamknijActionPerformed(evt);
            }
        });
        ko_jMenuPlik.add(ko_jMenuItemZamknij);

        ko_jMenuItemOProgramie.setText("O programie");
        ko_jMenuItemOProgramie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jMenuItemOProgramieActionPerformed(evt);
            }
        });
        ko_jMenuPlik.add(ko_jMenuItemOProgramie);

        jMenuBar1.add(ko_jMenuPlik);

        ko_jMenuTools.setText("Narzędzia");

        ko_jMenuItemIleDni.setText("Ile dni");
        ko_jMenuItemIleDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_jMenuItemIleDniActionPerformed(evt);
            }
        });
        ko_jMenuTools.add(ko_jMenuItemIleDni);

        jMenuBar1.add(ko_jMenuTools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ko_jPanelGlowny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ko_jPanelGlowny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String temp = "";
    private void ko_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton1ActionPerformed
       ko_jTextFieldDzialania.setText(temp+"1");
       temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton1ActionPerformed

    private void ko_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton2ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"2");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton2ActionPerformed

    private void ko_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton3ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"3");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton3ActionPerformed

    private void ko_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton4ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"4");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton4ActionPerformed

    private void ko_jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton5ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"5");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton5ActionPerformed

    private void ko_jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton6ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"6");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton6ActionPerformed

    private void ko_jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton7ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"7");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton7ActionPerformed

    private void ko_jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton8ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"8");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton8ActionPerformed

    private void ko_jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton9ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"9");
        temp= ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton9ActionPerformed

    private void ko_jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButton0ActionPerformed
        ko_jTextFieldDzialania.setText(temp+"0");
        temp = ko_jTextFieldDzialania.getText();
    }//GEN-LAST:event_ko_jButton0ActionPerformed
    int liczba1;
    int liczba2;
    String znak = "";
    private void ko_jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonPlusActionPerformed
        znak = "+";
        liczba1 = Integer.parseInt(temp);
        temp ="";
    }//GEN-LAST:event_ko_jButtonPlusActionPerformed

    private void ko_jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonMinusActionPerformed
        znak = "-";
        liczba1 = Integer.parseInt(temp);
        temp ="";
        
    }//GEN-LAST:event_ko_jButtonMinusActionPerformed

    private void ko_jButtonMnozenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonMnozenieActionPerformed
        znak ="*";
        liczba1 = Integer.parseInt(temp);
        temp ="";
    }//GEN-LAST:event_ko_jButtonMnozenieActionPerformed

    private void ko_jButtonDzielenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonDzielenieActionPerformed
        znak ="/";
        liczba1 = Integer.parseInt(temp);
        temp ="";
    }//GEN-LAST:event_ko_jButtonDzielenieActionPerformed

    private void ko_jButtonPotegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonPotegaActionPerformed
        znak ="potega";
        liczba1 = Integer.parseInt(temp);
        temp ="";
    }//GEN-LAST:event_ko_jButtonPotegaActionPerformed

    private void ko_jButtonPierwiastekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonPierwiastekActionPerformed
        liczba1 = Integer.parseInt(temp);
        double wynik = Math.sqrt(liczba1);
        String tekst = String.valueOf(wynik);
        ko_jTextFieldDzialania.setText("Pierwiastek z "+liczba1 +" = " + tekst);
        temp = "";
    }//GEN-LAST:event_ko_jButtonPierwiastekActionPerformed

    private void ko_jButtonUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonUsunActionPerformed
        ko_jTextFieldDzialania.setText("");
        temp = "";
    }//GEN-LAST:event_ko_jButtonUsunActionPerformed

    private void ko_jButtonWynikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jButtonWynikActionPerformed
        liczba2 = Integer.parseInt(temp);
        if(znak.equals("+")){
            int wynik = liczba1 + liczba2;
            String tekst = String.valueOf(wynik);
            ko_jTextFieldDzialania.setText(liczba1+ " + " + liczba2+" = " + tekst);
            temp = "";
        }else if(znak.equals("-")){
            int wynik = liczba1 - liczba2;
            String tekst = String.valueOf(wynik);
            ko_jTextFieldDzialania.setText(liczba1+ " - " + liczba2+" = " + tekst);
            temp = "";
        }else if(znak.equals("/")){
            if(liczba2 == 0){
                ko_jTextFieldDzialania.setText("Nie da sie dzielić przez 0");
                temp = "";
            }else{
                int wynik = liczba1 / liczba2;
                String tekst = String.valueOf(wynik);
                ko_jTextFieldDzialania.setText(liczba1+ " / " + liczba2+" = " + tekst);
                temp = "";
            }
        }else if(znak.equals("*")){
            int wynik = liczba1 * liczba2;
            String tekst = String.valueOf(wynik);
            ko_jTextFieldDzialania.setText(liczba1+ " * " + liczba2+" = " + tekst);
            temp = "";
        }else if(znak.equals("potega")){
            double wynik = Math.pow(liczba1,liczba2);
            String tekst = String.valueOf(wynik);
            ko_jTextFieldDzialania.setText(liczba1+ "^" + liczba2+" = " + tekst);
            temp = "";
        }
    }//GEN-LAST:event_ko_jButtonWynikActionPerformed

    private void ko_jMenuItemZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jMenuItemZamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ko_jMenuItemZamknijActionPerformed

    private void ko_jMenuItemOProgramieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jMenuItemOProgramieActionPerformed
         JOptionPane.showMessageDialog(null, "Kalkulator (jednodziałaniowy). IN DEVELOPMENT");
    }//GEN-LAST:event_ko_jMenuItemOProgramieActionPerformed

    private void ko_jMenuItemIleDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_jMenuItemIleDniActionPerformed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        JOptionPane.showInputDialog("Wprowadź datę w formacie dd mm yyyy np. 26.11.2003");
    }//GEN-LAST:event_ko_jMenuItemIleDniActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton ko_jButton0;
    private javax.swing.JButton ko_jButton1;
    private javax.swing.JButton ko_jButton2;
    private javax.swing.JButton ko_jButton3;
    private javax.swing.JButton ko_jButton4;
    private javax.swing.JButton ko_jButton5;
    private javax.swing.JButton ko_jButton6;
    private javax.swing.JButton ko_jButton7;
    private javax.swing.JButton ko_jButton8;
    private javax.swing.JButton ko_jButton9;
    private javax.swing.JButton ko_jButtonDzielenie;
    private javax.swing.JButton ko_jButtonMinus;
    private javax.swing.JButton ko_jButtonMnozenie;
    private javax.swing.JButton ko_jButtonPierwiastek;
    private javax.swing.JButton ko_jButtonPlus;
    private javax.swing.JButton ko_jButtonPotega;
    private javax.swing.JButton ko_jButtonUsun;
    private javax.swing.JButton ko_jButtonWynik;
    private javax.swing.JMenuItem ko_jMenuItemIleDni;
    private javax.swing.JMenuItem ko_jMenuItemOProgramie;
    private javax.swing.JMenuItem ko_jMenuItemZamknij;
    private javax.swing.JMenu ko_jMenuPlik;
    private javax.swing.JMenu ko_jMenuTools;
    private javax.swing.JPanel ko_jPanelGlowny;
    private javax.swing.JTextField ko_jTextFieldDzialania;
    // End of variables declaration//GEN-END:variables
}
