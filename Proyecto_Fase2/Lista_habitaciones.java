package hoteles_de_centro_america;

public class Lista_habitaciones {
	
	 Nodo_habitacion first;
	 Nodo_habitacion last;
	 int tam = 0;

	    public Lista_habitaciones() {
	        first = null;
	    }

	    public void agregar(Nodo_habitacion nuevo, Lista_habitaciones lista) {
	        if (lista.first == null) {
	        	lista.first = nuevo;
	        	lista.last = nuevo;
	        } else {
	        	lista.last.next = nuevo;
	        	lista.last = nuevo;

	        }
	        tam++;
	    }
}
