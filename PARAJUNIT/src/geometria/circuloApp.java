package geometria;
import java.util.Scanner;

public class circuloApp {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		Circulo cir;
		boolean seguir=true;
		float radio;
	
		while(seguir) {
		System.out.println("Dime el radio");
		radio=keyboard.nextFloat();
		cir=new Circulo(radio);
		System.out.println(cir.area());
		System.out.println(cir.perimetro());
		System.out.println("Radio es: " + cir.setRadio(radio));
		
		System.out.println("Quieres seguir?");
		seguir=keyboard.nextBoolean();
		
		}
		// Conditional suspend when true suspende la ejecución cuando //
		// se cumple la condicion que damos //
	}
}
