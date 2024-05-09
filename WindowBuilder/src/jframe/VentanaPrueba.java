package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class VentanaPrueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private static JTextField nombreTxt ;
	private JPanel nombrePanel;
	private JPanel idPanel;
	private JLabel lblIdentificador;
	private static JTextField identificadorTxt;
	private JPanel fechaPanel;
	private JLabel lblFecha;
	private  static JTextField fechaTxt;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrueba frame = new VentanaPrueba();
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
	public VentanaPrueba() {
		Color negro = new Color(0,0,0);
		LineBorder linea = new LineBorder(negro, 3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(128, 64, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		nombrePanel = new JPanel();
		nombrePanel.setBorder(UIManager.getBorder("PopupMenu.border"));
		nombrePanel.setBounds(0, 41, 207, 36);
		panel.add(nombrePanel);
		nombrePanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nombrePanel.add(lblNewLabel);
		
		nombreTxt = new JTextField();
		nombrePanel.add(nombreTxt);
		
		nombreTxt.setColumns(10);
		
		idPanel = new JPanel();
		idPanel.setBorder(UIManager.getBorder("PopupMenu.border"));
		idPanel.setBounds(0, 88, 207, 36);
		panel.add(idPanel);
		
		lblIdentificador = new JLabel("Identificador:");
		idPanel.add(lblIdentificador);
		
		identificadorTxt = new JTextField();
		identificadorTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		identificadorTxt.setColumns(10);
		idPanel.add(identificadorTxt);
		
		fechaPanel = new JPanel();
		fechaPanel.setBorder(UIManager.getBorder("PopupMenu.border"));
		fechaPanel.setBounds(0, 135, 207, 36);
		panel.add(fechaPanel);
		
		lblFecha = new JLabel("Fecha: ");
		fechaPanel.add(lblFecha);
		
		fechaTxt = new JTextField();
		fechaTxt.setColumns(10);
		fechaPanel.add(fechaTxt);
		
		lblNewLabel_1 = new JLabel("OESTE");
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		lblNewLabel_3 = new JLabel("NORTE");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, BorderLayout.NORTH);
		
		lblNewLabel_4 = new JLabel("ESTE");
		contentPane.add(lblNewLabel_4, BorderLayout.EAST);
		mostrarTexto();
		
		JButton botonCambio = new JButton("CAMBIAR");
		botonCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarTexto();
				
			}
		});
		contentPane.add(botonCambio, BorderLayout.SOUTH);
	}
		
		public static void cambiarTexto() {
			String aux = nombreTxt.getText();
			System.out.println(aux);
			nombreTxt.setText(null);
			identificadorTxt.setText(null);
			fechaTxt.setText(null);
		}
		
	
	
	
	public static void mostrarTexto () {
		nombreTxt.setText("Javi");
		identificadorTxt.setText("1350843275");
		fechaTxt.setText("12/12/2012");
	}
}
