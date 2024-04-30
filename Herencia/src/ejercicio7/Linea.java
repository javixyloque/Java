package ejercicio7;
import java.util.Scanner;
public class Linea {
	protected double ancho;
	
	public Linea () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la longitud de la linea");
		this.ancho = sc.nextDouble();
		
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public Linea (double ancho) {
		this.ancho = ancho;
	}
	public void pedirDatos () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la longitud");
		this.ancho = sc.nextDouble();
	}
}
