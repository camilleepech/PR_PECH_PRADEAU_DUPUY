/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Rapha�l
 */
public class Fenetrebvn extends javax.swing.JFrame {

    /**
     * Creates new form Fenetrebvn
     */
    public Fenetrebvn() {
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

        moyenbtn = new javax.swing.JButton();
        partiesimple = new javax.swing.JButton();
        facilebtn = new javax.swing.JButton();
        difficilebtn = new javax.swing.JButton();
        reglesbtn = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        photoFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moyenbtn.setBackground(new java.awt.Color(220, 218, 181));
        moyenbtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        moyenbtn.setText("MOYEN");
        moyenbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(147, 78, 10)));
        moyenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moyenbtnActionPerformed(evt);
            }
        });
        getContentPane().add(moyenbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 70, 30));

        partiesimple.setBackground(new java.awt.Color(220, 218, 181));
        partiesimple.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        partiesimple.setText("ARCADE");
        partiesimple.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(147, 79, 10)));
        partiesimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partiesimpleActionPerformed(evt);
            }
        });
        getContentPane().add(partiesimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 100, 40));

        facilebtn.setBackground(new java.awt.Color(220, 218, 181));
        facilebtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        facilebtn.setText("FACILE");
        facilebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(147, 78, 10)));
        facilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(facilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 70, 30));

        difficilebtn.setBackground(new java.awt.Color(220, 218, 181));
        difficilebtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        difficilebtn.setText("DIFFICILE");
        difficilebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(147, 78, 10)));
        difficilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(difficilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 80, 30));

        reglesbtn.setBackground(new java.awt.Color(220, 218, 181));
        reglesbtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        reglesbtn.setText("Comment jouer ?");
        reglesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(147, 78, 10)));
        reglesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglesbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reglesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 130, 30));

        quitter.setBackground(new java.awt.Color(220, 218, 181));
        quitter.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        quitter.setText("QUITTER");
        quitter.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(147, 78, 10)));
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        getContentPane().add(quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 130, 30));

        jButton6.setBackground(new java.awt.Color(220, 218, 181));
        jButton6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton6.setText("CHRONO :");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(147, 78, 10)));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 100, 30));

        photoFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bienvenue.png"))); // NOI18N
        photoFond.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(photoFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partiesimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partiesimpleActionPerformed
       FenetrePrincipale fenetre = new FenetrePrincipale(1,1);
        fenetre.setVisible(true);// TODO add your handling code here:
        setVisible(false);// TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_partiesimpleActionPerformed

    private void facilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilebtnActionPerformed
        FenetrePrincipale fenetre = new FenetrePrincipale(2,90);
        fenetre.setVisible(true);// TODO add your handling code here:
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_facilebtnActionPerformed

    private void difficilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficilebtnActionPerformed
        FenetrePrincipale fenetre = new FenetrePrincipale(2,30);
        fenetre.setVisible(true);// TODO add your handling code here:
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_difficilebtnActionPerformed

    private void moyenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moyenbtnActionPerformed
        FenetrePrincipale fenetre = new FenetrePrincipale(2,60);
        fenetre.setVisible(true);// TODO add your handling code here:
        setVisible(false);// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_moyenbtnActionPerformed

    private void reglesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglesbtnActionPerformed
     regles fen = new regles();
     fen.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_reglesbtnActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
     System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_quitterActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetrebvn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetrebvn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetrebvn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetrebvn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetrebvn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton difficilebtn;
    private javax.swing.JButton facilebtn;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton moyenbtn;
    private javax.swing.JButton partiesimple;
    private javax.swing.JLabel photoFond;
    private javax.swing.JButton quitter;
    private javax.swing.JButton reglesbtn;
    // End of variables declaration//GEN-END:variables
}
