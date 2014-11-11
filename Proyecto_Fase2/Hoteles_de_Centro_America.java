/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

/**
 *
 * @author Bravo
 */
public class Hoteles_de_Centro_America {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Creacion_Habitaciones crear= new Creacion_Habitaciones();
    	Lista_habitaciones primera= new Lista_habitaciones();
    	Lista_habitaciones segunda= new Lista_habitaciones();
    	Lista_habitaciones tercera= new Lista_habitaciones();
    	
    	crear.CrearListaHabitaciones(150,1, primera);
    	crear.CrearListaHabitaciones(350,151, segunda);
    	crear.CrearListaHabitaciones(552,351, tercera);
    	
    	crear.imprimir(primera);
    	crear.imprimir(segunda);
    	crear.imprimir(tercera);
    	
    	
       Cuadro_Contrasena_Inicio cuadroInicio= new Cuadro_Contrasena_Inicio();
       cuadroInicio.ventanaInicio();
       Menu_Principal menu=new Menu_Principal();
      // menu.ventanaMenuPrincipal();
       
       
       
    }
    
   
}
