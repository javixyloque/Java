package entregaEntornos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
	private Vista frame;
	
	
	public Controlador(Vista frame) {
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String codArt = frame.getCodArtTxt().getText();
		Articulo art = new Articulo(frame.getCodArtTxt().getText());
		
		frame.getNombreMostrar().setText(art.getNomArt());
		frame.getPrecioMostrar().setText(String.valueOf(art.getPrecio()));
		frame.getNomFabMostrar().setText(art.getNomFab());
	}
	
}
