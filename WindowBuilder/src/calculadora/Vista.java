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

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField num1Txt;
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
		
		num1Txt = new JTextField();
		panelPedir.add(num1Txt);
		num1Txt.setColumns(10);
		
		num2Txt = new JTextField();
		panelPedir.add(num2Txt);
		num2Txt.setColumns(10);
		
		JPanel panelResultado = new JPanel();
		contentPane.add(panelResultado, BorderLayout.CENTER);
		
		resultadoLbl = new JLabel("RESULTADO");
		panelResultado.add(resultadoLbl);
		
		JButton sumarBtn = new JButton("SUMA");
		sumarBtn.setActionCommand("sumar");
		panelBotones.add(sumarBtn);
		
		JButton restarBtn = new JButton("RESTA");
		panelBotones.add(restarBtn);
		restarBtn.setActionCommand("restar");
		
		restarBtn.addActionListener(control);
		
		sumarBtn.addActionListener(control);
		
	}

}
