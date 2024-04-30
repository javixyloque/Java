package practicaHerencia;

public class Piano extends Instrumento {
	String [] melodiaIzda;
	
	
	// CONSTRUCTORES //
	public Piano(String[] melodia) {
		super(melodia);
		this.melodiaIzda = null;
	}
	
	public Piano(String[] melodia, String []melodiaIzda) {
		super(melodia);
		this.melodiaIzda = melodiaIzda;
	}
	public Piano () {
		super();
		this.melodiaIzda = null;
	}
	
	
	// METODO INTERPRETAR QUE REUTILIZA EL DE LA SUPERCLASE //
	public void interpretar () {
		super.interpretar();
		System.out.println("\nMANO IZQUIERDA: ");
		for (int i = 0; i<this.melodiaIzda.length; i++) {
			System.out.print(this.melodiaIzda[i]+", ");
		}
	}
	
	// METODO PARA CONTAR LA NOTA DADA EN LAS DOS MANOS //
	public int contarNotaDosManos (String nota) {
		int contador = 0;
		for (int i = 0; i<this.melodia.length; i++) {
			if (melodia [i].equals(nota)) {
				contador++;
			}
		}
		for (int i = 0; i<this.melodia.length; i++) {
			if (melodia [i].equals(nota)) {
				contador++;
			}
		}
		return contador;
	}
	
	public boolean introMelodia(String [] notas, String notasIzda[]) {
		int contador = 0;
		for (int i = 0; i<this.melodia.length; i++) {
			if (this.melodia[i].equals("DO") ||this.melodia[i].equals("RE")||this.melodia[i].equals("MI")||this.melodia[i].equals("FA")||
					this.melodia[i].equals("SOL")||this.melodia[i].equals("LA")||this.melodia[i].equals("SI")) {
				contador++;
			}
		}
		for (int i = 0; i<this.melodiaIzda.length; i++) {
			if (this.melodiaIzda[i].equals("DO") ||this.melodiaIzda[i].equals("RE")||this.melodiaIzda[i].equals("MI")||this.melodiaIzda[i].equals("FA")||
					this.melodiaIzda[i].equals("SOL")||this.melodiaIzda[i].equals("LA")||this.melodiaIzda[i].equals("SI")) {
				contador++;
			}
		}
		
		if (contador == this.melodia.length+this.melodiaIzda.length) {
			this.melodia = notas;
			this.melodiaIzda = notasIzda;
			return true;
			
		} else {
			return false;
		}
		
	}
	
	// METODO PARA OBTENER LA DURACION DE LA MANO IZQUIERDA
	public int duracIzda () {
		return this.melodiaIzda.length;
	}
	
	// METODO PARA OBTENER LA MELODIA DE LA IZQUIERDA
	public String[] getMelodiaIzda() {
		return melodiaIzda;
	}

	public void setMelodiaIzda(String[] melodiaIzda) {
		this.melodiaIzda = melodiaIzda;
	}
	

}
