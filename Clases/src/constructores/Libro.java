package constructores;

public class Libro {
	private String nombre;
	private String nomAutor;
	private static String nomEdit;
	public Libro (String titulo, String nomAut) {
		this.nombre = titulo;
		this.nomAutor = nomAut;
	}
	public void setEdit (String nomE) {
		this.nomEdit = nomE;
	}
	public String getEdit () {
		return this.nomEdit;
	}
	
	public class Autor {
		String nombre;
		float gananciasAutor;
		static float IRPF;
	}

}
