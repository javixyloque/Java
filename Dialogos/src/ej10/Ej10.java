package ej10;
import dialogos.Dialogos;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Ej10 {
	public static void main(String[] args) {
		
		int num, sum = 0;
		boolean continuar = false;
		do {
			try {
				num = Dialogos.pedirEntero("Inserta un número, si quieres terminar inserta una letra para obtener la suma de todos");
				sum +=num;
				continuar = true;
				
			} catch (NumberFormatException e) {
				Dialogos.mensajeInfo("La suma de los números insertados hasta ahora es: "+sum);
				continuar = false;
			}
		} while (continuar);
		
	}
}
