package ejercicio2;
import java.util.Scanner;

public class Mamifero extends Animal{
	protected int numHuesos, numExt;
	public Mamifero () {
		super();
		this.numHuesos=0;
		this.numCrias=0;
	}
	
	public Mamifero(String nombre, int numCrias) {
		super(nombre, numCrias);
		this.numHuesos=0;
		this.numCrias=0;
		// TODO Auto-generated constructor stub
	}
	public Mamifero(String nombre, int numCrias, int numHuesos, int numExt) {
		super(nombre, numCrias);
		this.numHuesos=numHuesos;
		this.numCrias=numExt;
		// TODO Auto-generated constructor stub
	}
	
	
	public void pedirDatos() {
		super.pedirDatos();
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el numero de huesos del mamífero");
		this.numHuesos = sc.nextInt();
		System.out.println("Introduce el numero de extremidades");
		this.numExt = sc.nextInt();
	}
	public void mostrarDatos () {
		super.mostrarDatos();
		System.out.println("Nº de huesos: "+this.numHuesos);
		System.out.println("Nº de extremidades: "+this.numExt);
		System.out.println("*".repeat(60));
	}
	
	
}
