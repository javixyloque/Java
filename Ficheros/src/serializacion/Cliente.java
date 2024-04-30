package serializacion;
import dialogos.Dialogos;
import java.io.*;

public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	
	
	public Cliente() {
		this.datosCliente();
	}


	public Cliente(int id, String nombre) {	
		this.id = id;
		this.nombre = nombre;
	}


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


	public void datosCliente() {		
		this.id=Dialogos.pedirEntero("Número cliente");
		this.nombre=Dialogos.pedirCadena("Nombre del cliente");
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
