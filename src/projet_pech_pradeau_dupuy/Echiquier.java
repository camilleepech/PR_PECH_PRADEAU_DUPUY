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
    public void parcours() {
        int currentX = 5;
        int currentY = 5;
        Random random = new Random();

        for (int i = 0; i <30; i++) {
            int randomDirection= random.nextInt(8); // 8 possible directions

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
            System.out.println("tour : " +i+1);
            System.out.println(currentX);
            System.out.println(currentY);
            currentX = CoordCavalierX();
            currentY = CoordCavalierY();
            grid[currentX][currentY].allumer();
              System.out.println(this);
        
        }
         currentX = CoordCavalierX();
        currentY = CoordCavalierY();
    //    grid[0][0].eteindre();
        grid[5][5].cavalier();
    }

    public void movehautgauche(int x,int y) {
   //     int x = CoordCavalierX();
     //   int y = CoordCavalierY();
        int newRow = x - 2;
        int newCol = y - 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
          grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3); 
        }else{
            grid[x][y].cavalier();
        }
    }
    public void movehautdroite(int x,int y) {
    //    int x = CoordCavalierX();
      //  int y = CoordCavalierY();
        int newRow = x - 2;
        int newCol = y + 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
          grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);  
        }else{
            grid[x][y].cavalier();
        }
    }
    public void movebasgauche(int x,int y) {
 //       int x = CoordCavalierX();
   //     int y = CoordCavalierY();
        int newRow = x + 2;
        int newCol = y - 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }
    public void movebasdroite(int x,int y) {
//        int x = CoordCavalierX();
  //      int y = CoordCavalierY();
        int newRow = x + 2;
        int newCol = y + 1;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
           grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }
    
    //
    public void movegauchehaut(int x,int y) {
  //      int x = CoordCavalierX();
    //    int y = CoordCavalierY();
        int newRow = x - 1;
        int newCol = y - 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);  
        }else{
            grid[x][y].cavalier();
        }
    }
    public void movegauchebas(int x,int y) {
 //       int x = CoordCavalierX();
   //     int y = CoordCavalierY();
        int newRow = x + 1;
        int newCol = y - 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
      //      grid[x][y].eteindre();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }
        public void movedroitehaut(int x,int y) {
 //     int x = CoordCavalierX();
    //    int y = CoordCavalierY();
        int newRow = x - 1;
        int newCol = y + 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
        }
    }
                public void movedroitebas(int x,int y) {
       // int x = CoordCavalierX();
      //  int y = CoordCavalierY();
        int newRow = x + 1;
        int newCol = y + 2;
        
        if (isValidMove(newRow, newCol) && (newRow!=5) && (newCol!=5) && (grid[newRow][newCol]).etat!=2) {
            grid[x][y].allumer();
            grid[newRow][newCol].setEtat(3);
        }else{
            grid[x][y].cavalier();
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
        System.out.println("mince!!!");
        return 0;
    }
        public int CoordCavalierY (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < taille; j++) {
                if (grid[i][j].etat == 3){
                    return j;
                }
            }
        }
                System.out.println("mince!!!");

        return 0;
    }
    

    // Ajoutez d'autres méthodes selon les besoins de votre jeu

    @Override
    public String toString() {
        String r = "\ngrille : \n";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            r+=grid[i][j].toString()+"|";
            }
            r+="\n";
            }
    return r;
    }
}

    

