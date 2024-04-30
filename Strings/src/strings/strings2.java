package strings;
import java.util.Scanner;

public class strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Escribe una caden y se te devolveran las vocales");
		String frase = sc.next();
		int contador = 0;
		int i;
		for (i=0; i<=frase.length()-1; i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
			{
				System.out.print(frase.charAt(i));
				contador++;
			}
		}
		System.out.println("\nLa frase tiene "+contador+" vocales");
		
		
	
	}

}
