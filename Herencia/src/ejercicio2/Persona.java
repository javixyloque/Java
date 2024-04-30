package ejercicio2;
import java.util.Scanner;
public class Persona extends Mamifero{
	private String profesion;
	
	public Persona() {
		super();
		this.profesion = null;
	}
	
	public Persona (String nombre, int numCrias, int numHuesos, int numExt) {
		super(nombre, numCrias, numHuesos, numExt);
		this.profesion = null;
	}

	public void mostrarDatos () {
		super.mostrarDatos();
		System.out.println("Profesion: "+this.profesion);
		System.out.println("*".repeat(60));
	}
	
	public void pedirDatos () {
		super.pedirDatos();
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe la profesion de la persona");
		this.profesion = sc.nextLine();
	}
	
	
}
