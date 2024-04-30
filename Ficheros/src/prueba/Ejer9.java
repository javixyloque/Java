package prueba;
import java.io.*;
public class Ejer9 {
	public static void main(String[] args) {
		File archivo = new File (".");
		// MÉTODO PARA RELLENAR EL ARRAY DE ARCHIVOS //
		File escogidas[]  = archivo.listFiles();
		
		
		for (int i  = 0; i<escogidas.length; i++) {
			// COMPROBAR SI ES UN ARCHIVO (ISFILE) //
			if (escogidas[i].isFile()) {
				System.out.println("Archivo: "+escogidas[i].getName());
				// PODRIA SER UN ELSE SIMPLEMENTE //
			} else if (escogidas[i].isDirectory()) { 
				System.out.println("Directorio: "+escogidas[i].getName());
			}
		}
	}
}
