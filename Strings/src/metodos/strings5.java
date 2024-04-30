package metodos;
import java.util.Scanner;
public class strings5 {
public static void main(String[] args) {
	
	String state1;
	char w;
	int pos;
	Scanner sc= new Scanner(System.in);
	
	System.out.println ("Escribe una cadena");
	state1 = sc.nextLine();
	
	System.out.println("Escribe el caracter que quieras buscar dentro de la cadena");
	w = sc.nextLine().charAt(0);
	pos = state1.indexOf(w, 0);
	if (pos>0) {
		System.out.print("El carácter "+w+" se encuentra en la posición "+pos);
		sc.close();
	}
	else {
		System.out.print("El carácter "+w+" no se ha encontrado");
		sc.close();
		System.exit(0);
	}
	
	
}
}
