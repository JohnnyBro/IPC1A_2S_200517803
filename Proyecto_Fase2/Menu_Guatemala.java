/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Bravo
 */
public class Menu_Guatemala extends Menu_Pais {

    public Menu_Guatemala() {
    }

    @Override
    public void ventanaPais() {
        ventanaPais.setTitle("Guatemala");
        ventanaPais.setLayout(null);
        ventanaPais.setVisible(true);
        ventanaPais.setBounds(50, 50, 400, 400);

        ventanaPais.add(reservar);
        reservar.setVisible(true);
        reservar.setBounds(25, 25, 100, 30);
        
        Reservar accionreservar=new Reservar();
        reservar.addActionListener(accionreservar);
        
    }
    public class Reservar implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
        Menu_Reservacion menuReservar=new Menu_Reservacion();
        menuReservar.show();
        ventanaPais.dispose();
        }
    }
    
}
