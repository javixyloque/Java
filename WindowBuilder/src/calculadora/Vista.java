package calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField num2Txt;
	public JLabel resultadoLbl;
	private  Controlador control;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		JPanel panelPedir = new JPanel();
		contentPane.add(panelPedir, BorderLayout.NORTH);
		panelPedir.setLayout(new BorderLayout(0, 0));
		
		JTextField num1Txt = new JTextField();
		num1Txt.setHorizontalAlignment(SwingConstants.CENTER);
		panelPedir.add(num1Txt, BorderLayout.NORTH);
		num1Txt.setColumns(10);
		
		num2Txt = new JTextField();
		panelPedir.add(num2Txt, BorderLayout.SOUTH);
		num2Txt.setColumns(10);
		
		JPanel panelResultado = new JPanel();
		contentPane.add(panelResultado, BorderLayout.CENTER);
		
		resultadoLbl = new JLabel("RESULTADO");
		panelResultado.add(resultadoLbl);
		
		JButton sumarBtn = new JButton("SUMA");
		sumarBtn.setActionCommand("1");
		panelBotones.add(sumarBtn);
		
		JButton restarBtn = new JButton("RESTA");
		panelBotones.add(restarBtn);
		restarBtn.setActionCommand("2");
		
		restarBtn.addActionListener(control);
		
		sumarBtn.addActionListener(control);
		
	}

}
