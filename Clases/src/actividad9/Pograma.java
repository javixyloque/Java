package actividad9;
import java.util.Scanner;
public class Pograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno al1 = new Alumno();
		String resp;
		Scanner sc = new Scanner (System.in);
		
		
		al1.pedirDatos();
		System.out.println("Desea modificar la nota en alguno de los módulos? (S,N)");
		resp = sc.next().toLowerCase();
		if (resp.charAt(0) == 's') {
			al1.modificarModulo();
		}
		
		al1.visualizarNotas();
		
		if (al1.suspensos()>1) {
			System.out.println("El alumno tiene que repetir");
		} else {
			System.out.println("El alumno promociona al siguiente curso");
		}
		
		if(al1.notaMedia()>7) {
			System.out.println("El alumno tiene opción a beca para el curso siguiente");
		} else {
			System.out.println("El alumno no opta a beca");
		}
		
	}

}
