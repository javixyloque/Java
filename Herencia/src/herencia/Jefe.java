package herencia;

public class Jefe extends Empleado{
	private String titulo;
	private String nomDep;
	
	public Jefe () {
		super();
		this.titulo = null;
	}
	public Jefe (String nombre, int edad, double salario, String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}

}
