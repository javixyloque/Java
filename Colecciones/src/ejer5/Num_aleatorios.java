package ejer5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Num_aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList();
		for (int i = 0; i<20; i++) {
			numeros.add((int)(Math.random()*20)+1);
		}
		HashSet <Integer> nums = new HashSet();
		for (int i : numeros) {
			nums.add(i);
		}
		
		//		METODO PARA ORDENAR NUMEROS	//
		Comparator<Integer> c = Comparator.naturalOrder();
		numeros.sort(c);
		for (int numero: numeros) {
			if (nums.contains(numeros)) {
				
			}
		
		}
		for(int i : numeros) {
			System.out.println(i);
		}
		System.out.println("*".repeat(60));
		for(int i : nums) {
			System.out.println(i);
		}
		int [] numerosArray;
		int ind = 0;
				
		for (int i: numeros) {
			
		}
		
		
		
		}
		
	

}
