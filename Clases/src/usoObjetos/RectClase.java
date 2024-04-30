package usoObjetos;
import java.util.Scanner;
public class RectClase {
	Scanner sc = new Scanner (System.in);
	private double base, altura;

	public void setBase (double b) {
		this.base = b;
	}
	public void Rectangulo (double b, double h) {
		this.base = b;
		this.altura = h;
	}
	
	public double getBase () {
		return this.base;
	}
	
	public void setAltura (double h) {
		this.altura = h;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public double perimetroRect() {
		return (2*(this.base)+2*(this.altura));
	}
	
	public double area() {
		return (this.base*this.altura);
	}
	
	public double areaTri() {
		return (this.base*this.altura) / 2;
	}
	

}
