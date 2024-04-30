package kyu8;

public class PowersOf2 {
	public static void main(String[] args) {
		int n = 4;
		long[] arr = new long [n+1];
		for (int i  =0; i<arr.length; i++) {
			
				arr[i] = (long) Math.pow(2, i);
				System.out.println(arr[i]);
			}
			
		}
		
	}
	

