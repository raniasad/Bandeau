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
public class Rotation extends Effet {
    
    public Rotation(int numero) {
        super(numero);
    }
    
    public void tourner(Bandeau myPanel) {
        
        for (int chh = 1; chh <= this.nbderepetitions; chh++) {
            myPanel.sleep(300);
            double s = myPanel.getRotation();
            for (int i = 0; i <= 100; i++) {
		myPanel.setRotation(2*Math.PI*i / 100);
		myPanel.sleep(50);
	}
            myPanel.setRotation(s);
            
        }
        
        
    }
}
