package prueba;
import java.io.*;

	public class Ejer10 {
		public static void main(String[] args) throws IOException {
		int c;
		File archivo = new File("C:\\Users\\Mañana\\Desktop\\Javi Java\\Ficheros\\texto2.txt");
		try {
		FileInputStream fich=new FileInputStream(archivo);
		c =fich.read();
		//ruta de ejemplo windows: D:\\eclipse-workspace\\Ficheros\\ficheros\\texto2.txt
		while(c!=-1) {
		   System.out.print((char)c);
		   //visualiza el código asccii de cada carácter que lee del fichero
			c =fich.read();

		}
		fich.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}
		
	}
}

