package metodos;
import java.util.Scanner;
import java.lang.reflect.Array;


public class Metodos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lectura();
	}
	
	static void lectura() {
		
		
		int [] numeros = {4, 7, 9, 32, 4, 7};
		Scanner sc = new Scanner (System.in);
		
		System.out.println(mayor(numeros));
		
		
	}
	private static int  mayor(int[] numeros) {
		// TODO Auto-generated method stub
		int max = numeros[0];
		for (int i = 0; i<=numeros.length-1; i++) {
			if (numeros[i]>max) {
				max = numeros[i];
			}
		}
		
			return (max);
		
		
	}

	
}
