package dialogos;
import dialogos.Dialogos;
import javax.swing.*;
import java.util.*;
public class Ej9 {
	public static void main(String[] args) {
		int i, num, sum = 0;
		try {
		/*for (i = 0 ; i<5; i++) {
				num = Dialogos.pedirEntero("Introduce un entero para sumar");
				System.out.println("Num: "+num);
				sum +=num;
			}*/
			i = 0;
			do {
				num = Dialogos.pedirEntero("Introduce un entero para sumar");
				i++;
				sum += num;
			} while (i<5 && num !=0);
		} catch (NumberFormatException e) {
			Dialogos.mensajeError("Entrada no válida, apli SUMA");
		} catch (Exception e) {
			Dialogos.mensajeError("Error. Apli SUMA");
			
		}
		
	}
}
