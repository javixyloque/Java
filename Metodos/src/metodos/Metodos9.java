package metodos;

public class Metodos9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		if (num1 >num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;	
		}
		muestra (num1, num2);
	}
	public static void muestra(int num1, int num2) {
		for (int i=num1;i<=num2; i++) {
			 System.out.println(i);
		}
	}
}
