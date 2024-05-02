package ejer1;

import java.util.ArrayList;
import java.util.Comparator;


//		AL PONER EL <SOCIO> LE INDICAMOS QUE USA OBJETOS DE LA CLASE SOCIO		//
public class ComparaNombres implements Comparator <Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		String nombre1 = o1.getNombre();
		String nombre2 = o2.getNombre();
		if (nombre1.compareTo(nombre2)<0) {
			return -1;
		} else if (nombre1.compareTo(nombre2)==0) {
			return 0;
		} else {
			return 1;
		}
	}

	

}
