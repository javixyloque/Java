package ejerciciosClase;
import java.util.*;
public class Numeros {
	public static void main(String[] args) {
		int num;
		System.out.println("\n\nEscribe un numero:");
		boolean correcto = true;
		
		do {
			try {
		
			num = pedirEntero();
		} catch (NumberFormatException e) {
			System.out.println("Has insertado letras en vez de un numero (MAIN)");
		} 
		}while (correcto == false);
	}
	
	
	static String pedirCadena () {
		String cadena ="";
		Scanner teclado = new Scanner(System.in);
		try {
	
			cadena = teclado.nextLine();
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error grave");
			System.exit (0);
		}
		
		return cadena;

	}
	
	
	
	static int pedirEntero() {
		String cadena;
		int num = 0;
		
		cadena = pedirCadena();
		try {
		num = Integer.parseInt(cadena);
		} catch (NumberFormatException e)  {
			System.out.println("Se han insertado letras en vez de numeros, novatín");
			System.exit(0);
		}
		return num;
	}
}
