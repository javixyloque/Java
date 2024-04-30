package metodos;

public class Metodos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i= 11;
		j=5;
		divisor (i, j);
	}
	static void divisor(double num1, int divisor) {
		double i = (float) num1 / divisor;
		int j = (int) (num1 / divisor);
		if ( i == j ) {
			System.out.println("Son divisibles y el resultado es: "+j);
		} else {
			System.out.println(divisor+" no es divisor de "+num1);
		}
		
		/*con el %*/
		
	}
}
