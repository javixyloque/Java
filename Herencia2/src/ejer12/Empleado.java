package ejer12;
import java.util.Scanner;
public class Empleado {
	Scanner sc = new Scanner (System.in);
	
	private static final String NOMEMP= "Michelin";
	private String nombre;
	private int edad;
	private double porcentaje;
	protected static double sueldoBase = 1000;
	
	public Empleado () {
		System.out.println("Introduce los datos del Empleado");
		System.out.println("Nombre: ");
		this.nombre =sc.nextLine();
		System.out.println("Edad: ");
		this.edad = sc.nextInt();
		System.out.println("Escribe el porcentaje de aumento: ");
		this.porcentaje = sc.nextDouble();
		
	}
	public Empleado (double plus) {
		this.porcentaje  = plus;
	}
	

	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Edad del empleado: "+this.edad);
		System.out.println("Sueldo: "+(sueldoBase+(this.porcentaje*sueldoBase/100)));
		System.out.println("*".repeat(50));
	}
	public void mostrarDatosJefe() {
		System.out.println("Nombre del jefe: "+this.getNombre());
		
		System.out.println("Edad: "+this.getEdad());
		
	}
	
	public void modificarSueldoBase() {
		System.out.println("Introduce el nuevo salario base para todos los empleados");
		sueldoBase = sc.nextDouble();
	}

	public void setEdad (int edad) {
		this.edad = edad;
	}
	public int getEdad () {
		return this.edad;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre () {
		return this.nombre;
	}

	public static String getNomemp() {
		return NOMEMP;
	}
	
}
