package metodos;
import java.util.Scanner;

public class strings8 {
	public static void main(String[] args) {
	
		String cadena,buscado;
		
		int pos = 0;
		int contador = 0;
		int i;
		
		System.out.println("Escribe la cadena sobre la que quieres buscar");
		Scanner sc = new Scanner (System.in);
		cadena = sc.nextLine();
		
		
		System.out.println("Escribe la cadena que quieres buscar");
		buscado = sc.nextLine();
		
		int j = cadena.indexOf(buscado) + buscado.length()-1;
		for (i=0; i<cadena.length()-1; i+=j) {
			if (cadena.contains(buscado)) {
				contador++;
			}
		}
		
		
		System.out.println("La cadena aparece "+contador+" veces");
		
		
		
	}
		
}
