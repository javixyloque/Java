package StringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer cadena;
		int i = 0;
		int contador = 0;
		System.out.println("Escribe una cadena");
		Scanner sc = new Scanner (System.in);
		String st = sc.nextLine();
		
		cadena =  new StringTokenizer (st);
		String [] imprimir = new String [cadena.countTokens()];
		int longitud = cadena.countTokens();
		System.out.println(longitud);
		
		while (cadena.hasMoreTokens()) {
			imprimir[i] = cadena.nextToken();
			i++;
		}
		
		for (int j = imprimir.length-1; j>=0; j--) {
			System.out.print(imprimir[j] + " ");
		}
		

		System.out.println("\nEscribe la palabra que quieras buscar");
		String busc = sc.nextLine();
		for (int j = 0; j<=imprimir.length-1; j++) {
			if (busc.compareTo(imprimir[j]) ==0) {
				contador++;
			}
		}
		System.out.println("La palabra "+busc+ " aparece "+contador+" veces");
		
		
		
	}

}
