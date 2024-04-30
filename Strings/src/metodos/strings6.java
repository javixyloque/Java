package metodos;
import java.util.Scanner;
public class strings6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n;
		String state1, state2;
		System.out.println("Escribe el número de veces que quieres comparar cadenas");
		n = sc.nextInt();
		
		while (n>0) {
			System.out.println("Escriba la primera cadena");
			state1 = sc.nextLine();
			System.out.println("Escriba la segunda cadena");
			state2 = sc.nextLine();

		}
		
		
		
		
		
		
		/*System.out.println("Escribe 2 frases y se compararán entre sí si son iguales");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba la frase 1");
		frase1 = sc.nextLine();
		
		System.out.println("Escriba la frase 2");
		frase2 = sc.nextLine();
		
		if (frase1.equals(frase2)) {
			System.out.println("Las cadenas son iguales");
			sc.close();
			System.exit(0);
		} else {
			System.out.println("Las cadenas son distintas");
			sc.close();
			System.exit(0);
		}*/
	}

}
