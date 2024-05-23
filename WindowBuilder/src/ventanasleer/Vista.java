package ventanasleer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Palabras palabra = new Palabras();
	private Controlador control; 
	private JLabel resultadoLbl;
	private JButton buscarBtn;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Vista() {
		control = new Controlador(this, palabra);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBtn = new JPanel();
		contentPane.add(panelBtn, BorderLayout.SOUTH);
		
		buscarBtn = new JButton("BUSCAR");
		
		panelBtn.add(buscarBtn);
		
		JPanel panelResultado = new JPanel();
		contentPane.add(panelResultado, BorderLayout.CENTER);
		
		setResultadoLbl(new JLabel("RESULTADO"));
		panelResultado.add(getResultadoLbl());
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		enlazaControl(control);
	}


	public JLabel getResultadoLbl() {
		return resultadoLbl;
	}


	public void setResultadoLbl(JLabel resultadoLbl) {
		this.resultadoLbl = resultadoLbl;
	}

	public void enlazaControl (Controlador controlador) {
		buscarBtn.addActionListener(controlador);
	}
}
