package herencia;
import java.util.Scanner;
public class PrincipalPersona {
	
public static void main(String[] args) {
	
	String nombre, titulo, nomDep;
	double salario;
	Empleado empleados[] = new Empleado[5];
	Jefe jefes [] = new Jefe[2];
	
	// Si creamos un constructor en la clase desaparece el por defecto //
	System.out.println("Defina empleados y jefes");
	for (int i = 0; i<5; i++) {
		Scanner sc = new Scanner (System.in);
		empleados[i] = new Empleado();
		System.out.println("Escriba el nombre del empleado nº "+(i+1));
		nombre = sc.nextLine();
		empleados[i].setNombre(nombre);
		System.out.println("Introduce el sueldo del empleado nº "+(i+1));
		salario = sc.nextDouble();
		empleados[i].setSalario(salario);
		
	}
	
	System.out.println("Escribe los datos de los jefes");
	for (int i = 0; i<2; i++) {
		Scanner sc = new Scanner (System.in);
		jefes[i] = new Jefe();
		System.out.println("Nombre del jefe?");
		nombre = sc.nextLine();
		jefes[i].setNombre(nombre);
		System.out.println("Sueldo del jefe?");
		salario = sc.nextDouble();
		jefes[i].setSalario(salario);
		System.out.println("Titulo universitario?");
		titulo = sc.nextLine();
		sc.next();
		jefes[i].setTitulo(titulo);
		System.out.println("Nombre del departamento que dirige?");
		nomDep = sc.nextLine();
		sc.next();
		jefes[i].setNomDep(nomDep);
	}
	
	System.out.println("Datos empleados");
	System.out.println("*".repeat(60));
	for (int i = 0; i<5; i++) {
		System.out.println("Nombre: "+empleados[i].getNombre()+"\nSalario: "+empleados[i].getSalario());
		
	}
	System.out.println("Datos jefes");
	System.out.println("*".repeat(60));
	for (int i = 0; i<2; i++) {
		
		System.out.println("Nombre: "+jefes[i].getNombre());
		System.out.println("Suedlo: "+jefes[i].getSalario());
		System.out.println("Título: "+jefes[i].getTitulo());
		System.out.println("Nombre del departamento: "+jefes[i].getNomDep());
	}
	
		
}
}
