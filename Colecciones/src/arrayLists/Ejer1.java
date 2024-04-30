package arrayLists;
import java.util.*;
public class Ejer1 {
	public static void main(String[] args) {
		ArrayList<String> coches = new ArrayList<String>();
		coches.add("Toyota");
		coches.add("Bentley");
		coches.add("Ford");
		coches.add("Seat");
		
		// FOREACH PARA RECORRER EL ARRAY	//
		for (String coche: coches) {
			System.out.println("> "+coche);
		}
		// SE LE PUEDE A�ADIR UN INDICE, QUE POSICIONA EL ELEMENTO EN ESE INDICE, MOVIENDO HACIA DELANTE LOS DEM�S //
		coches.add(2, "BMW");
		
		// SE PUEDE IMPRIMIR EL ARRAYLIST, PERO QUEDA  FEUCHO	//
		System.out.println(coches);
		System.out.println("*".repeat(60));
		
//		ITERADOR PARA RECORRER EL ARRAY	//
		Iterator<String> i  = coches.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Hola mundo");
		
	}
}
