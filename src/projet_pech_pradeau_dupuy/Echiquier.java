 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author Raphaël
 */
public class Echiquier {
   
    private int taille = 10;
    Case[][] grid;

    /**
     *grille remplies de cases eteintes, allumées, et une case contient le cavalier
     * @param taille
     */
    public Echiquier(int taille) {
        grid = new Case[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                grid[i][j] = new Case();
            }
        }

    }

    /**
     *
     * @return taille de la grille
     */
    public int getTaille() {
        return taille;
    }

    /**
     *
     * @param ligne
     * @param colonne
     * @return true si la case aux coordonées en paramètres est allumée, sinon false
     */
    public boolean estAllumee(int ligne, int colonne) {
       
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne < taille) {
            if (grid[ligne][colonne].getEtat()==2);
            return true;
        } else {
           
            System.out.println("Coordonnées invalides.");
            return false;
        }
    }

    /**
     *
     * @param ligne
     * @param colonne
     * allume la case (etat 2) dont on a rentré les coordonnées
     */
    public void allumerCase(int ligne, int colonne) {
        // Éteindre la case à la position donnée
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].allumer();
        } else {
            // Gérer les coordonnées invalides
            System.out.println("Coordonnées invalides .");
        }
    }

    /**
     *
     * @param ligne
     * @param colonne
     * eteint la case (etat 1) dont on a rentré les coordonnées
     */
    public void eteindreCase(int ligne, int colonne) {
       
        if (ligne >= 0 && ligne < taille && colonne >= 0 && colonne <= taille) {
            grid[ligne][colonne].eteindre();
        } else {
           
            System.out.println("Coordonnées invalides .");
        }
    }

    /**
     *
     * @param ligne
     * @param colonne
     * Change l'etat de la case pour 3 (cavalier) 
     */
    public void CaseCavalier(int ligne, int colonne) {
            grid[ligne][colonne].cavalier();
    
        }

    /**
     *
     * @param x
     * @param y
     * @param newx
     * @param newy
     * @return true si le mouvement est possible, sinon false
     */
    public boolean verif(int x,int y,int newx,int newy){
            int diffx = Math.abs(newx - x);
            int diffy = Math.abs(newy - y);
            return (diffx == 2 && diffy == 1) || (diffx == 1 && diffy == 2);
        }

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     *  effectue le mouvement si celui est possible
     */
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
    
    /**
     *crée un parcours aléatoire avec le cavalier en position 5,5. allume 10 cases
     */
    public void parcours() {
            
        Random random = new Random();
        int nb = 1;
        int cpt=0;
          int currentX = 5;
        int currentY = 5;
        
         do {
          eteindreTout();
          cpt =0;
          currentX = 5;
         currentY = 5;
        grid[currentX][currentY].allumer();
      
        for (int i = 0; i <10; i++) {
            cpt++;
            int randomDirection= random.nextInt(8 ); 

            switch (randomDirection) {
                case 0 -> movehautgauche(currentX,currentY);
                case 1 -> movehautdroite(currentX,currentY);
                case 2 -> movebasgauche(currentX,currentY);
                case 3 -> movebasdroite(currentX,currentY);
                case 4 -> movegauchehaut(currentX,currentY);
                case 5 -> movegauchebas(currentX,currentY);
                case 6 -> movedroitehaut(currentX,currentY);
                case 7 -> movedroitebas(currentX,currentY);
                default -> {
                }
                
            }
       
            currentX = CoordCavalierX();
            currentY = CoordCavalierY();
            grid[currentX][currentY].allumer();
         
            if (i == nombrelum()-1){
                i--;
            }
            if (cpt==100) { break;} 
        
        }
     }
     while (cpt ==100);
        
         currentX = CoordCavalierX();
        currentY = CoordCavalierY();
   
        grid[5][5].cavalier();
    }
    
    /**
     *
     * @param x
     * @param y
     * mouvement cavalier haut à gauche
     */
    public void movehautgauche(int x,int y) {
        int newRow = x - 2;
        int newCol = y - 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
          grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3); 
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     *
     * @param x
     * @param y
     * mouvement cavalier haut à droite
     */
    public void movehautdroite(int x,int y) {
        int newRow = x - 2;
        int newCol = y + 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
          grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);  
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     *
     * @param x
     * @param y
     * mouvement cavalier bas à gauche
     */
    public void movebasgauche(int x,int y) {
        int newRow = x + 2;
        int newCol = y - 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     *
     * @param x
     * @param y
     * mouvement cavalier en bas à droite
     */
    public void movebasdroite(int x,int y) {
        int newRow = x + 2;
        int newCol = y + 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
           grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }
    
    /**
     *
     * @param x
     * @param y
     * mouvement cavalier à gauche en haut
     */
    public void movegauchehaut(int x,int y) {
        int newRow = x - 1;
        int newCol = y - 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);  
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     *
     * @param x
     * @param y
     *  mouvement cavalier à gauche en bas
     */
    public void movegauchebas(int x,int y) {
        int newRow = x + 1;
        int newCol = y - 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     * mouvement cavalier à droite en haut
     * @param x
     * @param y
     */
    public void movedroitehaut(int x,int y) {
 
        int newRow = x - 1;
        int newCol = y + 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     * mouvement cavalier à droite en bas
     * @param x
     * @param y
     */
    public void movedroitebas(int x,int y) {
        int newRow = x + 1;
        int newCol = y + 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }

    /**
     *
     * @return coordonnée en X du cavalier de la grille
     */
    public int CoordCavalierX (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                if (grid[i][j].etat == 3) {
                    return i;
                }
            }
        }
        return 0;
    }

    /**
     *
     * @return coordonnée en Y du cavalier de la grille
     */
    public int CoordCavalierY (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                if (grid[i][j].etat == 3){
                    return j;
                }
            }
        }
        return 0;
    }

    /**
     *eteint toutes les cases du tableau (etat 1)
     */
    public void eteindreTout (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                grid[i][j].setEtat(1);
                }
        }
    }

    /**
     *
     * @return le nombre de cases allumées (etat 2) dans la grille
     */
    public int nombrelum (){
            int nb = 0;
            for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                if (grid[i][j].etat == 2){
                    nb +=1;
                }
            }
        }
                
               

        return nb;
    }

    /**
     *
     * @param x
     * @param y
     * @return true si le cavalier peut toujours réaliser un mouvement, sinon false
     */
    public boolean verifMouvementsPossibles(int x, int y) {
    // Vérifiez si des mouvements sont possibles à partir des coordonnées (x, y)
    if (isValidMove(x - 2, y - 1) && grid[x - 2][y - 1].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x - 2, y + 1) && grid[x - 2][y + 1].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x + 2, y - 1) && grid[x + 2][y - 1].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x + 2, y + 1) && grid[x + 2][y + 1].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x - 1, y - 2) && grid[x - 1][y - 2].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x + 1, y - 2) && grid[x + 1][y - 2].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x - 1, y + 2) && grid[x - 1][y + 2].getEtat() == 2) {
        return true;
    }
    if (isValidMove(x + 1, y + 2) && grid[x + 1][y + 2].getEtat() == 2) {
        return true;
    }

    return false;
}

    // Ajoutez d'autres méthodes selon les besoins de votre jeu

  
}

    

