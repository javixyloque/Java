package usoObjetos; 

public class Alumno {
	private int nExp, edad;
	private String nombre;
	private String apellidos;
	private double nMedia;
	
	public Alumno (int ne, String nom, String ape, double nm) {
		this.nExp = ne;
		this.nombre = nom;
		this.apellidos = ape;
		this.nMedia = nm;
	}
	public Alumno (int ne, String nom, String ape) {
		this.nExp = ne;
		this.nombre = nom;
		this.apellidos = ape;
		this.nMedia = 0.0;
	}
	public void visualizarDatosAlumno () {
		System.out.println("nExp "+this.nExp);
		System.out.println("Nombre " + this.nombre);
		System.out.println("Apeññodps "+ this.apellidos);
		System.out.println("Nota Media "+ this.nMedia);
	}
	public void setExp (int ne) {
		this.nExp = ne;
	}
	
	public int getExp () {
		return (this.nExp);
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	private String getNombre() {
		return (this.nombre);
	}
	public void crearAlumno (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
}
