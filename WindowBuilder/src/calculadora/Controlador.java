package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
	Vista ventana;
	public Controlador(Vista frame) {
		this.ventana = frame;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		
		int result = 0;
		String num1Str = ventana.num1Txt.getText();
		int num1 = Integer.parseInt(num1Str);
		String num2Str = ventana.num2Txt.getText();
		int num2 = Integer.parseInt(num2Str);
			
		
		switch (Integer.parseInt(event.getActionCommand())) {
		case 1:
			result = Modelo.sumar(num1, num2);
			break;
		case 2:
			result = Modelo.restar(num1, num2);
			break;
		}
//		if (event.getActionCommand().equals("sumar")) {
			
//			result = Modelo.sumar(num1, num2);
			
//		} else if (event.getActionCommand().equals("restar")) {
//
//			result = Modelo.restar(num1, num2);
//		}
		
		
		ventana.resultadoLbl.setText(String.valueOf(result));
		
		
	}

}
