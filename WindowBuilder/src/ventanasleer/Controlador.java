package ventanasleer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
	private Vista frame;
	private Palabras mod;
	public Controlador (Vista ventana, Palabras mod) {
		this.frame = ventana;
		this.mod = mod;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String result = this.mod.aleatoria();
		frame.resultadoLbl.setText(result);
	}

}
