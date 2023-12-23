/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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

    /**
     *
     * @return ligne d'une case
     */
    public int getLigne() {
        return ligne;
    }

    /**
     *
     * @return colonne d'une case
     */
    public int getColonne() {
        return colonne;
    }

    /**
     *
     * @param colonne
     * change la valeur de la colonne d'une case
     */
    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    /**
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        System.out.println(caseAssociee);
        int w = this.getWidth();
        int h = this.getHeight();
        if (caseAssociee.getEtat() == 1) {
        Color green2 = new Color(37, 109, 12);     
        g.setColor(green2);
        g.fillRect(2, 2, w - 4, h - 4);
        }
      
      
        //g.setColor(Color.red);

        
        
        if (caseAssociee.getEtat() == 2) {
            g.setColor(Color.white);
                    BufferedImage image = null;
        try {
             image = ImageIO.read(new File("./src/Images/pion21.png"));
        } catch (IOException e) {
            System.out.println(e.getCause());
            e.printStackTrace();

        }
      
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        ///g.setColor(Color.red);

        }
             //   g.fillRect(2, 2, w - 4, h - 4);

        if (caseAssociee.getEtat() == 3) {
            g.setColor(Color.white);
       g.fillRect(2, 2, w - 4, h - 4);

        
        BufferedImage image = null;
        try {
             image = ImageIO.read(new File("./src/Images/cavalierfinal1.png"));
        } catch (IOException e) {
            System.out.println(e.getCause());
            e.printStackTrace();

        }
      //  g.fillRect(4, 4, 40, 40);
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        ///g.setColor(Color.red);

    }
    }
}

