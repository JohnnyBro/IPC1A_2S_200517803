package hoteles_de_centro_america;

import hoteles_de_centro_america.Menu_Guatemala.Reservar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Belice extends Menu_Pais{
	
	Menu_Belice(){}
	
	 public void ventanaPais() {
	        ventanaPais.setTitle("Belice");
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
