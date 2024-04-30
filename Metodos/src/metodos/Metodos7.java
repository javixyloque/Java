package metodos;
import java.util.Scanner;

public class Metodos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lectura();
	}
	static void lectura () {
		Scanner sc = new Scanner (System.in);
		
		int num;
		System.out.println ("Escribe el número del que quieres obtener la tabla de multiplicar");
		num = sc.nextInt();
		System.out.println(tabla(num));
	}
	
	
	static String tabla(int num) {
		return "Tabla del "+num+":\n"
	+num+" x 1 = "+num+"\n"
	+num+" x 2 = "+num*2+"\n"
	+num+" x 3 = "+num*3+"\n"
	+num+" x 4 = "+num*4+"\n"
	+num+" x 5 = "+num*5+"\n"
	+num+" x 6 = "+num*6+"\n"
	+num+" x 7 = "+num*7+"\n"
	+num+" x 8 = "+num*8+"\n"
	+num+" x 9 = "+num*9+"\n"
	+num+" x 10 = "+num*10+"\n";
	
		
		
	}
}
