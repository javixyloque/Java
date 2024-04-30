package usoObjetos;
import java.util.Scanner;
public class Eje9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
	
		// Declaración de variables //
		String nombre;
		int edad, num;
		double edadTotal = 0;
		// Entrada de datos //
		System.out.println("Escribe el número de alumnos que quieres ");
		num = sc.nextInt();
		Eje9Alumno alumnos [] = new Eje9Alumno[num];
		
		// Bucle insertar datos de alumnos //
		for (int i = 0; i<alumnos.length; i++) {
			alumnos [i] = new Eje9Alumno();
			System.out.println("Escribe el nombre del alumno "+(i+1));
			nombre = sc.nextLine();
			// Vaciado de buffer //
			sc.next();
			System.out.println("Escribe su edad");
			edad = sc.nextInt();
			alumnos[i].crearAlumno(nombre, edad);
		}
		
		// Bucle para sumar todas las edades de los alumnos //
		for (int i = 0; i<alumnos.length; i++) {
			edadTotal += alumnos[i].getEdad();
		}
		
		// Console.log que muestra la edad media de todos los alumnos //
		System.out.println("La edad media es "+ (edadTotal/alumnos.length));
		
		
		
	}

}
