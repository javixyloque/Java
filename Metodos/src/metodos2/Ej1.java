package metodos2;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		System.out.println("Escribe dos enteros y se te devolverán aleatorios entre ellos");
		System.out.println("Escribe el primer entero");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo entero");
		int num2 = sc.nextInt();
		System.out.println(aleatorio (num1, num2));
	}

	static int aleatorio (int num1, int num2) {
		
		return (int) Math.random()*num1+num2;
	}
}
