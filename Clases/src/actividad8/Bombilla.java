package actividad8;

public class Bombilla {
	
	private int potencia;
	private boolean encendida;
	
	public Bombilla () {
		this.potencia = 60;
		this.encendida = false;
	}
	
	public Bombilla (int potencia) {
		this.potencia = potencia;
		this.encendida = false;
	}
	
	public Bombilla (boolean encendida) {
		this.potencia = 60;
		this.encendida = encendida;
	}
	public Bombilla (int potencia, boolean encendida) {
		this.potencia = potencia;
		this.encendida = encendida;
	}
	
	// GETTERS Y SETTERS // 

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
	
}
