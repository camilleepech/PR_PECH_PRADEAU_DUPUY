/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Raphaël
 */

import java.util.Random;

public class GrilleDeCellules {
    private final CelluleLumineuse[][] matriceCellules;

    public GrilleDeCellules(int taille) {
        matriceCellules = new CelluleLumineuse[taille][taille];
        initialiserGrille();
        melangerMatriceAleatoirement(100); // Mélangez la grille aléatoirement.
    }

    private void initialiserGrille() {
        for (int i = 0; i < matriceCellules.length; i++) {
            for (int j = 0; j < matriceCellules[i].length; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    


    public void activerLigneDeCellules(int idLigne) {
        for (CelluleLumineuse cellule : matriceCellules[idLigne]) {
            cellule.inverserEtat();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (CelluleLumineuse[] ligne : matriceCellules) {
            ligne[idColonne].inverserEtat();
        }
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][i].inverserEtat();
        }
    }

    public void activerDiagonaleMontante() {
        int n = matriceCellules.length;
        for (int i = 0; i < n; i++) {
            matriceCellules[i][n - i - 1].inverserEtat();
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4);

        switch (choix) {
            case 0:
                int ligne = random.nextInt(matriceCellules.length);
                activerLigneDeCellules(ligne);
                break;
            case 1:
                int colonne = random.nextInt(matriceCellules.length);
                activerColonneDeCellules(colonne);
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public boolean estResolue() {
        for (CelluleLumineuse[] ligne : matriceCellules) {
            for (CelluleLumineuse cellule : ligne) {
                if (cellule.estAllumee()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean cellulesToutesEteintes() {
        for (CelluleLumineuse[] ligne : matriceCellules) {
            for (CelluleLumineuse cellule : ligne) {
                if (cellule.estAllumee()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void afficherGrille() {
        int taille = matriceCellules.length;

        // Affiche les indices de colonnes (numéros) en face des cases de colonnes
        System.out.print("     ");
        for (int i = 0; i < taille; i++) {
            System.out.print("  " + (i + 1) + "  ");
        }
        System.out.println();

        for (int i = 0; i < taille; i++) {
            // Affiche une ligne horizontale de barres supérieures
            for (int j = 0; j < taille + 1; j++) {
                System.out.print("----+");
            }
            System.out.println();

            // Affiche les indices de lignes (lettres)
            System.out.print(" " + (char) ('A' + i) + "  |");

            // Affiche les cellules de la ligne
            for (int j = 0; j < taille; j++) {
                System.out.print("  " + matriceCellules[i][j] + " |");
            }
            System.out.println();
        }

        // Affiche la dernière ligne horizontale de barres inférieures
        for (int j = 0; j < taille + 1; j++) {
            System.out.print("----+");
        }
        System.out.println();
    }

    public int getTaille() {
        return matriceCellules.length;
    }
}

    

