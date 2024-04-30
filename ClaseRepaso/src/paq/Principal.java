package paq;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Hora h1 = new Hora();
		String respuesta;
		String []arr = new String [3];
		int i = 0;
		int respuesta3;
		
		System.out.println("Qué hora es?");
		respuesta = teclado.nextLine();
		StringTokenizer respuesta2 = new StringTokenizer (respuesta, ": .,");
		while (respuesta2.hasMoreTokens()) {
			arr[i] = respuesta2.nextToken();
			i++;
		}
		h1.setHora(Integer.valueOf(arr[0]));
		h1.setMin(Integer.valueOf(arr[1]));
		h1.setSeg(Integer.valueOf(arr[2]));
		System.out.println("Cuantos segundos quieres incrementar");
		respuesta3 = teclado.nextInt();
		for (int j = 0; j<respuesta3; j++) {
			h1.incSeg();
			h1.mostrarDatos();
		}
		
		
		
	
	}
}
