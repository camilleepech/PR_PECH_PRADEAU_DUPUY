/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;
import java.awt.Point;
/**
 *
 * @author Camille
 */
public class Cavalier {
    


     Point position;
    private Echiquier echiquier;

    public Cavalier(Echiquier echiquier, int x, int y) {
        this.echiquier = echiquier;
        this.position = new Point(x, y);
       // Initialiser la position du cavalier
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < echiquier.getTaille() && col >= 0 && col < echiquier.getTaille();
    }

    public void movehautgauche() {
        int newRow = position.x - 1;
        int newCol = position.y - 2;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
           
        }
    }
        public void movehautdroite() {
        int newRow = position.x +1;
        int newCol = position.y -2;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }

    public void movebasgauche() {
        int newRow = position.x - 1;
        int newCol = position.y + 2;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }
    public void movebasdroite() {
        int newRow = position.x + 1;
        int newCol = position.y + 2;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }

    public void movegauchehaut() {
        int newRow = position.x - 2;
        int newCol = position.y - 1;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }
        public void movegauchebas() {
        int newRow = position.x - 2;
        int newCol = position.y +1 ;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }

    public void movedroitehaut() {
        int newRow = position.x +2;
        int newCol = position.y -1;

        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }
        public void movedroitebas() {
        int newRow = position.x + 2;
        int newCol = position.y + 1;
        
        if (isValidMove(newRow, newCol) && echiquier.estAllumee(newRow, newCol)) {
            position.setLocation(newRow, newCol);
            echiquier.eteindreCase(newRow, newCol);
        }
    }

}
   // public void play() {
        // Logique de jeu ici
        // Vous pouvez ajouter des actions spécifiques à effectuer lors du déplacement du cavalier
        // par exemple, mettre à jour l'interface graphique ou vérifier la victoire
  //  }


