package prueba;
import java.io.*;
public class EjemploDataOutput {
public static void main(String[] args) {
	String cadena;
	char c;
	int num;
	try {
		DataOutputStream salida = new DataOutputStream (new FileOutputStream("prueba.dat"));
		salida.writeUTF("Hola buenas tardes");
		salida.writeChar('\n');
		salida.writeInt(15);
		DataInputStream entrada = new DataInputStream(new FileInputStream("prueba.dat"));
		cadena = entrada.readUTF();
		
		while (cadena!=null) {	
			c = entrada.readChar();
			num = entrada.readInt();
			System.out.println(cadena+c+num);
			cadena = entrada.readUTF();
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	} 
	
}
}
