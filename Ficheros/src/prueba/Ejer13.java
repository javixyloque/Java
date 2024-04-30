package prueba;

import java.io.*;

public class Ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1, c2, contador1 = 0, contador2 = 0;
		File file1 = new File ("C:\\Users\\peros\\OneDrive - Educacyl\\Javi Java\\Ficheros\\Ejer13_1.txt");
		File file2 = new File("C:\\Users\\peros\\OneDrive - Educacyl\\Javi Java\\Ficheros\\Ejer13_2.txt");
		try {
			FileInputStream archivo1 = new FileInputStream (file1); 
			FileInputStream archivo2 = new FileInputStream (file2);
			c1=archivo1.read();
			c2=archivo2.read();
			while(c1!=-1 && c2!=-1) {
				if (c1 == c2) {
					contador1++;	
				}
				contador2++;
				c1 = archivo1.read();
				c2 = archivo2.read();
			}
			if (contador1 == contador2) {
				System.out.println("Ambos archivos contienen el mismo texto");
			} else {
				System.out.println("No contienen el mismo texto");
			}
			archivo1.close();
			archivo2.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

}
