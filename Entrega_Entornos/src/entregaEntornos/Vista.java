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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private  Controlador control;
	private JTextField codArtTxt;
	

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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 141, 0, 141, 141, 0};
		gbl_panel.rowHeights = new int[]{50, 50, 0, 50, 50, 50, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel codArtLbl = new JLabel("Codigo Articulo ");
		GridBagConstraints gbc_codArtLbl = new GridBagConstraints();
		gbc_codArtLbl.fill = GridBagConstraints.BOTH;
		gbc_codArtLbl.insets = new Insets(0, 0, 5, 5);
		gbc_codArtLbl.gridx = 1;
		gbc_codArtLbl.gridy = 0;
		panel.add(codArtLbl, gbc_codArtLbl);
		setCodArtTxt(new JTextField());
		GridBagConstraints gbc_codArtTxt = new GridBagConstraints();
		gbc_codArtTxt.fill = GridBagConstraints.BOTH;
		gbc_codArtTxt.insets = new Insets(0, 0, 5, 5);
		gbc_codArtTxt.gridx = 3;
		gbc_codArtTxt.gridy = 0;
		panel.add(codArtTxt, gbc_codArtTxt);
		
		JLabel nombreLbl = new JLabel("Nombre: ");
		GridBagConstraints gbc_nombreLbl = new GridBagConstraints();
		gbc_nombreLbl.fill = GridBagConstraints.BOTH;
		gbc_nombreLbl.insets = new Insets(0, 0, 5, 5);
		gbc_nombreLbl.gridx = 1;
		gbc_nombreLbl.gridy = 1;
		panel.add(nombreLbl, gbc_nombreLbl);
		
		nombreMostrar = new JLabel("");
		GridBagConstraints gbc_nombreMostrar = new GridBagConstraints();
		gbc_nombreMostrar.fill = GridBagConstraints.BOTH;
		gbc_nombreMostrar.insets = new Insets(0, 0, 5, 5);
		gbc_nombreMostrar.gridx = 3;
		gbc_nombreMostrar.gridy = 1;
		panel.add(nombreMostrar, gbc_nombreMostrar);
		JLabel precioLbl = new JLabel("Precio: ");
		GridBagConstraints gbc_precioLbl = new GridBagConstraints();
		gbc_precioLbl.fill = GridBagConstraints.BOTH;
		gbc_precioLbl.insets = new Insets(0, 0, 5, 5);
		gbc_precioLbl.gridx = 1;
		gbc_precioLbl.gridy = 2;
		panel.add(precioLbl, gbc_precioLbl);
		precioMostrar = new JLabel("");
		GridBagConstraints gbc_precioMostrar = new GridBagConstraints();
		gbc_precioMostrar.fill = GridBagConstraints.BOTH;
		gbc_precioMostrar.insets = new Insets(0, 0, 5, 5);
		gbc_precioMostrar.gridx = 3;
		gbc_precioMostrar.gridy = 2;
		panel.add(precioMostrar, gbc_precioMostrar);
		JLabel nomFabLbl = new JLabel("Nombre fabricante:");
		GridBagConstraints gbc_nomFabLbl = new GridBagConstraints();
		gbc_nomFabLbl.fill = GridBagConstraints.BOTH;
		gbc_nomFabLbl.insets = new Insets(0, 0, 5, 5);
		gbc_nomFabLbl.gridx = 1;
		gbc_nomFabLbl.gridy = 3;
		panel.add(nomFabLbl, gbc_nomFabLbl);
		nomFabMostrar = new JLabel("");
		GridBagConstraints gbc_nomFabMostrar = new GridBagConstraints();
		gbc_nomFabMostrar.fill = GridBagConstraints.BOTH;
		gbc_nomFabMostrar.insets = new Insets(0, 0, 5, 5);
		gbc_nomFabMostrar.gridx = 3;
		gbc_nomFabMostrar.gridy = 3;
		panel.add(nomFabMostrar, gbc_nomFabMostrar);
		buscarBtn = new JButton("Buscar");
		GridBagConstraints gbc_buscarBtn = new GridBagConstraints();
		gbc_buscarBtn.fill = GridBagConstraints.BOTH;
		gbc_buscarBtn.gridx = 4;
		gbc_buscarBtn.gridy = 5;
		panel.add(buscarBtn, gbc_buscarBtn);
		
		
		
		
		buscarBtn.addActionListener(control);
	}
	

	
	// GETTERS Y SETTERS VARIOS PARA NO TENER PROBLEMAS CON EL CONTROLADOR //
	public JTextField getCodArtTxt() {
		return codArtTxt;
	}

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

