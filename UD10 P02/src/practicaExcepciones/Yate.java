package practicaExcepciones;

public class Yate extends Deportiva{
	
	// DECLARACIÓN DE VARIABLE NCAMAROTES //
	
	private int nCamarotes;
	
	
	// CONSTRUCTORES //
	
	public Yate(String matricula, int eslora, int anioFab, float valAlquiler) {
		super(matricula, eslora, anioFab, valAlquiler);
		// TODO Auto-generated constructor stub
	}
	public Yate() {
		super();
	}
	
	
	// METODOS //
	
	public float calcularAlquiler () {
		return super.calcularAlquiler()+this.nCamarotes;
	}


	public int getnCamarotes() {
		return nCamarotes;
	}

	public void setnCamarotes(int nCamarotes) {
		this.nCamarotes = nCamarotes;
	}
	
	
	
}
