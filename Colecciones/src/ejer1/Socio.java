package ejer1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
	private int id;
	private String nombre;
	LocalDate fechaNac;

	public Socio(int id, String nombre, String fechaNac) {
			super();
			this.id = id;
			this.nombre = nombre;
			DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.fechaNac = LocalDate.parse(fechaNac, f);
			
		}
	
	public int edad() {
		return (int) this.fechaNac.until(LocalDate.now(),ChronoUnit.YEARS);
	}

	@Override
	public int compareTo (Object o) {
		// TODO Auto-generated method stub
		int result;
		Socio otroS = (Socio) o;
		if (this.id<otroS.id ) {
			result = -1;
		} else if (this.id == otroS.id) {
			result = 0;
		} else {
			result = 1;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}
	
		
	//  GETTERS Y SETTERS (NO HACEN FALTA)	//
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	

}
