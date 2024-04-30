package metodos;
import java.util.Scanner;

public class Metodos1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String operacion;
		float digito1, digito2;
		System.out.println();
		System.out.println ("Escribe el primer numero sobre el que quieras operar");
		digito1  = sc.nextFloat();
		System.out.println ("Escribe el segundo numero con el que quieras operar");
		digito2 = sc.nextFloat ();
		System.out.println ("Escribe el tipo de operación que quieres realizar\nsuma\nresta\nmultiplicacion\ndivision");
		sc.nextLine();
		operacion = sc.nextLine(); 
		if(operacion.equals("suma")) {
			System.out.println(suma(digito1, digito2));
			
		} else if(operacion.equals("resta")) {
			System.out.println(resta(digito1, digito2));
			
		} else if (operacion.equals("multiplicacion")) {
			System.out.println(multiplicacion(digito1, digito2));
			
		} else if (operacion.equals("divison")) {
			System.out.println(division(digito1, digito2));
		}
		sc.close();
		System.exit(0);
	}

	
	

public static float suma(float digito1, float digito2) {
	float suma1 = digito1 + digito2;
	return suma1;

	
}


public static float resta (float digito1, float digito2) {
float resta1 = digito1 - digito2;
	return resta1;
}

public static float multiplicacion(float digito1, float digito2) {
	float multiplicacion1 = digito1 * digito2;
	return multiplicacion1;
}

public static float division (float digito1, float digito2) {
	float division1 = digito1 / digito2;
	return division1;
}

}