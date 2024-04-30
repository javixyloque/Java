package metodos;
import java.util.Scanner;

public class Metodos2 {
public static void main(String[] args) {
	System.out.println("Escribe un número real y se te devolverá");
	Scanner keyboard = new Scanner(System.in);
	double num = keyboard.nextFloat();
	System.out.println(lectura(num));
}

public static float lectura(double num) {
	return (float) num;
}

}


