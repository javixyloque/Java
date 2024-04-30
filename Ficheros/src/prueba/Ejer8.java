package prueba;
import java.io.*;

public class Ejer8 {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		File archivo;
		String dirActual[], buscado, respuesta;
		archivo = new File (".");
		dirActual = archivo.list();
		boolean continuar = true;
		int contador = 0;
		
		do {
			try {
				System.out.println("Escribe el archivo que quieras buscar en el directorio actual");
				buscado = teclado.readLine();
		
				for (int i = 0; i<dirActual.length; i++) {
					if (dirActual[i].equals(buscado)) {
						contador++;
						continuar = false;
					}
				}
				if (contador == 0) {
					System.out.println("El archivo no se encuentra en la ruta actual\n");
					System.out.println("*".repeat(50)+"\n");
				} else {
					System.out.println("El archivo se encuentra en la ruta actual");
				}
				System.out.println("Quiere continuar? (si/no)");
				respuesta = teclado.readLine();
				if (respuesta.toUpperCase().equals("SI")) {
					continuar=true;
				} else if (respuesta.toUpperCase().equals("NO")) {
					continuar=false;
					System.out.println("Fin del programa");
					System.exit(0);
				} else  {
					continuar = true;
				}
				
			} catch (IOException ex) {
				System.out.println("Se ha producido un error inesperado, prueba otra vez");
				continuar = true;
			}
		} while (continuar);
		
	}
	
}
