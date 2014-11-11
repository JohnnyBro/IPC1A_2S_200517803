/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

/**
 *
 * @author Bravo
 */

public class Lista_Clientes {
	
    Nodo_Clientes first;
    Nodo_Clientes last;
    int tam = 0;

    public Lista_Clientes() {
        first = null;
    }

    public void agregar(Nodo_Clientes nuevo) {
        if (first == null) {
            first = nuevo;
            last = nuevo;
        } else {
            last.next = nuevo;
            last = nuevo;

        }
    }

    public void imprimir(Nodo_Clientes nuevo) {
        Nodo_Clientes temp = first;
        while (temp != null) {
            System.out.println(temp.nombre + "," + temp.apellido + ","  + temp.edad+ "," + temp.pasaporte +","+temp.numerotel + "," + temp.ntarjeta);
            temp = temp.next;
        }

    }
}
