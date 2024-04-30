package ejemplos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion1 {
	public static void main(String[] args) throws ExcepcionEdadNegativa {
		// excepcion edad negativa
		Scanner sc =new Scanner (System.in);
		boolean continua;
		int edad;
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		try {
			if (edad<0) {
				throw new ExcepcionEdadNegativa ();
				} else {
					System.out.println("Edad: "+edad);
				}
		} catch (InputMismatchException ex) {
			System.out.println("Dato no correcto");
		}
	
		
	}
	
}
