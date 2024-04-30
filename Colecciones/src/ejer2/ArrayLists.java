package ejer2;

import java.util.*;

public class ArrayLists {
	public static void main(String[] args) {
		
		String hola  = "hola buenas";
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Soy joselu");
		arr1.add("Vilma abreme la puerta");
		ArrayList<String>arr2 = (ArrayList<String>)arr1.clone();
		arr1.remove(0);
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
	}
	
	
}
