/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author dell
 */
public class Zoom extends Effet{

    public Zoom(int numero) {
        super(numero);
    }
        
    public void zoomer(Bandeau myPanel){
        Font n=myPanel.getFont();
        for (int b = 1; b <= this.nbderepetitions; b++) {
       for (int i=12; i<=48;i++){
        myPanel.setFont(new Font("Arial", Font.BOLD, i));
        myPanel.sleep(40);
       }
        }
       myPanel.setFont(n);
    }
}
