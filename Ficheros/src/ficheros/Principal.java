package ficheros;
import java.io.*;
public class Principal {
	
	final static String RUTA = "C:\\Users\\Mañana\\Desktop\\Javi Java\\Ficheros";
	static File entrada = new File (RUTA, "inven.dat");
	
	public static void main(String[] args) {
		LineaOrden []linea = new LineaOrden[5];
		String desc;
		int unidades, contador = 0;
		double precio;
		
		try {
			DataInputStream entrada = new DataInputStream (new FileInputStream("inven.dat"));
			desc = entrada.readUTF();
			while (desc !=null) {
				unidades = entrada.readInt();
				precio = entrada.readDouble();
				linea[contador] = new LineaOrden(desc, unidades, precio);
				contador++;
				desc=entrada.readUTF();
			}
			entrada.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			   
		} catch (EOFException e2) {
			System.out.println("fin");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		mostrarDatos(linea);
		
	}
	
 	static void mostrarDatos(LineaOrden linea[])  {
 	
 		/*
 		 * for (int i  = 0; i<linea.length; i++) {
 		 * 		linea[i].mostrarDatos();
 		 * }
 		 */
 		
 	// FOREACH IGUAL QUE EN TYPESCRIPT	//
 		for (LineaOrden lin: linea) {
 			lin.mostrarDatos();
		}
 	}
	
}
