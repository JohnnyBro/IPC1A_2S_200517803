package hoteles_de_centro_america;

public class Nodo_habitacion {
	
	Nodo_Clientes cliente;
	
	Nodo_habitacion next;
	int Numero;	
	
	Nodo_habitacion(){
		
	}
	
	Nodo_habitacion(int numero){
		Numero = numero;
		next = null;
		cliente = null;
	}
	
	
	

}
