/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Rapha�l
 */

public class CelluleLumineuse {
    private boolean allumee;

    public CelluleLumineuse() {
        // Par d�faut, une cellule est �teinte lorsqu'elle est cr��e
        this.allumee = false;
    }

    public boolean estAllumee() {
        return allumee;
    }

    public void inverserEtat() {
        allumee = !allumee;
    }

    @Override
    public String toString() {
        return allumee ? "O" : " ";
    }
}

    

