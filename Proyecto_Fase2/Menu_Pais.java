/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Bravo
 */
public class Menu_Pais {
    JFrame ventanaPais=new JFrame();
    JButton reservar=new JButton("Reservar");
    JButton home=new JButton("HOME");
    
    
    public Menu_Pais()
    {
        
    }
    public void ventanaPais()
    {
        ventanaPais.setLayout(null);
        ventanaPais.setVisible(true);
        ventanaPais.setBounds(50, 50, 400, 400);
        
        ventanaPais.add(reservar);
        reservar.setVisible(true);
        reservar.setBounds(25, 25, 100, 30);
        
      
    }
    
}
