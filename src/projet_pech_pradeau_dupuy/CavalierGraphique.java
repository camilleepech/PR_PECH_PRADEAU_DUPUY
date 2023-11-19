/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Camille
 */
public class CavalierGraphique extends JButton {
    Case caseAssociee;
    Cavalier cavalierAssocie;
    int largeur;
    int longueur;
    int ligne;
    int colonne;
    private ImageIcon icon;

    public CavalierGraphique(Case caseAssociee, Cavalier cavalierAssocie, int largeur, int longueur, int ligne, int colonne) {
        this.caseAssociee = caseAssociee;
        this.cavalierAssocie = cavalierAssocie;
        this.largeur = largeur;
        this.longueur = longueur;
        this.ligne = ligne;
        this.colonne = colonne;
         try {
    icon = new ImageIcon("Image bienvenue.png");
} catch (Exception e) {
    e.printStackTrace();
}
        // Configurer la taille du bouton
        setSize(largeur, longueur);

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
      super.paintComponent(g);
// Dessiner l'image
        Image image = icon.getImage();
        g.drawImage(image, 0,0, getWidth(), getHeight(), this);
     g.setColor(Color.BLACK);
    
    }
}
