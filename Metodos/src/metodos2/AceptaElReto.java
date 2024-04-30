package metodos2;
import java.util.Scanner;
public class AceptaElReto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cadenas;
		int i, j, contador = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el número de cadenas que quieres comparar (máx: 40.000)");
		int nCadenas = sc.nextInt();
		cadenas = new String[nCadenas];
		System.out.println();
		System.out.println("Escribe las cadenas que quieras comparar, todas con la misma longitud (máximo 50 caracteres)");
		for (i = 0; i<=cadenas.length-1; i++) {
			System.out.println("Escribe la cadena "+(i+1));
			cadenas[i] = sc.next();
		}
		char vacio = '-';
		for (j=0;j<=cadenas[i].length();j++) {
			if (cadenas[i].charAt(j) == cadenas[i+1].charAt(j) || cadenas[i].charAt(j) == vacio || cadenas[i+i].charAt(j) == vacio) {
				contador++;

			}
		}
		cadenas[i].compareTo (cadenas[i+1]);
		System.out.println(contador);
	}

	private static void String(int nCadenas) {
		// TODO Auto-generated method stub
		
	}

}
