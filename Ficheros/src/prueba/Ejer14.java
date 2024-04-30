package prueba;
import java.io.*;
public class Ejer14 {
	
	public static void main(String[] args) {
		File file = new File("Ejer14.txt");
		File copia = new File("Ejer14_1.txt");
		int c;
		String cadenaFile ="";
		try {
			FileInputStream archivo = new FileInputStream(file);
			do {
				c = archivo.read();
				cadenaFile+=(char)c;
			} while (c!=-1);
			archivo.close();
			
			FileOutputStream copy = new FileOutputStream(copia);
			for (int i  = 0; i<cadenaFile.length(); i++) {
				copy.write(cadenaFile.charAt(i));
			}
			copy.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	// EJERCICIO 15 //
}
