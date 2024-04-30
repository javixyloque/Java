package metodos;
import java.util.Scanner;
public class strings10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe la cadena de la cual quieres obtener un espejo");
		String original = teclado.nextLine();
		
		String inversa = "";
		
		String siguiente = "";
		
		for (int i = original.length()-2; i >= 0; i--) {
			inversa += original.charAt(i); // Se van sumando caracteres a la cadena inversa //
			siguiente = original + inversa; // Concat la inversa con la original //
		
		}
		
		System.out.println(siguiente);
	}

}
