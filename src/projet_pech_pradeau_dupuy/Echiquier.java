/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Raphaël
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
        // Initialiser l'échiquier avec des cases allumées aléatoirement
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                casesAllumees[i][j] = Math.random() > 0.5;
            }
        }
    }

    public boolean estAllumee(int ligne, int colonne) {
        // Vérifier si la case à la position donnée est allumée
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            return casesAllumees[ligne][colonne];
        } else {
            // Gérer les coordonnées invalides (peut être adapté en fonction de vos besoins)
            System.out.println("Coordonnées invalides.");
            return false;
        }
    }

    public void eteindreCase(int ligne, int colonne) {
        // Éteindre la case à la position donnée
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            casesAllumees[ligne][colonne] = false;
        } else {
            // Gérer les coordonnées invalides
            System.out.println("Coordonnées invalides.");
        }
    }

    // Ajoutez d'autres méthodes selon les besoins de votre jeu
}

    

