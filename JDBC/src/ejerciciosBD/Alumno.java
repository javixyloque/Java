package ejerciciosBD;

import java.sql.Date;

public class Alumno {
	private int num;
	private String nombre, curso;
	private Date fnac;
	private double media;
	
	public Alumno(int num, String nombre, String curso, Date fnac, double media) {
		super();
		this.num = num;
		this.nombre = nombre;
		this.curso = curso;
		this.fnac = fnac;
		this.media = media;
	}

	
	
	
	// GETTERS Y SETTERS
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getFnac() {
		return fnac;
	}

	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	

	
	
}
