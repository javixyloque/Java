package ejercicio7;
import java.util.Scanner;
public class Caja extends Rectangulo{
	private double grosor;
	
	public Caja () {
		super();
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el grosor");
		this.grosor = sc.nextDouble();
	}
	
	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}

	public Caja (double ancho) {
		super(ancho);
		this.grosor = 0.0;
	}
	public Caja (double ancho, double alto) {
		super (ancho, alto);
		this.grosor = 0.0;
	}
	
	public Caja (double ancho, double alto, double grosor) {
		super (ancho, alto);
		this.grosor = grosor;
		System.out.println("El volumen de la caja es: "+ancho*alto*grosor);
	}
	
	public void pedirDatos () {
		super.pedirDatos();
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el grosor");
		this.grosor = sc.nextDouble();
	}
	public double volumen () {
		return super.area()*this.grosor;
	}

}
