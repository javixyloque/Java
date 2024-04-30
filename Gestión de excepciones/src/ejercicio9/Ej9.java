package ejercicio9;
import javax.swing.*;

import dialogos.Dialogos;

import java.util.*;
public class Ej9 {
	public static void main(String[] args) {
		int num1= 0;
		boolean continuar =true;
		
		try {
				while (continuar==true) {
				String num =JOptionPane.showInputDialog("Suma de números hasta que pongas una letra", null);
				int numV = Integer.parseInt(num);
				num1+=numV;
				}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "La suma de los números es "+num1);
		}
		
		
	}
	
}
