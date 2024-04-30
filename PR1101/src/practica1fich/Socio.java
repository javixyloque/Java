package practica1fich;

import java.io.Serializable;

import dialogos.Dialogos;

public class Socio implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre, direccion, fechaAlta;
	
	
	public Socio () {
		crear();
	}
	
	public void crear() {
		this.id = Dialogos.pedirEntero("Introduzca el ID del socio");
		this.nombre = Dialogos.pedirCadena("Introduzca su nombre");
		this.direccion = Dialogos.pedirCadena("Escriba la dirección del socio");
		this.fechaAlta = Dialogos.pedirCadena("Por ultimo introduzca la fecha de alta");
	}
	
	public String mostrarDatos () {
		return "ID: "+this.id+"\nNombre: "+this.nombre+"\nDireccion: "+this.direccion+"\nFecha de Alta: "+this.fechaAlta+"\n"+("*".repeat(50)+"\n");
	}
	
}
