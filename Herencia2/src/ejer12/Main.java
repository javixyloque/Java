package ejer12;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numeroE, numeroJ, respuesta;
		
		System.out.println("Escribe el numero de empleados");
		numeroE = sc.nextInt();
		Empleado e[] = new Empleado [numeroE];
		for (int i = 0; i<e.length; i++) {
			e[i] = new Empleado();
		}
		System.out.println("Escribe el numero de jefes");
		numeroJ = sc.nextInt();
		Jefe j[] = new Jefe [numeroJ];
		for (int i = 0; i<j.length; i++) {
			j[i] = new Jefe();
		}
		
		System.out.println("\n\nEMPRESA MICHELIN\n\n"+"Escoge la opción \n\n"
				+ "1. Modifica el sueldo base para todos los empleados \n"
				+ "2. Modifica el plus de los jefes \n"
				+ "3. Visualiza los datos de todos los empleados \n"
				+ "4. Salir\n"+"*".repeat(50));
		respuesta = sc.nextInt();
		while (respuesta != 4) {
		switch (respuesta) {
		case 1:
			e[0].modificarSueldoBase();
			break;
		case 2: 
			j[0].modificarPlus();
			break;
		case 3:
			for (int i = 0; i<e.length; i++) {
				e[i].mostrarDatos();
			}
			for (int i = 0; i<j.length; i++) {
				j[i].mostrarDatos();
			}
			
			
		}
		System.out.println("\n\nEscoge la opción \n\n"
				+ "1. Modifica el sueldo base para todos los empleados \n"
				+ "2. Modifica el plus de los jefes \n"
				+ "3. Visualiza los datos de todos los empleados \n"
				+ "4. Salir\n"+"*".repeat(50));
		respuesta = sc.nextInt();
		
		}
		System.out.println("Fin del programa");
		sc.close();
		System.exit(0);
		
		
	}

}
