package kyu8;

public class Collinearity {
	public static boolean collinearity(int x1, int y1, int x2, int y2) {
		if (x1*y1 == x2*y2) {
			return true;
		}
		else {
			return false;
		}
	}
}
