package metodos;
import java.util.Scanner;

public class Metodos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		double temp;
		System.out.println("Escribe la temperatura actual (ºC) y se convierte a ºF");
		temp = keyboard.nextDouble();
		System.out.println(convertidor (temp));
	}
	static double convertidor (double temp) {
		double fahrenheit = (temp*9/5)+32;
		return fahrenheit;
	}

}
