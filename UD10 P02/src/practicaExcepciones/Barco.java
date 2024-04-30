package practicaExcepciones;

public class Barco {
	
	// DECLARACIÓN DE VARIABLES //
	private String matricula;
	private int eslora, anioFab;
	private float valAlquiler;
	private final int PRBASE = 15;
	
 	
	// CONSTRUCTOR //
	public Barco() {
		super();
		this.matricula="";
		this.eslora= 0;
		this.anioFab=0;
		this.valAlquiler=0;
	}
	
	public Barco(String matricula, int eslora, int anioFab, float valAlquiler) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFab = anioFab;
		this.valAlquiler = valAlquiler;
	}
	

	
	// GETTERS Y SETTERS VARIOS //
	
	public float calcularAlquiler() {
		return this.PRBASE * this.getEslora()*10;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public int getAnioFab() {
		return anioFab;
	}

	public void setAnioFab(int anioFab) {
		this.anioFab = anioFab;
	}

	public float getValAlquiler() {
		return valAlquiler;
	}

	public void setValAlquiler(float valAlquiler) {
		this.valAlquiler = valAlquiler;
	}
	
	
	
}
