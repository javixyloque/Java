package practicaExcepciones;

public class Velero extends Barco{

	//	DECLARACION VARIABLE NUMERO DE MASTILES //
	private int nMastiles;

	// CONSTRUCTORES //

	public Velero() {
		super();
		this.nMastiles=0;
	}
	public Velero(String matricula, int eslora, int anioFab, float valAlquiler, int nMastiles) {
		super(matricula, eslora, anioFab, valAlquiler);
		this.nMastiles = nMastiles;
	}
	

	// MÉTODOS //
	

	public float calcularAlquiler () {
		return super.getValAlquiler()+this.nMastiles;
	}

	public int getnMastiles() {
		return nMastiles;
	}


	public void setnMastiles(int nMastiles) {
		this.nMastiles = nMastiles;
	}
	

}
