package kyu7;

public class Sum {
	public int GetSum (int a, int b) {
		int suma = 0;
		if (a == b) {
			return a;
		} else if (a>b) {
		
			for (int i = b; i<=a; i++) {
				suma+= i;
			}
			return suma;	
		}else {
			for (int i = a; i<=b; i++) {
				suma+= i;
			}
			return suma;
		}
	}
}

