package metodos;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class Metodos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner (System.in);
		int longitud;
		
		
		System.out.println("Escribe el número de parejas que vas a insertar");
		longitud = keyboard.nextInt();
		String[] ingles = new String[longitud];
		String[] espanol = new String [longitud];
		
		for (int i=0; i<=ingles.length-1; i++) {
			System.out.println("Escribe la palabra Nº"+(i+1)+" en inglés");
			ingles[i] = keyboard.next();
			
			System.out.println("Escribe la correspondiente (Nº "+(i+1)+") en español");
			espanol[i] = keyboard.next();
		}
		orden(ingles, espanol);
	}
	
	static void orden(String ingles[], String espanol[]) {
		for (int j = 0; j<=ingles.length-2; j++) {
			if (ingles[j].compareTo(ingles[j+1])>1) {
				String aux = ingles[j];
				ingles [j] = ingles[j+1]; 
				ingles [j+1] = aux;
				String aux2 = espanol[j];
				espanol [j] = espanol[j+1]; 
				espanol [j+1] = aux2;
			} 
			
		}
		solucion(ingles, espanol);
		
		
	}
	
	static void solucion (String[] ingles, String[] espanol) {
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("\nEscribe ahora la palabra en inglés del vector y obtendrás la traducción\nPara acabar: fin");
		String busc = keyboard.nextLine();
		if (busc.equals("fin")) {
			System.out.println("Se acabó");
			keyboard.close();
			System.exit(0);
		}
		
			do {
			
				for (int i = 0; i<=ingles.length-1;i++) {
					if (busc.compareTo(ingles[i]) == 0) {
						System.out.println("La traducción de "+ingles[i]+ " es "+espanol[i]);
						solucion(ingles, espanol);
					} 
				}
				System.out.println("No existe");
				solucion(ingles, espanol);
			} while(keyboard.next()!="fin");
			
			
		/*	if (keyboard.next().equals("fin")) {
				System.out.println("Se acabó");
				keyboard.close();
				System.exit(0);
			}*/
		
	}
}

/*Modules.info tb para entornos*/