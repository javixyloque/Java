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
		HashMap<Character, Academico> ordenados = new HashMap();
		Collections.sort(objetos);
		
		for (Academico a: mapa.values()) {
			objetos.add(a);
		}
		for (Academico ac : objetos) {
			Character key;
			if (mapa.containsValue(ac)) {
				
			}
			
		}
		// Ordenados por letra //
		System.out.println(mapa);
		
		
		
		
		
	}
	
}
