package busquedas;
import java.util.Scanner;


public class BusquedaBin {

	public static void main(String[] args) {				
		Scanner keyboard = new Scanner(System.in);
		int v[]= {1, 2, 3, 4, 5, 6};
		int i, j, k;
		i= 0;
		j= v.length-1;
		
		System.out.println("Qué numero quieres buscar?");
		int busc = keyboard.nextInt();
		
		do {
			k = (i+j)/2;
			if (v[k]<=busc)
				i=k+1;
			if (v[k]>=busc)
				j=k-1;
		} while (i<=j);
		
		if (v[k] == busc) {
			System.out.println ("Encontrado en la posicion " +k);
			
		} else {
			System.out.println("Número no encontrado");
			
		}
		keyboard.close();	
	}
}
