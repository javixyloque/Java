package practica3excep;

import java.time.LocalDateTime;
import java.util.Date;


public class Electrodomestico {
	protected static int idGlobal = 0;
	protected int id = 0;
	protected Calif calif;
	protected double consumo;
	protected Date fecha;
	
	public Electrodomestico (Calif calif, double consumo) {
		idGlobal++;
		this.consumo = consumo;
		this.calif = calif;
		this.id = idGlobal;
		this.fecha = new Date();
	}
	
	// GETTERS Y SETTERS //


	public Calif getCalif() {
		return calif;
	}

	public void setCalif(Calif calif) {
		this.calif = calif;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Electrodomestico [id=" + id + ", calif=" + calif + ", consumo=" + consumo + ", Fecha de registro=" + fecha + "]";
	}
	
	
	
}
