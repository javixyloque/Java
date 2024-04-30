package ejercicio2;
import java.util.Scanner;
public class Animal {
	protected String nombre;
	protected int numCrias;
	public Animal () {
		this.nombre = "";
		this.numCrias = 0;
	}
	public Animal (int numCrias) {
		this.nombre = "";
		this.numCrias = numCrias;
	}
	public Animal (String nombre, int numCrias) {
		this.nombre = nombre;
		this.numCrias = numCrias;
	}

	public void pedirDatos () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nombre del animal");
		this.nombre = sc.nextLine();
		System.out.println("Numero de crias del animal");
		this.numCrias = sc.nextInt();
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del animal: "+this.nombre);
		System.out.println("Numero de crias: "+this.numCrias);
	
	}
	
	public int getNumCrias() {
		return numCrias;
	}

	public void setNumCrias(int numCrias) {
		this.numCrias = numCrias;
	}
	
	
}
