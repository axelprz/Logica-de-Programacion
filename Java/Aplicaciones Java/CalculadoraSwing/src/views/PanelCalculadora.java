/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

public class PanelCalculadora extends javax.swing.JFrame {

    public PanelCalculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setEnabled(false);
        setUndecorated(true);

        jPanelBackground.setBackground(new java.awt.Color(216, 216, 216));
        jPanelBackground.setEnabled(false);
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("12647.4");
        jPanelBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 90));

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 34, 34));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("5454765*98");
        jPanelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 40));

        jButton2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 14, 24));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton2.setText(",");
        jButton2.setBorderPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 55, 55));

        jButton8.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(5, 12, 15));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.jpg"))); // NOI18N
        jButton8.setText("/");
        jButton8.setBorderPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 55, 55));

        jButton12.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(5, 12, 15));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.jpg"))); // NOI18N
        jButton12.setText("+");
        jButton12.setBorderPainted(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 55, 55));

        jButton16.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(5, 12, 15));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.jpg"))); // NOI18N
        jButton16.setText("-");
        jButton16.setBorderPainted(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 55, 55));

        jButton17.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 14, 24));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.jpg"))); // NOI18N
        jButton17.setText("0");
        jButton17.setBorderPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 125, 55));

        jButton20.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(5, 12, 15));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.jpg"))); // NOI18N
        jButton20.setText("=");
        jButton20.setBorderPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 55, 55));

        jButton18.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 14, 24));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton18.setText("AC");
        jButton18.setBorderPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 55, 55));

        jButton21.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 14, 24));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton21.setText("D");
        jButton21.setBorderPainted(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 55, 55));

        jButton23.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 14, 24));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton23.setText("7");
        jButton23.setBorderPainted(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 55, 55));

        jButton24.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 14, 24));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton24.setText("8");
        jButton24.setBorderPainted(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 55, 55));

        jButton25.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 14, 24));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton25.setText("9");
        jButton25.setBorderPainted(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 55, 55));

        jButton26.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 14, 24));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton26.setText("4");
        jButton26.setBorderPainted(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 55, 55));

        jButton27.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 14, 24));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton27.setText("5");
        jButton27.setBorderPainted(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 55, 55));

        jButton28.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 14, 24));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton28.setText("6");
        jButton28.setBorderPainted(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 55, 55));

        jButton29.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 14, 24));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton29.setText("1");
        jButton29.setBorderPainted(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 55, 55));

        jButton30.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 14, 24));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton30.setText("2");
        jButton30.setBorderPainted(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 55, 55));

        jButton31.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 14, 24));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        jButton31.setText("3");
        jButton31.setBorderPainted(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 55, 55));

        jButton22.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(5, 12, 15));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.jpg"))); // NOI18N
        jButton22.setText("x");
        jButton22.setBorderPainted(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 55, 55));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLightMode.jpg"))); // NOI18N
        jButton1.setBorderPainted(false);
        jPanelBackground.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 152, 55, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnMinimizar.jpg"))); // NOI18N
        jButton3.setBorderPainted(false);
        jPanelBackground.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 30, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCerrar.jpg"))); // NOI18N
        jButton4.setBorderPainted(false);
        jPanelBackground.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelBackground;
    // End of variables declaration//GEN-END:variables
}
