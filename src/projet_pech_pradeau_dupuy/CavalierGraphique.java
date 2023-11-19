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
public class CavalierGraphique extends JButton {
    Cavalier cavalierAssocie;
    int largeur;
    int longueur;
    int ligne;
    int colonne;

    public CavalierGraphique(Cavalier cavalierAssocie, int largeur, int longueur, int ligne, int colonne) {
        this.cavalierAssocie = cavalierAssocie;
        this.largeur = largeur;
        this.longueur = longueur;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
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
     g.fillOval(2, 2, w - 4, h - 4);
     g.setColor(Color.BLACK);
    }
}
