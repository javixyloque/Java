package practicaExcepciones;
import java.time.*;
public class Alquiler {
	
	// DECLARACIÓN CONSTANTES //
	private String nombre, DNI;
	private int[] amarre = new int[2];
	private Barco barco;
	private LocalDate fecha;
	
	// CONSTRUCTOR POR DEFECTO //
	public Alquiler() {
		this.nombre="";
		this.DNI="";
		this.amarre = null;
		this.barco=null;
		this.fecha= null;
	}
	public Alquiler(String nombre, String DNI) {
		this.nombre=nombre;
		this.DNI=DNI;
		this.amarre = null;
		this.barco=null;
		this.fecha= null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int[] getAmarre() {
		return amarre;
	}

	public void setAmarre(int[] amarre) {
		this.amarre = amarre;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha() {
		this.fecha = LocalDate.now();
	}
	
	
	
}
