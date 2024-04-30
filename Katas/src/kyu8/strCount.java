package kyu8;

public class strCount {

		// TODO Auto-generated method stub
		
		
		int strCount(String str, char letter) {
		    //write code here
		    char [] letras = str.toCharArray();
					     int contador = 0;
					     for (int i = 0; i<letras.length; i++) {
					    	 if (letras[i] == letter) {
					     contador++;
					      }
				}
					     return contador;


	}
}