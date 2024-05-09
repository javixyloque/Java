package ejer5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
 //////////////////////////////////////////		REVISAR			////////////////////////////////////////////////
//java.util.ConcurrentModificationException
public class Num_aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList();
		for (int i = 0; i<20; i++) {
			numeros.add((int)(Math.random()*20)+1);
		}
		HashSet <Integer> numsHash = new HashSet();
		for (int i : numeros) {
			numsHash.add(i);
		}
		
		//		METODO PARA ORDENAR NUMEROS	//
		Comparator<Integer> c = Comparator.naturalOrder();
		System.out.println(c);
		HashSet<Integer> repetidos = new HashSet();
		for (int numero: numsHash) {
			if (numeros.contains(numero)) {
				repetidos.add(numero);
				numsHash.remove(numero);
			}
		
		}
		for(int i : numeros) {
			System.out.println(i);
		}
		System.out.println("*".repeat(60));
		System.out.println(numsHash);
		System.out.println(repetidos);
		int [] numerosArray;
		int ind = 0;
				
		for (int i: numeros) {
			
		}
		
		
		
		}
		
	

}
