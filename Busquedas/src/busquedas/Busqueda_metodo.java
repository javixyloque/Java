package busquedas;
import java.util.Arrays;
import java.util.Scanner;
public class Busqueda_metodo {
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		
		
		System.out.println ("Escribe el número que quieras buscar (>0). \n-1: FIN");
		int busc = keyboard.nextInt ();
		int indice;
		int v[]= {1,2,3,4,5,45,76,87,92};
		int i;
		indice = Arrays.binarySearch(v, busc);
		//Validar dato >=0
		while (busc<0) {
			for(i=0;i<v.length;i++) {
				
			}
			System.out.println ("Escribe el número que quieras buscar (>0). \n-1: FIN");
			busc = keyboard.nextInt ();
		}
		if (busc != -1) {
			if (indice < 0) {
				System.out.println("El número no existe dentro del array");
				System.out.println ("Escribe el número que quieras buscar (>0). \n-1: FIN");
				busc = keyboard.nextInt ();
			} else {
				System.out.println("El número está en la posición: "+indice);	
			}
		} else if (busc == -1) {
				System.out.println (v.toString());
				keyboard.close();
			//Validar dato >=0
		keyboard.close();
	}
		keyboard.close();
	
	}}
	
	

