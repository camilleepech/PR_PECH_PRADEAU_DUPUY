/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_pech_pradeau_dupuy;

/**
 *
 * @author Camille
 */
public class Case {
    private boolean allumee;
    
    public Case(){
        this.allumee = false;
    }
    
    public boolean estAllumee(){
        return allumee;
    }
    public void eteindre(){
    allumee=false;
    }
     public void allumer(){
    allumee=true;
    }


     
}
