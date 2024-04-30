package metodos;
import java.util.Scanner;
public class Metodos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe el numero del que quieres obtener el vectorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		vectorial(num);
	}

	
	public static void vectorial(int i) {
		int mult2 = 1;
		for (int j=1; j<i; j++) {
			mult2 += j+1;
		}
		System.out.println(mult2);
	}
	
}
