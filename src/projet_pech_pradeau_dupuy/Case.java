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
    
    /**
     * Une nouvelle case est eteinte par défaut (etat 1)
     */
    public Case(){
        this.etat = 1;
    }

    /**
     *
     * @return etat d'une case
     */
    public int getEtat() {
        return etat;
    }

    /**
     *change l'etat d'une case
     * @param etat
     */
    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    /**
     *passe une case à l'etat 1 (eteinte)
     */
    public void eteindre(){
    etat=1;
    }

    /**
     *passe une case à l'etat 2 (allumée)
     */
    public void allumer(){
    etat=2;
    }

    /**
     *passe une case à l'etat 3 (cavalier)
     */
    public void cavalier(){
    etat=3;
    }

    /**
     *
     * @return true si cette case est allumée, sinon false
     */
    public boolean presenceLumiere(){
    if (etat==2){
        return true;
    }
        return false;
}

    /**
     *
     * @return true si cette case contient un cavalier, sinon false
     */
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
