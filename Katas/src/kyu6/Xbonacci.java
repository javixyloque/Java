package kyu6;

public class Xbonacci {
	
	
	public double[] tribonacci (double []s, int n) {
		double [] empty = {};
		double [] arr;
		arr = new double [n];
		if (n==0) {
			return empty;
		}else if(n>0 && n<3) {
			for (int i = 0; i<n; i++) {
				arr[i] = s[i];
			}
			return arr;
		
		} else {
		
			for (int i = 0; i<s.length; i++) {
				arr[i] = s[i];
			}
			
			for (int i = 3; i<n; i++) {
				arr[i] = arr[i-3] + arr [i-2] + arr [i-1];
			}
			
			return arr;
		}
	}
}
