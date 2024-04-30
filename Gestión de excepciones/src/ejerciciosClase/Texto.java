package ejerciciosClase;
import java.util.*;
public class Texto {
	private final int LONGMAX;
	private char [] arr;
	Scanner sc = new Scanner (System.in);
	
	public Texto (int longitud) {
		this.LONGMAX = longitud;
		this.arr = new char[LONGMAX];
	}
	
	public void addComienzo(char a) {
		
	}
	
	public void addComienzo (String a) {
		
	}
	public void mostrarDatos () {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	public void addFinal (char a) throws ArrayIndexOutOfBoundsException{
		int respuesta;
		try {
			System.out.println("Escribe la posición en la que quieres añadir el carácter");
			respuesta = sc.nextInt();
			arr[respuesta] = a;
		} catch(ArrayIndexOutOfBoundsException e)  {
			System.out.println("El array no tiene tantas posiciones");
		}
	}
	public void addFinal (String a) {
		char b  = a.charAt(0);
		int respuesta;
		try {
			System.out.println("Escribe la posición en la que quieres añadir el carácter");
			respuesta = sc.nextInt();
			arr[respuesta] = b;
		} catch(ArrayIndexOutOfBoundsException e)  {
			System.out.println("El array no tiene tantas posiciones");
		}
	
	}
}
