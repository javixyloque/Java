package prueba;
import java.util.Scanner;
import java.io.*;
public class Ejemplo {

	public static void main(String[] args) throws IOException {
		Scanner entrada=new Scanner(System.in);
		String cadena;
		int car;
		char caracter;
		int pos;
		
		//Abrir fichero para escritura
		FileOutputStream fichEsc=new FileOutputStream("hola.txt");
		System.out.println("Introduce una frase: ");
		cadena=entrada.nextLine();
		for (pos=0;pos<cadena.length();pos++)
			fichEsc.write(cadena.charAt(pos));
		fichEsc.write('\n');
		fichEsc.close();
		System.out.println("CONTENIDO DEL FICHERO");
		//Abrir fichero para lectura
		FileInputStream fichLectura=new FileInputStream("hola.txt");
		car=fichLectura.read();
		while(car!=-1) {
		caracter=(char) car; //convertimos ASCII a char
		System.out.print(caracter);
		car=fichLectura.read();
		}
		fichLectura.close();
		}

}
