package pruea;

import javax.swing.JOptionPane;

public class PRUEBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Escribe tu nombre","Chincheto77" );
		JOptionPane.showMessageDialog (null,"Que pasa "+name+"?", "Folagor.jpg", JOptionPane.QUESTION_MESSAGE);
		
		int input = JOptionPane.showConfirmDialog(null, name+ " Estas siendo terriblemente pirateado?");
		switch (input) {
		case 0:
			JOptionPane.showMessageDialog(null, "desenchufa el router");
			name = JOptionPane.showInputDialog(null, "Dile a tu madre que me la chupe de paso", "Por favor y gracias");
			while (name.length()<=10) {
				JOptionPane.showMessageDialog (null, "Esfuerzate un poco bro, un respeto a tu padre");
				name = JOptionPane.showInputDialog(null, "Dile a tu madre que me la chupe de paso");
				
			} JOptionPane.showMessageDialog(null, "Mucho texto bro, no te bloqueo porque no vuelvo a ver \na tu madre pero cortate un poquito pe pe pelele");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Eso es lo que tu te crees, preparame \nunas tostadas y luego hablamos");
		case 2:
			JOptionPane.showMessageDialog(null, "TE CREES QUE TE VAS A LIBRAR TAN FACIL");
			String col = JOptionPane.showInputDialog(null, "Estas tomandome por tonto?");
			if (col.toLowerCase().equals("no")) {
				JOptionPane.showMessageDialog (null, null,"ERROR", JOptionPane.ERROR_MESSAGE);
			}else if (col.toLowerCase().equals("si") || col.toLowerCase().equals("sí")) {
				String [] morir = {"Ahogarse en esmegma", "Arrancarse la polla a mordiscos", "Meter los huevos en la licuadora", "Atragantarse con un dildo de 35 cm"};
				JOptionPane.showOptionDialog(null, "Escoge tu manera de morir", "No va a coñas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, morir, morir[0]);
			}
		}
	}

}
