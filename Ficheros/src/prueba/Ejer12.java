package prueba;
import java.io.*;
public class Ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		String c;
		char cha;
		int charArch, contador = 0;
		
		// FileInputStream es para Sacar datos de un fichero, Output es para escribirlos //
		try {
		FileInputStream archivo = new FileInputStream("Ejer12.txt");
		System.out.println("Introduzca el caracter que quiere buscar en el archivo Ejer12.txt");
		c = teclado.readLine();
		cha = c.charAt(0);
		// LEER UNA VEZ ANTES PARA QUE NO SEA EL -1 EN EL BUCLE //
		charArch = archivo.read();
		while (charArch!=-1) {
			if ((char)charArch == cha) {
				contador++;
			}
			charArch= archivo.read();
		}
		System.out.println("El carácter buscado aparece "+contador+" veces");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}

}
