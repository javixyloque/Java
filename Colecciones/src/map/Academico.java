package map;

public class Academico implements Comparable {
	private String nombre;
	private int anIngreso;
	
	public Academico(String nombre, int anIngreso) {
		super();
		this.nombre = nombre;
		this.anIngreso = anIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnIngreso() {
		return anIngreso;
	}

	public void setAnIngreso(int anIngreso) {
		this.anIngreso = anIngreso;
	}

	@Override
	public int compareTo(Object o) {
		if (this.anIngreso<((Academico) o).getAnIngreso()) {
			return -1;
		}
	}
}
