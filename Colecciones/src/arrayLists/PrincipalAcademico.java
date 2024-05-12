package arrayLists;

import java.util.*;

public class PrincipalAcademico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academico a = new Academico ("Joselu", 2006);
		Character letra = 'F';
		HashMap<Character, Academico> mapa = new HashMap();
		nuevoAcademico(mapa, a, letra);
		System.out.println(nuevoAcademico(mapa, a, letra));
	}

	static boolean nuevoAcademico (HashMap<Character, Academico> mapa, Academico a, Character letra) {
	
		if ((65<=letra && letra<=90 ) || (97<=letra && letra<=122)) {
			mapa.put(letra, a);
		}

		
		System.out.println(mapa);
		if (mapa.containsValue(a)) {
			return true;
		} else {
			return false;
		}
		
		
		
		
	}
	
}
