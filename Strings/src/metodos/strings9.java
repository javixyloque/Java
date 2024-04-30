package metodos;
import java.util.Scanner;

public class strings9 {
public static void main(String[] args) {
	/*Scanner sc = new Scanner (System.in);
	String cadena1, busc, sustra;
	int pos;
	System.out.println("Escribe una cadena de texto");
	cadena1 = sc.nextLine();
	
	System.out.println("Escribe la cadena que quieras poner en mayúsculas");
	busc = sc.nextLine();
	pos = cadena1.indexOf(busc, 0);	
	int j = cadena1.indexOf(busc) + busc.length();
	if (pos + j == busc.length()) {
		sustra = cadena1.substring(pos,busc.length());
		sustra.toUpperCase();
		System.out.println(sustra);
	}
	System.out.println(cadena1);*/
	
	
	String original = "Quiero comer arroz, arroz"; 
	String busc = "arroz";
	original = original.replace (busc, busc.toUpperCase()); //REEMPLAZA UNA CADENA POR OTRA, PUEDEN SER CARACTERES O STRINGS COMPLETOS//
	//.replace (cadena que estoy buscando, cadena que sustituye)//
	System.out.println(original);

	
}
}
