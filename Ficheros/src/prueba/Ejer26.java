package prueba;
import java.io.*;
public class Ejer26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nAlumnos, nombre, edad;
		Alumno a[];
		File file = new File("archivo.dat");
		try {
		BufferedReader kb = new BufferedReader (new InputStreamReader(System.in));
		//	OBJECTOUTPUT PUEDE PASAR OBJETOS A UN ARCHIVO DIRECTAMENTE	//
		ObjectOutputStream archivo = new ObjectOutputStream (new FileOutputStream(file));
		System.out.println("Escribe cuantos alumnos quieres registrar");
		nAlumnos = Integer.parseInt(kb.readLine());
		a = new Alumno[nAlumnos];
		//FOREACH NO SE PUEDE USAR SI QUIERES ACCEDER AL NUMERO DE POSICION QUE OCUPAN EN EL ARRAY	//
		for (int i = 0; i<nAlumnos; i++) {
			System.out.println("Datos del alumno "+(i+1));
			a[i] = new Alumno();
		}
		kb.close();
		
		for (Alumno alumno: a) {
			archivo.writeObject(alumno);
		}
		archivo.close();
		
		//	OBJECTINPUTSTREAM FUNCIONA COMO DATA PERO CON OBJETOS EXTRAIDOS DEL ARCHIVO
		
		ObjectInputStream fichero= new ObjectInputStream(new FileInputStream(file));
		
		// TRY / CATCH PARA EVITAR EL EOFEXCEPTION AL FINAL DEL BUCLE DE LECTURA //

		try {
			for (Alumno al: a) {
				al = (Alumno) fichero.readObject();
				al.visualizarDatos();
			}
			// CON EL FOREACH NI SIQUIERA ENTRA EN LA EXCEPCIÓN, SOLO RECORRE ELEMENTOS HASTA EL FINAL DEL ARRAY	//
		} catch (EOFException e) {
				System.out.println("No hay mas alumnos");
		}
		fichero.close();
		System.out.println("\n"+"*".repeat(50)+"\nFin del programa\n\n"+"*".repeat(50));
		
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
