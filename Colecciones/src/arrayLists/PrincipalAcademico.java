package arrayLists;

import java.util.*;
import java.util.Map.Entry;

public class PrincipalAcademico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		char letra;
		String nombre; 
		int aIngreso;
		char respuesta;
		HashMap<Character, Academico> mapa = new HashMap<Character, Academico>();
		Boolean continuar = true;
		while (continuar) {
			System.out.println("Inserte el nombre del nuevo académico");
			nombre = sc.next();
			System.out.println("¿En qué año ingresó?");
			aIngreso = sc.nextInt();
			System.out.println("¿Qué sillón ocupa?");
			letra = sc.next().toLowerCase().charAt(0);
			
			Academico acad = new Academico (nombre, aIngreso);
			nuevoAcademico(mapa, acad, letra);
			
			System.out.println("Quiere continuar (S/N)?");
			respuesta = sc.next().charAt(0);
			if (respuesta =='s' || respuesta == 'y') {
				continuar = true;
			} else if (respuesta=='n') {
				continuar = false;
			}
			
		}
		mostrarDatos(mapa);
		
	}

	static boolean nuevoAcademico (HashMap<Character, Academico> mapa, Academico acad, char letra) {
			
		
		if ((65<=letra && letra<=90 ) || (97<=letra && letra<=122)) {
			mapa.put(letra, acad);
		}

		
		if (mapa.containsValue(acad)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	static void mostrarDatos(HashMap<Character, Academico> mapa) {

		ArrayList<Academico> objetos = new ArrayList();
		
		
		for (Academico a: mapa.values()) {
			objetos.add(a);
		}
		
		objetos.sort((ob1, ob2) -> ob1.compareTo(ob2));
		
		System.out.println(objetos);
		
		System.out.println("Vamos a verlos ordenados por nombre");
		// BUCLE RECORRE OBJETOS	//
		for (Academico a : objetos) {
			mapa.forEach((key, value) -> {
				if (value.equals(a)) {
					System.out.println("Key: "+key+" Value: "+value);
					
				}
			});
		} 
		
		
		// Ordenados por letra //
		System.out.println("Ordenados por letra del asiento");
		System.out.println(mapa);
		
		
		
		
		
	}
	
}
