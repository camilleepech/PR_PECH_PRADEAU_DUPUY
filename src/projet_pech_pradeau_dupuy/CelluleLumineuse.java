/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Raphaël
 */

public class CelluleLumineuse {
    private boolean allumee;

    public CelluleLumineuse() {
        // Par défaut, une cellule est éteinte lorsqu'elle est créée
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

    

