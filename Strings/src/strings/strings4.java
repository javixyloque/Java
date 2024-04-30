package strings;

import java.util.Scanner;

public class strings4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Escribe una cadena");
			String phrase = sc.nextLine();
			char wanted;
			System.out.println("Escribe el caracter que quieras buscar");
			wanted = sc.next().charAt(0);
			
			
			int i, contador = 0;
			for (i=0; i<=phrase.length()-1;i++) {
				if (wanted == phrase.charAt(i)) {
					contador++;
				}
			}
			
			
			System.out.print("El caracter aparece "+contador+" veces");
			sc.close();
		}
	}
}
