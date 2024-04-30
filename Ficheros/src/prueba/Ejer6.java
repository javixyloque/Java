package prueba;

import java.io.*;
public class Ejer6 {
  public static void main(String[] args) {
	File fichero;
	BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	String nombre;
	System.out.println("\nIntroduce el nombre del fichero: ");
			try {
			nombre=teclado.readLine();
			fichero=new File(nombre);
			if (fichero.exists()) {
			   System.out.println("El fichero existe");
			   		if (fichero.isFile())
			   			System.out.println(fichero.getName()+" es un fichero.");
			   		else
			   			System.out.println(fichero.getName()+" es un directorio");
			}	else
				   System.out.println("El fichero no existe.");
				}catch(IOException e) { 
				   System.out.println(e.getMessage());
				}
		finally {
		   if (teclado!=null) {
		      try {
			     teclado.close();
			  }
		      catch(IOException e) {
			     System.out.println(e.getMessage()); 
		      }
		      }
		    }
	  }
	}
