package practica;

import java.io.Serializable;

public class Academico implements Comparable<Academico>, Serializable {
	
	private String nombre;
	private int aIngreso;
	



	public Academico(String nombre, int aIngreso) {
		super();
		this.nombre = nombre;
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

}
