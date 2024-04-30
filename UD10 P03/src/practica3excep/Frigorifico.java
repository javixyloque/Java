package practica3excep;

public class Frigorifico extends Electrodomestico{
	private double capacidad;
	public Frigorifico(Calif calif, double consumo, double capacidad) {
		super(calif, consumo);
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Frigorifico [capacidad=" + capacidad + ", id=" + id + ", calif=" + calif + ", consumo=" + consumo
				+ ", nuevo=" + fecha + "]";
	}
	
	
	
}
