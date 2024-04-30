package ejercicio9;
import java.util.Scanner;
import herencia.Persona;

public class Empleado extends Persona {
	protected double salario;
	
	public Empleado (){
		super();
	}
	public Empleado (String nombre) {
		super(nombre);
	}
	public Empleado (String nombre, double salario) {
		super(nombre);
		this.salario = salario;
	}
	
	public Empleado (String nombre, int edad, double altura, double salario) {
		super(nombre, edad, altura);
		this.salario = salario;
	}
	
	// Override, sobreescribir del super //
	public void mostrarDatos () {
		super.mostrarDatos();
		System.out.println("Salario: "+this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
