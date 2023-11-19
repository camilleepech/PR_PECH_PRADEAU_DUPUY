/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Rapha�l
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FenetrePrincipale extends javax.swing.JFrame {
    Echiquier echiquier;
    Cavalier joueur;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int taille = 10;
            this.echiquier= new Echiquier(taille);
        PanelEchiquier.setLayout(new GridLayout(taille, taille));
        for (int i=0; i < taille; i++) {
        for (int j=0; j < taille; j++ ) {
        CaseGraphique bouton_cellule = new CaseGraphique( echiquier.grid[i][j], 1440/taille,1080/taille,i ,j);
            bouton_cellule.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Appeler votre fonction ici
                    onCaseClicked(bouton_cellule);
                }
            });
        PanelEchiquier.add(bouton_cellule);
        
        if (i==0 && j==0) {
            this.joueur = new Cavalier (echiquier, i,j);
           CavalierGraphique joueurg = new CavalierGraphique(echiquier.grid[i][j],joueur,i,j,20,20);
            PanelEchiquier.remove(bouton_cellule);
           PanelEchiquier.add(joueurg);
       }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEchiquier = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEchiquier.setBackground(new java.awt.Color(255, 153, 0));
        PanelEchiquier.setMaximumSize(new java.awt.Dimension(1440, 1080));

        javax.swing.GroupLayout PanelEchiquierLayout = new javax.swing.GroupLayout(PanelEchiquier);
        PanelEchiquier.setLayout(PanelEchiquierLayout);
        PanelEchiquierLayout.setHorizontalGroup(
            PanelEchiquierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        PanelEchiquierLayout.setVerticalGroup(
            PanelEchiquierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(PanelEchiquier, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 620, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }}
        );
    }
private void onCaseClicked(CaseGraphique caseCliquee) {
    // Mettez ici le code que vous souhaitez ex�cuter lorsque la case est cliqu�e
    System.out.println("Case cliqu�e : " + caseCliquee);
     int ligne = caseCliquee.getLigne();
     int colonne = caseCliquee.getColonne();
    echiquier.grid[ligne][colonne].allumer();
    
    // Ajoutez votre logique de jeu ici
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEchiquier;
    // End of variables declaration//GEN-END:variables
}
