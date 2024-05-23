package ventanasleer;

public class Palabras {
	String[] palabras = {"pollo", "perro", "mocos", "ostia", "chute"};
	
	public String aleatoria () {
		int aleat = (int) (Math.floor(Math.random()*(palabras.length)));
		return palabras[aleat];
	}
	public String []getPalabras () {
		return palabras;
		
	}
}
