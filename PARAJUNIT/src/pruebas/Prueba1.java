package pruebas;
import dialogos.Dialogos;
import java.util.Scanner;


	public class Prueba1 {
		/*
		 * Este método pide un número positivo entero al usuario y le muestra el valor de la suma
		 * de todos los enteros desde 1 hasta el número dado.
		 */

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Dame un numero");
			int numeroDado = teclado.nextInt();
			sumarEnteros(3);
			sumarEnteros(0);
			sumarEnteros(123243534);
			sumarEnteros(Integer.MAX_VALUE);

		}
		

		public static long sumarEnteros(int numeroDado) {
				long suma = 0;
			long contador = 0;
			
			/* Comprobamos que el número es mayor que cero */
			if (numeroDado > 0) {
				/* Cuando es mayor que cero realizamos la sumas */
				while (contador <= numeroDado) {
					suma= suma +contador;
					contador = contador + 1;
				}
				System.out.println(numeroDado + "" + suma);
				return suma;
			} else {
				return -1;
			}
		}}

