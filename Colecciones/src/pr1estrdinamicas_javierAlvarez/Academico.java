package pr1estrdinamicas_javierAlvarez;

import java.io.Serializable;
import java.util.Comparator;

public class Academico implements Comparable<Academico>, Serializable{
	private String nombre;
	private int aIngreso;
	
	public Academico(String nombre, int aIngreso) {
		super();
		this.nombre = nombre;
		this.aIngreso = aIngreso;
	}

	@Override
	public String toString() {
		return "Academico [nombre=" + nombre + ", aIngreso=" + aIngreso + "]";
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getaIngreso() {
		return aIngreso;
	}

	
	public void setaIngreso(int aIngreso) {
		this.aIngreso = aIngreso;
	}

	@Override
	public int compareTo(Academico acad) {
		if (this.getNombre().compareTo(acad.getNombre())<0) {
			return -1;
		} else if (this.getNombre().compareTo(acad.getNombre())==0) {
			return  0;
		} else {
			return 1;
		}
	}
	@Override
	public boolean equals (Object obj) {
		if (this.nombre.equals(((Academico) obj).getNombre())) {
			return true;
		} else {
			return false;
		}
	}
	// METODO QUE SE PUEDE USAR PARA ORDENAR POR EDADES CON CODIGO LAMBDA	arr.sort((obj1,obj2)-> obj1.compareTo(obj2)//
	public int comparaEdad(Academico acad) {
		if (this.aIngreso<acad.getaIngreso()) {
			return -1;
		} else if (this.aIngreso==acad.getaIngreso()) {
			return 0;
		} else {
			return 1;
		}
		
	}

	
	
}
