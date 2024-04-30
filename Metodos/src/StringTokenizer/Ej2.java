package StringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int i  = 0;
		
		System.out.println("Escribe un nº de telefono del tipo (555) 555- 5555");
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer (num, "()- ");
		String numTel [] = new String [st.countTokens()];
		
		while (st.hasMoreTokens() ) {
			numTel [i] = st.nextToken();
			i++;
		}
		System.out.println("\n");
		
		int codProvincia = Integer.parseInt (numTel[0]);
		String numero = numTel[1].concat(numTel[2]);
		String numeroCompleto = codProvincia+numero;
		Long numeroTelefono = Long.parseLong(numeroCompleto);
		
		System.out.println("El código de provincia es: "+codProvincia+"\n");
		System.out.println("El número al que está intentando acceder es el: "+numero+"\n");
		System.out.println ("Llamando al número: "+numeroTelefono);
		
		
		
		sc.close();
		System.exit(0);

	
	}

}
