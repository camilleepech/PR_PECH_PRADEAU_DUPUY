 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;
import java.lang.Math;
/**
 *
 * @author Raphaël
 */
public class Echiquier {
   
    private int taille = 10;
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
        public boolean verif(int x,int y,int newx,int newy){
            int diffx = Math.abs(newx - x);
            int diffy = Math.abs(newy - y);
            return (diffx == 2 && diffy == 1) || (diffx == 1 && diffy == 2);
        }
    public void deplacementPossible(int x1,int y1,int x2,int y2){
         int diffx = Math.abs(x1 - x2);
         int diffy = Math.abs(y1 - y2);
        if (grid[x1][y1].presenceCavalier()==true && grid[x2][y2].presenceLumiere()==true){
            if (diffx>=1 && diffy>=1 && diffx+diffy == 3){
                grid[x1][y1].eteindre();
                grid[x2][y2].cavalier();
            }
    }
    }
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < getTaille() && col >= 0 && col < getTaille();
    }
    public void movehautgauche() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x - 2;
        int newCol = y - 1;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2); 
        }
    }
    public void movehautdroite() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x - 2;
        int newCol = y + 1;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2);  
        }
    }
    public void movebasgauche() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x + 2;
        int newCol = y - 1;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2);
        }
    }
    public void movebasdroite() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x + 2;
        int newCol = y + 1;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2);
        }
    }
    public void movegauchehaut() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x - 1;
        int newCol = y - 2;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2);  
        }
    }
    public void movegauchebas() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x - 1;
        int newCol = y + 2;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2);
        }
    }
        public void movedroitehaut() {
        int x = CoordCavalierX();
        int y = CoordCavalierY();
        int newRow = x - 1;
        int newCol = y + 2;
        
        if (isValidMove(newRow, newCol)) {
            grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(2);
        }
    }
    public int CoordCavalierX (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                if (grid[i][j].etat == 3) {
                    return i;
                }
            }
        }
        return 10;
    }
        public int CoordCavalierY (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                if (grid[i][j].etat == 3){
                    return j;
                }
            }
        }
        return 12;
    }
    

    // Ajoutez d'autres méthodes selon les besoins de votre jeu

    @Override
    public String toString() {
        return "Echiquier{" + "taille=" + taille + ", grid=" + grid + '}';
    }
}

    

