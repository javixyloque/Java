package ejercicio7;
import java.util.Scanner;
public class Rectangulo extends Linea {
	protected double alto;
	
	public Rectangulo() {
		super();
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el alto");
		this.alto = sc.nextDouble();
		
	}
	
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public Rectangulo (double ancho, double alto) {
		super(ancho);
		this.alto = alto;
	}
	public Rectangulo (double ancho) {
		super (ancho);
		this.alto = 0.0;
	}
	public double area () {
		return this.ancho*this.alto;
	}
	
	public void pedirDatos () {
		super.pedirDatos();
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el alto");
		this.alto = sc.nextDouble();
	}
	
}
