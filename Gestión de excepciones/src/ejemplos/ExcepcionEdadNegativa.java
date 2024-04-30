package ejemplos;

public class ExcepcionEdadNegativa extends Exception {
	
	
	public void mensaje () {
		System.out.println("No se puede insertar una edad negativa");
	}
}
