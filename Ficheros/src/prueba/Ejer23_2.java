package prueba;

import java.io.*;

public class Ejer23_2 {
	public static void main(String[] args) {
		try {
			FileInputStream archivo = new FileInputStream("prueba2.txt");
			int c;
			c = archivo.read();
			while (c!=-1) {
				System.out.print((char)c);
				c = archivo.read();
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		

	}
}
