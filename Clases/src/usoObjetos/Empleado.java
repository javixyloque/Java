package usoObjetos;
import java.util.Scanner;

public class Empleado {
	private String nombre;
	private float sueldo;
	String n;
	float s;
	
	void pedirDatos() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe el nombre del empleado");
		n = sc.nextLine();
		System.out.println("Escribe el sueldo del empleado");
		s = sc.nextFloat();
		asignarValores(n, s);
		
	}
	
	void asignarValores (String n, float s) {
		this.nombre = n;
		this.sueldo = s;
	}
	
	void asignarSueldo (float s) {
		this.sueldo = s;
	}
	String getNombre () {
		return (this.nombre);
	}
	
	void visualizarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Sueldo: "+sueldo+" €");
	}
	
	
	public float getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
