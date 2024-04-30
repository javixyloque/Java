package kyu8;

public class InvertValues {
	
	// Dado un array de números, devuelve el inverso de
	// cada uno. Los positivos se vuelven negativos
	// y viceversa
	public static int[] invert(int[] array) {
		for (int i = 0; i<array.length; i++) {
			int cambio = array [i];
			array[i] = (-cambio);
		}
		return array;
	}
	
}
