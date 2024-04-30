package kyu8;

public class Solution {
	public static String doubleChar (String s) {
		char[]c = new char [s.length()*2];
		int contador  = 0;
		char temp;
		for (int i = 0; i<s.length(); i++) {
			temp = s.charAt(i);
			c[contador] = temp;
			c[contador + 1] = temp;
			contador+=2;
		}
	
		return String.valueOf(c);
	}
}
