package prueba;

import java.io.*;

public class Ejer23 {
	public static void main(String[] args) {
		String dni  = "12345678A";
		int edad = 36;
		String nombre = "Juan Pérez García";
		
		// CREAR EL FICHERO Y AÑADIR LAS VARIABLES COMO BYTES AL TEXTO //
		
		try  {
			DataOutputStream salida = new DataOutputStream (new FileOutputStream("prueba.txt"));
			salida.writeBytes(dni);
			salida.writeByte('\n');
			salida.writeBytes(String.valueOf(edad));
			salida.writeByte('\n');
			salida.writeBytes(nombre);
			salida.writeByte('\n');
			System.out.println();
			salida.close();
		} catch (IOException e) {
			System.out.println("Error de entrada o salida");
			System.exit(0);
		}
		
		
		// LEER EL FICHERO //
		int c;
		
		try {
		FileInputStream fich = new FileInputStream ("prueba.txt");
		c = fich.read();
		while (c !=-1)  {
			System.out.print((char) c);
			c = fich.read();
		}
		fich.close();
		}
		catch (IOException ex) {
			System.out.println("Error");
			System.exit(0);
		}
	}
	
}
