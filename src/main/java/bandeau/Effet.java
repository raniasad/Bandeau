/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author dell
 */
public class Effet {
    protected int nbderepetitions;
public Effet(int numero){
    this.nbderepetitions=numero;
}
    public void setNbderepetitions(int nbderepetitions) {
        this.nbderepetitions = nbderepetitions;
    }

    public int getNbderepetitions() {
        return nbderepetitions;
    }
    
    
}
