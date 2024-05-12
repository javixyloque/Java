package arrayLists;

public class Academico {
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
	
}
