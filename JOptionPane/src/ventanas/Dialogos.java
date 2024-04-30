package ventanas;
import javax.swing.*;

public class Dialogos {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Escribe 0 para continuar" );
		int input1 = Integer.valueOf(input);
		System.out.println(input1);
		if (input1==0) {
			JOptionPane.showInputDialog(null, "Dime tu nombre", "Nombre vacio",JOptionPane.ERROR_MESSAGE );
		} else {
			JOptionPane.showMessageDialog(null, "Bien hecho");
		}
		
	}
}
