package ejercicio8;
import java.util.*;
public class Array {
	
	public static void main(String[] args) {
		int num;
		
		int [] nums = {0, 1, 2, 3, 4, 5, 6, 7};
		Scanner sc = new Scanner (System.in);
		boolean continuar = true;
		do {
		try {
			System.out.println("Escribe el indice del array al que quieres acceder");
			num = sc.nextInt();
			System.out.println("El numero de la posicion "+num+" es "+ nums[num]);
			continuar = true;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No se ha introducido un número dentro de los índices del array");
			continuar =false;
		}
		} while (continuar == false);
		
		
		
	}

}
