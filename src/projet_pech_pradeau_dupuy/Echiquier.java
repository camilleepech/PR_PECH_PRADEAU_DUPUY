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
        // Initialiser l'�chiquier avec des cases allum�es al�atoirement
      //  for (int i = 0; i < taille; i++) {
        //    for (int j = 0; j < taille; j++) {
    //            casesAllumees[i][j] = Math.random() > 0.5;
      //      }
 //       }
  //  }

 
    public boolean estAllumee(int ligne, int colonne) {
        // V�rifier si la case � la position donn�e est allum�e
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            if (grid[ligne][colonne].getEtat()==2);
            return true;
        } else {
            // G�rer les coordonn�es invalides (peut �tre adapt� en fonction de vos besoins)
            System.out.println("Coordonn�es invalides.");
            return false;
        }
    }
    public void allumerCase(int ligne, int colonne) {
        // �teindre la case � la position donn�e
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].allumer();
        } else {
            // G�rer les coordonn�es invalides
            System.out.println("Coordonn�es invalides .");
        }
    }

    public void eteindreCase(int ligne, int colonne) {
        // �teindre la case � la position donn�e
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].eteindre();
        } else {
            // G�rer les coordonn�es invalides
            System.out.println("Coordonn�es invalides .");
        }
    }
     public void CaseCavalier(int ligne, int colonne) {
        // �teindre la case � la position donn�e
       // if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].cavalier();
       // } else {
         //   // G�rer les coordonn�es invalides
           // System.out.println("Coordonn�es invalides.");
        }
    

    

    // Ajoutez d'autres m�thodes selon les besoins de votre jeu

    @Override
    public String toString() {
        return "Echiquier{" + "taille=" + taille + ", grid=" + grid + '}';
    }
}

    

