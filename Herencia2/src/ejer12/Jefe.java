package ejer12;
import java.util.Scanner;
public class Jefe extends Empleado {
	
	private static double plus = 250;
	private String nomDep;
	Scanner sc = new Scanner (System.in);
	
	public Jefe () {
		super();
		System.out.println("Introduce los datos del jefe");
		System.out.println("Nombre de su departamento: ");
		this.nomDep = sc.nextLine();

		
	}
	
	public void modificarPlus () {
		System.out.println("Introduce el nuevo plus para los jefes");
		plus = sc.nextDouble();
	}
	
	public void mostrarDatos() {
		super.mostrarDatosJefe();
		System.out.println("Nombre de su departamento: "+this.nomDep);
		System.out.println("Sueldo: "+(sueldoBase+(plus*sueldoBase/100)));
		System.out.println("*".repeat(50));
	}
	
}
