package kyu8;

public class Maps {

	public static int[] map(int[] arr) {
		 int [] arr2 = new int [arr.length];
		    for (int i = 0; i<arr.length; i++) {
		    	arr2 [i] = 2 * (arr[i]);
		    }
		    return arr2;
		    		
	}
}
