/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dell
 */
public class LeJeuDuPendu extends Effet{

    public LeJeuDuPendu(int numero) {
        super(numero);
    }
    public void pendu(Bandeau myPanel){
                for (int chh = 1; chh <= this.nbderepetitions; chh++) {
                    myPanel.sleep(500);
    String b=myPanel.getMessage();
        int n=b.length();

        myPanel.setMessage("_");
        for(int i =0; i<n-1; i++){
    myPanel.setMessage(myPanel.getMessage()+"_");
            }
        ArrayList <Integer> Nombres= new ArrayList();
        for (int f =0; f<=n-1; f++){
            Nombres.add(f);
        }
        Random r = new Random();
        for (int f =1; f<=n; f++){
        myPanel.sleep(500);
        int h = r.nextInt(Nombres.size());
        int hh = Nombres.get(h);
        Nombres.remove(h);
          StringBuilder patate= new StringBuilder(myPanel.getMessage());
          char cc = b.substring(hh, hh+1).charAt(0);
    patate.setCharAt(hh, cc);
    System.out.println("String = "
                           + patate.toString()); 
    myPanel.setMessage(patate.toString());}
        }
}
}
