package ventanas;

import javax.swing.JOptionPane;

public class PedidoComida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] pedido = {"Pizza", "Hamburguesa", "Brocoli", "Calabacin a la plancha"};
		
		JOptionPane.showOptionDialog(null, "¿Qué quieres comer?", "Pedido comida", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, pedido, pedido[0]);
	}

}
