package entregaEntornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private  Controlador control;
	private JTextField codArtTxt;
	public JTextField getCodArtTxt() {
		return codArtTxt;
	}

	private JLabel nombreMostrar, precioMostrar, nomFabMostrar ;
	

	private JButton buscarBtn; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		control = new Controlador(this);
		JPanel panel = new JPanel();
		
		JLabel codArtLbl = new JLabel("Codigo Articulo ");
		setCodArtTxt(new JTextField("Nº ARTICULO"));
		
		JLabel nombreLbl = new JLabel("Nombre: ");
		JLabel precioLbl = new JLabel("Precio: ");
		JLabel nomFabLbl = new JLabel("Nombre fabricante:");
		
		nombreMostrar = new JLabel("");
		precioMostrar = new JLabel("");
		nomFabMostrar = new JLabel("");
		buscarBtn = new JButton("Buscar");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		codArtLbl.setBounds(10, 11, 96, 39);
		panel.add(codArtLbl);
		codArtTxt.setBounds(111, 20, 86, 20);
		panel.add(codArtTxt);
		nombreLbl.setBounds(10, 82, 96, 14);
		panel.add(nombreLbl);
		precioLbl.setBounds(10, 131, 96, 14);
		panel.add(precioLbl);
		nomFabLbl.setBounds(10, 182, 96, 14);
		panel.add(nomFabLbl);
		
		nombreMostrar.setBounds(111, 82, 96, 14);
		panel.add(nombreMostrar);
		precioMostrar.setBounds(111, 131, 96, 14);
		panel.add(precioMostrar);
		nomFabMostrar.setBounds(111, 182, 96, 14);
		panel.add(nomFabMostrar);
		
		buscarBtn.setBounds(325, 217, 89, 23);
		panel.add(buscarBtn);
		
		
		
		
		buscarBtn.addActionListener(control);
	}
	

	
	// GETTERS Y SETTERS VARIOS PARA NO TENER PROBLEMAS CON EL CONTROLADOR //
//	public JTextField getCodArtTxt() {
//		return codArtTxt;
//	}

	public void setCodArtTxt(JTextField codArtTxt) {
		this.codArtTxt = codArtTxt;
	}
	public JLabel getNombreMostrar() {
		return nombreMostrar;
	}

	public void setNombreMostrar(JLabel nombreMostrar) {
		this.nombreMostrar = nombreMostrar;
	}

	public JLabel getPrecioMostrar() {
		return precioMostrar;
	}

	public void setPrecioMostrar(JLabel precioMostrar) {
		this.precioMostrar = precioMostrar;
	}

	public JLabel getNomFabMostrar() {
		return nomFabMostrar;
	}

	public void setNomFabMostrar(JLabel nomFabMostrar) {
		this.nomFabMostrar = nomFabMostrar;
	}
}

