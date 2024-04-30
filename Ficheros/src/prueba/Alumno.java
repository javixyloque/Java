package prueba;

import java.io.*;
import java.util.Scanner;

public class Alumno implements Serializable {

	private String nombre;
	private int edad;
	
	public Alumno (){
		pedirDatos();
	}
	
	void visualizarDatos() {
		System.out.println("\nNOMBRE: "+nombre);
		System.out.println("\nEDAD: "+edad);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	protected void pedirDatos() {
		pedirNombre();
		pedirEdad();
	}
	
	protected void pedirNombre() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el nombre del alumno");
		this.nombre = sc.nextLine();
	}
	protected void pedirEdad() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la edad del alumno");
		this.edad = sc.nextInt();
	}
	
	
	

}
