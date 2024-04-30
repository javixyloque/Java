package metodos;
import java.util.Scanner;

public class Metodos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num1, num2, num3;
		System.out.println("Escribe los números que quieres comparar");
		System.out.println("Escribe el primer entero");
		num1 = sc.nextInt();
		System.out.println("Escribe el segundo entero");
		num2 = sc.nextInt();
		System.out.println("Escribe el tercer entero");
		num3 = sc.nextInt();
		System.out.println("El número más alto es "+comparador(num1, num2, num3));

		
	}
	public static int comparador(int num1, int num2, int num3) {
		if (num1 >num2 && num1>num3) {
			return num1;
		} else if (num2>num1 && num2>num3) {
			return num2;
		} else {
			return num3;
		}
	}

}
