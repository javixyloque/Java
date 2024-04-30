

public class Libro {
	private String nombre;
	private String nomAutor;
	private static String nomEdit;
	public void Libro (String titulo, String nomAut) {
		this.nombre = titulo;
		this.nomAutor = nomAut;
	}
	public static void setEdit (String nomE) {
		Libro.nomEdit = nomE;
	}
	public String getTitulo (String nombre ) {
		return this.nombre;
	}
	public String getNomAutor (String nomAutor) {
		return this.nomAutor;
	}
	public String getEdit () {
		return this.nomEdit;
	}
	public void visualizarDatos () {
		System.out.println("Título: "+this.nombre);
		System.out.println("Nombre del autor: "+this.nomAutor);
		System.out.println("Editorial: "+this.getEdit());
	}
	
	public class Autor {
		String nombre;
		float gananciasAutor;
		static float IRPF;
		public void crearAutor (String nombre, float ganancias) {
			this.nombre = nombre;
			this.gananciasAutor = ganancias;
			
		}
		public void visualizar() {
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

	

}