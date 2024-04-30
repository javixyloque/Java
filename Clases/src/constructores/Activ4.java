package constructores;
import usoObjetos.Alumno;
import java.util.Scanner;

public class Activ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nombre, apellidos;
		int ne;
		double nm;
		
		System.out.println("Escribe el nexp del alumno");
		ne = sc.nextInt();
		System.out.println("Escribe el nombre del alumno");
		nombre = sc.nextLine();
		System.out.println("Escribe apellidos del alumno");
		apellidos = sc.nextLine ();
		System.out.println("Escribe la nota media del alumno");
		nm = sc.nextDouble();
		Alumno al1 = new Alumno(ne, nombre, apellidos, nm);
		al1.visualizarDatosAlumno();
     
		
		
	}

}
