package dialogos;
import java.util.*;
import javax.swing.JOptionPane;
//		HE COMENTADO LOS TRY/CATCH PORQUE LUEGO DAN 						//
//		PROBLEMAS AL GESTIONAR EXCEPCIONES CON OTRAS CLASES		//
public class Dialogos {
	
	// M�TODO MENSAJE ERROR //
	
	/**
	 * Este m�todo imprime una ventana con un mensaje de error pasado por par�metro
	 * @param mensaje, (titulo)
	 * @author  Javier �lvarez
	 */
	
	static public void mensajeError (String mensaje) {
		JOptionPane.showMessageDialog (null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);

	}
	
	static public void mensajeError (String mensaje, String titulo) {
		JOptionPane.showMessageDialog (null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

	}
	
	
	// M�TODO MENSAJE INFO //
	
	/**
	 * Este m�todo muestra un mensaje pasado por par�metro
	 * @param mensaje, (titulo)
	 * @author Javier �lvarez
	 */
	
	static public void mensajeInfo (String mensaje) {
		JOptionPane.showMessageDialog( null, mensaje, "Info",JOptionPane.INFORMATION_MESSAGE);
	}
	static public void mensajeInfo (String mensaje, String titulo) {
		JOptionPane.showMessageDialog( null, mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	// M�TODO MENSAJE WARNING //
	
	/**
	 * Este m�todo imprime un cuadro de aviso, con un mensaje impreso que se le pasa como par�metro
	 * @param mensaje, (titulo)
	 * @author  Javier �lvarez
	 */
	static public void mensajeWarning(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
	}
	static public void mensajeWarning(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null,mensaje, titulo, JOptionPane.WARNING_MESSAGE);
	}
	
	
	// M�TODO CONFIRMA DIALOGO //
	/**
	 * Este m�todo es un di�logo que pide 
	 * @param pregunta, (titulo)
	 * @return 0 si se escoge s�, 1 si se escoge no.
	 * @author  Javier �lvarez
	 */
	static public int confirmaDialogo(String pregunta, String titulo) {
		int respuesta;
		respuesta = JOptionPane.showConfirmDialog(null, pregunta, titulo, JOptionPane.YES_NO_OPTION);
		return respuesta;
	}
	static public int confirmaDialogo(String pregunta) {
		int respuesta;
		respuesta = JOptionPane.showConfirmDialog(null, pregunta, "CONFIRMACION", JOptionPane.YES_NO_OPTION);
		return respuesta;
	}
	
		// METODO PEDIR ENTERO //
/**
 *  El m�todo recibe un mensaje que devuelve como excepci�n si no se cumple que<br> 
 * introducci�n en el try sea de un numero entero
 * @param mensaje, (titulo)
 * @return Int cuando no haya excepci�n introducido en el input de di�logo
 * @throws NumberFormatException
 * @author  Javier �lvarez
 */
	static public int pedirEntero (String mensaje, String titulo) {
		String  num;
			num = JOptionPane.showInputDialog(null, mensaje, titulo);
			int numV = Integer.parseInt(num);
			return numV;
	}
	
	static public int pedirEntero (String mensaje) {
		String  num;
		num = JOptionPane.showInputDialog(null, mensaje);
		int numV = Integer.parseInt(num);
		return numV;
	}
			// M�TODO PEDIR FLOAT //
	/**
	 * Es un m�todo que pide un flotante, si no se le da un flotante lanza la excepci�n en otro cuadro de di�logo<br>
	 * y vuelve a llamar a la funci�n para pedir el flotante
	 * @param mensaje, (titulo)
	 * @return float pasado en el input de di�logo (sin excepci�n)
	 * @throws NumberFormatException
	 * @author Javier �lvarez
	 */
	static public float pedirFloat (String mensaje)  {
		String  num;
			num = JOptionPane.showInputDialog(null, mensaje, "ESCRIBIR NUMERO (FLOAT)");
			float numV = Float.parseFloat(num);
			return numV;
		
	}
	static public float pedirFloat (String mensaje, String titulo)  {
		String  num;
			num = JOptionPane.showInputDialog(null, mensaje, titulo);
			float numV = Float.parseFloat(num);
			return numV;
		
	}
	
	// M�TODO PEDIR DOUBLE //
	/**
	 * Es un m�todo que pide un double, si no se le da un double lanza la excepci�n en otro cuadro de di�logo<br>
	 * y vuelve a llamar a la funci�n para pedir el double
	 * @param mensaje, (titulo)
	 * @return	double pasado en el input de di�logo (sin excepci�n)
	 * @throws NumberFormatException
	 * @author Javier �lvarez
	 */
	static public double pedirDouble (String mensaje, String titulo)  {
		String  num;
	
			num = JOptionPane.showInputDialog(null, mensaje, titulo);
			double numV = Double.parseDouble(num);
			return numV;
	}
	static public double pedirDouble (String mensaje)  {
		String  num;
			num = JOptionPane.showInputDialog(null, mensaje, "INTRODUCIR N�MERO (DOUBLE)");
			double numV = Double.parseDouble(num);
			return numV;
		
	}
	
	// METODO PEDIR OPCION //
	/**
	 * Es un m�todo que pide el mensaje primero, y el array de Strings de opciones (como par�metros) y entonces muestra ese mensaje
	 * @param mensaje, opciones, (titulo)
	 * @return numero (opcion)
	 * @author Javier �lvarez
	 */
	static public int pedirOpcion (String mensaje, String titulo,String[] opciones) {
		int num;
		num = JOptionPane.showOptionDialog(null, mensaje, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		return num;
		
	}
	static public int pedirOpcion (String mensaje, String[] opciones) {
		int num;
		num = JOptionPane.showOptionDialog(null, mensaje, "ESCOGER OPCI�N", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		return num;
		
	}
	
	// METODO PEDIR CADENA //
		/**
		 * Pide un string y lo devuelve
		 * @param mensaje, (titulo)
		 * @return vuelta (String introducido)
		 * @author Javier �lvarez
		 */
	static public String pedirCadena(String mensaje) {
		String vuelta;
		vuelta = JOptionPane.showInputDialog(mensaje, "Introducir datos");
		return vuelta;
	}
	static public String pedirCadena(String mensaje, String titulo) {
		String vuelta;
		vuelta = JOptionPane.showInputDialog(mensaje, titulo);
		return vuelta;
	}
}
