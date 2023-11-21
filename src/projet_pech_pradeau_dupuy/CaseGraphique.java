/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Camille
 */
public class CaseGraphique extends JButton {
    Case caseAssociee;
    int largeur;
    int longueur;
    int ligne;
    int colonne;

    public CaseGraphique(Case caseAssociee, int largeur, int longueur, int ligne, int colonne) {
        super();
        this.caseAssociee = caseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }



    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }


   
    protected void paintComponent(Graphics g) {
    int w = this.getWidth();
    int h = this.getHeight();
    if (caseAssociee.getEtat() == 1) {
    g.setColor(Color.getHSBColor(340, 33, 100));
    } if(caseAssociee.getEtat()==2){
    g.setColor(Color.white);
    } if (caseAssociee.getEtat()==3) {
        g.setColor(Color.blue  );
        
    }
     g.fillRect(2, 2, w - 4, h - 4);
    }
    
    
}
