/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
//voila notre scenario
public class Scenario {
    private ArrayList<Effet> mesEffets ; 
    public void appliquerscenario(Bandeau b, int nbfois){
        mesEffets=new ArrayList();
        Zoom z= new Zoom(5);
        teleType t= new teleType(4);
        LeJeuDuPendu p= new LeJeuDuPendu(2);
        Rotation r= new Rotation(3);
        Clignotement c= new Clignotement(10);
        mesEffets.add(z);
        mesEffets.add(t);
        mesEffets.add(p);
        mesEffets.add(c);
        mesEffets.add(r);
        for (int i = 1; i <= nbfois; i++) {
            b.sleep(1000);
        c.Clignoter(b);
        t.affichageGauche(b);
        z.zoomer(b);
        p.pendu(b);
        r.tourner(b);
        }
        
    }
}
