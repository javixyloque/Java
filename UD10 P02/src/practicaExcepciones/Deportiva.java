package practicaExcepciones;

public class Deportiva extends Barco {
	
	// DECLARACIÓN VARIABLE POTENCIA //
	private int potencia;
	
	public Deportiva() {
		super();
		this.potencia=0;
	}
	public Deportiva(String matricula, int eslora, int anioFab, float valAlquiler) {
		super(matricula, eslora, anioFab, valAlquiler);
		// TODO Auto-generated constructor stub
	}
	

	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public float calcularAlquiler () {
		return super.calcularAlquiler()+this.potencia;
	}
	
	
}
