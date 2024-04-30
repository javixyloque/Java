package strings;

import java.util.Scanner;

public class strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Escribe una cadena y se te devuelve al revés");
		String frase = sc.nextLine();
		int i;
		for (i=frase.length()-1; i>=0; i--) {
			System.out.print(frase.charAt(i));
		}
	}

}
