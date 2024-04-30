package practicaHerencia;

public class Instrumento {
	protected String[] melodia;
	
	// CONSTRUCTORES 
	
	public Instrumento(String[]melodia) {
		this.melodia = melodia;
	}
	public Instrumento () {
		this.melodia = null;
	}
	
	
	// METODO PARA COMPROBAR SI ESTA BIEN LA MELODIA
	public boolean introMelodia(String [] notas) {
		int contador = 0;
		for (int i = 0; i<this.melodia.length; i++) {
			if (this.melodia[i].equals("DO") ||this.melodia[i].equals("RE")||this.melodia[i].equals("MI")||this.melodia[i].equals("FA")||
					this.melodia[i].equals("SOL")||this.melodia[i].equals("LA")||this.melodia[i].equals("SI")) {
				contador++;
			}
		}
		
		if (contador == this.melodia.length) {
			this.melodia = notas;
			return true;
			
		} else {
			return false;
		}
		
	}
	
	// METODO PARA INTERPRETAR LA MELODIA
	public void interpretar () {
		for (int i = 0; i<this.melodia.length; i++) {
			System.out.print(this.melodia[i]+", ");
		}
	}
	
	
	// METODO QUE DEVUELVE LA DURACION DE LA MELODIA
	public int duracion () {
		
		return this.melodia.length;
		
	}
	
	// METODO QUE BUSCA LA NOTA QUE SE PASA POR PARAMETRO EN LA MELODIA
	public int contarNota(String nota) {
		int contador = 0;
		for (int i = 0; i<melodia.length; i++) {
			if (melodia [i].equals(nota)) {
				contador++;
			}
		}
		return contador;
	}
	
	
	
}
