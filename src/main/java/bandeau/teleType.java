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
public class teleType extends Effet{

    public teleType(int numero) {
        super(numero);
    }
    public void affichageGauche(Bandeau myPanel){
        for (int chh = 1; chh <= this.nbderepetitions; chh++) {
            myPanel.sleep(500);
    String b=myPanel.getMessage();
        int n=b.length();
        myPanel.setMessage("");
       for(int i=1; i<n+1; i++){
            myPanel.sleep(100);
           myPanel.setMessage(myPanel.getMessage()+b.substring(i-1, i));
       }
        }
       
}
}
