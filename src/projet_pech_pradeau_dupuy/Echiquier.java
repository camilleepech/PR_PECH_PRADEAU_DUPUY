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
    Case[][] grid;

    public Echiquier(int taille) {
        grid = new Case[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                grid[i][j] = new Case();
            }
        }

    }

    public int getTaille() {
        return taille;
    }

    //private void initialiserEchiquier() {
        // Initialiser l'échiquier avec des cases allumées aléatoirement
      //  for (int i = 0; i < taille; i++) {
        //    for (int j = 0; j < taille; j++) {
    //            casesAllumees[i][j] = Math.random() > 0.5;
      //      }
 //       }
  //  }

 
    public boolean estAllumee(int ligne, int colonne) {
        // Vérifier si la case à la position donnée est allumée
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            if (grid[ligne][colonne].getEtat()==2);
            return true;
        } else {
            // Gérer les coordonnées invalides (peut être adapté en fonction de vos besoins)
            System.out.println("Coordonnées invalides.");
            return false;
        }
    }
    public void allumerCase(int ligne, int colonne) {
        // Éteindre la case à la position donnée
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].allumer();
        } else {
            // Gérer les coordonnées invalides
            System.out.println("Coordonnées invalides .");
        }
    }

    public void eteindreCase(int ligne, int colonne) {
        // Éteindre la case à la position donnée
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].eteindre();
        } else {
            // Gérer les coordonnées invalides
            System.out.println("Coordonnées invalides .");
        }
    }
     public void CaseCavalier(int ligne, int colonne) {
        // Éteindre la case à la position donnée
       // if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].cavalier();
       // } else {
         //   // Gérer les coordonnées invalides
           // System.out.println("Coordonnées invalides.");
        }
    

    

    // Ajoutez d'autres méthodes selon les besoins de votre jeu

    @Override
    public String toString() {
        return "Echiquier{" + "taille=" + taille + ", grid=" + grid + '}';
    }
}

    

