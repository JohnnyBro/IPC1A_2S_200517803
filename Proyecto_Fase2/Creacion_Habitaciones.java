package hoteles_de_centro_america;

public class Creacion_Habitaciones {
	
	int numero=0;
	String Disponibilidad;
	 public void CrearListaHabitaciones(int limite, int inicio, Lista_habitaciones  habitaciones){
	  
	    	while(inicio<=limite){
	    		
	    		Nodo_habitacion nuevo = new Nodo_habitacion(inicio);
	    		habitaciones.agregar(nuevo, habitaciones);
	    		inicio++;
	    	}
	    	
	    	
	    	
	    }
	 
	 public void imprimir(Lista_habitaciones lista) {
	        Nodo_habitacion temp = lista.first;
	        while (temp != null) {
	            System.out.print("numero: "+temp.Numero+"->");
	            temp = temp.next;
	        }
	        System.out.println(" ");
	    }

	 
	 
	 public void asignarHabitacion(Nodo_habitacion habitacion,  Nodo_Clientes cliente ){ 
		 habitacion.cliente = cliente;
	 }
	 
}
