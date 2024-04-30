package ejerciciosClase;

import java.util.*;

public class PracticaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Texto tex = new Texto (40);
		tex.addComienzo('M');
		tex.mostrarDatos();
		tex.addComienzo(" cadena1");
		tex.mostrarDatos();
		tex.addFinal('s');
		tex.mostrarDatos();
		tex.addFinal(" Final");
		tex.mostrarDatos();
		
		Scanner teclado = new Scanner (System.in);
		int limit;
		boolean correcto = true;
		do {
		try {
			System.out.println("Itntroduzca el tamaño limite para la cadena (int)");
			limit = teclado.nextInt();
			
			if (limit <=0) {
				correcto = false;
				throw new ExceptionNotInteger();
			} else {
				correcto =true;
			}
			
		} catch(InputMismatchException ex) {
			System.out.println("Tipo de dato no entero");
			correcto = false;
		
		} catch (ExceptionNotInteger notInt){
			System.out.println(notInt.mensaje());
		
		} catch (Exception exc) {
			System.out.println(exc);
			correcto = false;
		
		} finally {
			System.out.println("bucle completado");
		}
		} while (correcto == false);
	
	
	
	}

}

