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
    int etat;
    
    public Case(){
        this.etat = 1;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    
   
    public void eteindre(){
    etat=1;
    }
     public void allumer(){
    etat=2;
    }
 public void cavalier(){
    etat=3;
    }
public boolean presenceLumiere(){
    if (etat==2){
        return true;
    }
        return false;
}
public boolean presenceCavalier(){
    if (etat==3){
        return true;
    }
        return false;
}

    @Override
    public String toString() {
        return etat +"";
    }

     
}
