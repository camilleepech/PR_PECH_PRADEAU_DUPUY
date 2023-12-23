/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Rapha�l
 */
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;
public class FenetrePrincipale extends javax.swing.JFrame {
    Echiquier echiquier;
    private int compteur;
    int score;
    int nbSec;
    Timer chrono;
    int partie;
    int partie1;
    int jok;
   
    /**
     * Creates new form FenetrePrincipale
     */
    
    public FenetrePrincipale() {
    initComponents();
    }
    

    public FenetrePrincipale(int partie, int niv) {
        initComponents();
        partie1 = partie;
        compteur = 0;
        score = 0;
        jok = 1;
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
            }
        }
        depart();
        
       
        if (partie==1){
            chronobtn.setVisible(false);
        }
        if (partie == 2){
            
         nbSec = niv;
        ActionListener tache_recurrente = new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                
                nbSec--;
                System.out.println(nbSec);
                chronobtn.setText(nbSec + "");
                if (nbSec == 0){
                    chrono.stop();
                    fenetredefaite f2 = new fenetredefaite();
                    f2.setVisible(true);
                    setVisible(false);
                }
            }
            ;
        };
        
        
        /* instanciation du timer */
        chrono = new Timer(1000, tache_recurrente);
        
        chrono.start();}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelEchiquier = new javax.swing.JPanel();
        scorebtn = new javax.swing.JLabel();
        chronobtn = new javax.swing.JButton();
        joker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEchiquier.setBackground(new java.awt.Color(255, 255, 255));
        PanelEchiquier.setMaximumSize(new java.awt.Dimension(1440, 1080));
        PanelEchiquier.setPreferredSize(new java.awt.Dimension(510, 510));

        javax.swing.GroupLayout PanelEchiquierLayout = new javax.swing.GroupLayout(PanelEchiquier);
        PanelEchiquier.setLayout(PanelEchiquierLayout);
        PanelEchiquierLayout.setHorizontalGroup(
            PanelEchiquierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        PanelEchiquierLayout.setVerticalGroup(
            PanelEchiquierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        scorebtn.setText("Score : 0");

        chronobtn.setText("jButton1");

        joker.setText("Relance");
        joker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(PanelEchiquier, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chronobtn)
                    .addComponent(joker))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(PanelEchiquier, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(scorebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(chronobtn)
                        .addGap(65, 65, 65)
                        .addComponent(joker)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokerActionPerformed
        echiquier.eteindreTout();
        depart();
        joker.setVisible(false);
        repaint();
        jok--;
    }//GEN-LAST:event_jokerActionPerformed

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
    
    private void relance(){
        int a = echiquier.nombrelum();
        if (a==0){
            depart();
        }
    }
    private void depart(){
            echiquier.parcours();
            if (jok==1){
                joker.setVisible(true);
            }
            }
            
private void onCaseClicked(CaseGraphique caseCliquee) {

    int newligne = caseCliquee.getLigne();
    int newcolonne = caseCliquee.getColonne();
    int ligne = echiquier.CoordCavalierX();
    int colonne = echiquier.CoordCavalierY();
    joker.setVisible(false);
    echiquier.verif(ligne, colonne, newligne, newcolonne);
   if (echiquier.verif(ligne, colonne, newligne, newcolonne)==true && (echiquier.grid[newligne][newcolonne].getEtat()==2)){

       echiquier.grid[ligne][colonne].setEtat(1);
        echiquier.grid[newligne][newcolonne].setEtat(3);

   compteur++;
       int a = echiquier.nombrelum();
        if (a==0 && compteur == 10){
                compteur = 0;
                score ++;
                scorebtn.setText("Score : " + score);
                if (partie1==2 && score==1){
                    scorebtn.setText("gagn�");
                    fenetreVictoire f3 = new fenetreVictoire(nbSec);
                    f3.setVisible(true);
                    setVisible(false);
                }
                depart();
        }
        if (echiquier.verifMouvementsPossibles(newligne, newcolonne)==false && a!=0 ){
           
            fenetredefaite f2 = new fenetredefaite(score);
          f2.setVisible(true);
          setVisible(false);
          depart();
          compteur = 0;
       }
   
        // relance();
    repaint();
   }
   
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEchiquier;
    private javax.swing.JButton chronobtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joker;
    private javax.swing.JLabel scorebtn;
    // End of variables declaration//GEN-END:variables
}

