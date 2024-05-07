package ejer1_comparadores;

import java.util.Comparator;

public class ComparaNombres implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;
		resul=((Socio) o1).getNombre().compareTo(((Socio)o2).getNombre()); 
		//llamamos al método compareTo de la clase String, puesto que el atributo nombre
		//de Socio es un String
		return (resul);
	}
	

}
