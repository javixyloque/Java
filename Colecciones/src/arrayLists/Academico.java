package arrayLists;

import java.util.Comparator;

public class Academico implements Comparable{
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
	public int compareTo(Object obj) {
		if (this.nombre.compareTo(((Academico) obj).getNombre())<0) {
			return -1;
		} else if (this.nombre.compareTo(((Academico) obj).getNombre())==0) {
			return 0;
		} else  {
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
	
}
