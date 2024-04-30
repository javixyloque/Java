package clasesEjs;
import java.util.Scanner;

public class Alumno {
	private String nombre;
	private int edad;
	
	// Constructores para Alumno //
	
	public Alumno (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public Alumno (String nombre) {
		this(nombre, 16);
	}
	
	public Alumno () {
		this("", 16);
	}
	
	// Métodos //
	
	// Protected sólo se usa en Clases del mismo paquetes y en clases que heredan de esta Clase //
	
	protected void iniciarDatos (String nombre, int edad) {
		this.nombre = nombre;
		this. edad = edad;
	}
	
	// Package (por defecto) sólo se puede usar en Clases del mismo paquete //
	void modificarDatos () {
		this.pedirNombre();
		this.pedirEdad();
	}
	
	// Private sólo en la misma Clase //
	
	private void pedirNombre () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el nombre del alumno");
		this.nombre = sc.nextLine();
	}
	
	private void pedirEdad () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe la edad del alumno");
		this.edad =  sc.nextInt();		
	}
	
	// Getters y setters //

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
	
	public void mostrarDatos() {
		String a = "*";
		System.out.println("DATOS DEL ALUMNO");
		System.out.println("Nombre del alumno: "+this.nombre);
		System.out.println("Edad del alumno: "+this.edad+"\n"+(a.repeat(50))+"\n");
	}
	
}
