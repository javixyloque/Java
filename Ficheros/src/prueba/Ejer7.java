package prueba;
import java.io.*;
	public class Ejer7 {
		public static void main(String[] args) {
			try {
				File path;
				String[] listado;
				path=new File(".");
				listado=path.list();
				for (int i=0;i<listado.length;i++)
					System.out.println(listado[i]);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
