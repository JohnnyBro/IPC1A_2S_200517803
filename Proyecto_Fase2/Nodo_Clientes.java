/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles_de_centro_america;

/**
 *
 * @author Bravo
 */
public class Nodo_Clientes {
    public Nodo_Clientes next;
    public String nombre;
    public String apellido;
    public int numerotel;
    public int pasaporte;
    public int edad;
    public String fechain;
    public String fechaout;
    public int ntarjeta;
    
    
   public Nodo_Clientes()
   {
       
    }
   public Nodo_Clientes(String nombre, String apellido, int numerotel, int pasaporte, int edad, int ntarjeta)
   {
       this.nombre = nombre;
       this.apellido=apellido;
       this.numerotel = numerotel;
       this.edad=edad;
       this.pasaporte= pasaporte;
      // this.fechain=fechain;
       //this.fechaout=fechaout;
       this.ntarjeta=ntarjeta;
       
   }
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getNumerotel() {
	return numerotel;
}
public void setNumerotel(int numerotel) {
	this.numerotel = numerotel;
}
public int getPasaporte() {
	return pasaporte;
}
public void setPasaporte(int pasaporte) {
	this.pasaporte = pasaporte;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public int getNtarjeta() {
	return ntarjeta;
}
public void setNtarjeta(int ntarjeta) {
	this.ntarjeta = ntarjeta;
}
    
    
}
