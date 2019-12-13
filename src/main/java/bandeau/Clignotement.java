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
public class Clignotement extends Effet{

    public Clignotement(int numero) {
        super(numero);
    }
        public void Clignoter(Bandeau myPanel) {
        String b = myPanel.getMessage();
        for (int i = 1; i <= this.nbderepetitions; i++) {
            myPanel.sleep(200);
            myPanel.setMessage(b);
            myPanel.sleep(200);
            myPanel.setMessage("");
        }
        myPanel.setMessage(b);
    }
    
}
