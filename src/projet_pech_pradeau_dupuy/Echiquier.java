/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Rapha�l
 */
public class Echiquier {
   
    private int taille;
    private boolean[][] casesAllumees;

    public Echiquier(int taille) {
        this.taille = taille;
        this.casesAllumees = new boolean[taille][taille];
        initialiserEchiquier();
    }

    private void initialiserEchiquier() {
        // Initialiser l'�chiquier avec des cases allum�es al�atoirement
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                casesAllumees[i][j] = Math.random() > 0.5;
            }
        }
    }

    public boolean estAllumee(int ligne, int colonne) {
        // V�rifier si la case � la position donn�e est allum�e
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            return casesAllumees[ligne][colonne];
        } else {
            // G�rer les coordonn�es invalides (peut �tre adapt� en fonction de vos besoins)
            System.out.println("Coordonn�es invalides.");
            return false;
        }
    }

    public void eteindreCase(int ligne, int colonne) {
        // �teindre la case � la position donn�e
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            casesAllumees[ligne][colonne] = false;
        } else {
            // G�rer les coordonn�es invalides
            System.out.println("Coordonn�es invalides.");
        }
    }

    // Ajoutez d'autres m�thodes selon les besoins de votre jeu
}

    

