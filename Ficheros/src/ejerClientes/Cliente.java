package ejerClientes;
import java.io.Serializable;

import javax.swing.*;

import dialogos.Dialogos;
/*
 * LA CLASE CLIENTE ES SERIALIZABLE, TIENE QUE SERLO PARA PODER METER LOS OBJETOS DENTRO DE UN ARCHIVO, PERO 
 * TODO DENTRO TIENE Q SER SERIALIZABLE, HASTA LOS OBJETOS DE OTRA CLASE DISTINTA.
 * LA CLASE DIALOGOS SI NO FUERA CON METODOS ESTÁTICOS DEBERIA TENER UN OBJETO ASOCIADO QUE LO FUESE.
 */
public class Cliente implements Serializable {
	private static int id = 0;
	private String nombre, direccion;
	
	//	CONSTRUCTORES	//
	
	public Cliente() {
		pedirDatos();
		id++;
	}
	
	
	public void pedirDatos() {
		nombre = Dialogos.pedirCadena("Introduce el nombre del alumno");
		direccion = Dialogos.pedirCadena("Ahora la dirección");
	}
	
	public String mostrarDatos () {
		return "Id: "+id+"\nNombre: "+nombre+"\nDirección: "+direccion+"\n"+("*".repeat(50)+"\n");
	}
	
	
	// GETTERS Y SETTERS //
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
