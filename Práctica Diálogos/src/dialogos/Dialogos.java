package dialogos;
import java.util.*;
import javax.swing.JOptionPane;
//		HE COMENTADO LOS TRY/CATCH PORQUE LUEGO DAN 						//
//		PROBLEMAS AL GESTIONAR EXCEPCIONES CON OTRAS CLASES		//
public class Dialogos {
	
	// MÉTODO MENSAJE ERROR //
	
	/**
	 * Este método imprime una ventana con un mensaje de error pasado por parámetro
	 * @param mensaje, (titulo)
	 * @author  Javier Álvarez
	 */
	
	static public void mensajeError (String mensaje) {
		JOptionPane.showMessageDialog (null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);

	}
	
	static public void mensajeError (String mensaje, String titulo) {
		JOptionPane.showMessageDialog (null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

	}
	
	
	// MÉTODO MENSAJE INFO //
	
	/**
	 * Este método muestra un mensaje pasado por parámetro
	 * @param mensaje, (titulo)
	 * @author Javier Álvarez
	 */
	
	static public void mensajeInfo (String mensaje) {
		JOptionPane.showMessageDialog( null, mensaje, "Info",JOptionPane.INFORMATION_MESSAGE);
	}
	static public void mensajeInfo (String mensaje, String titulo) {
		JOptionPane.showMessageDialog( null, mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	// MÉTODO MENSAJE WARNING //
	
	/**
	 * Este método imprime un cuadro de aviso, con un mensaje impreso que se le pasa como parámetro
	 * @param mensaje, (titulo)
	 * @author  Javier Álvarez
	 */
	static public void mensajeWarning(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
	}
	static public void mensajeWarning(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null,mensaje, titulo, JOptionPane.WARNING_MESSAGE);
	}
	
	
	// MÉTODO CONFIRMA DIALOGO //
	/**
	 * Este método es un diálogo que pide 
	 * @param pregunta, (titulo)
	 * @return 0 si se escoge sí, 1 si se escoge no.
	 * @author  Javier Álvarez
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
 *  El método recibe un mensaje que devuelve como excepción si no se cumple que<br> 
 * introducción en el try sea de un numero entero
 * @param mensaje, (titulo)
 * @return Int cuando no haya excepción introducido en el input de diálogo
 * @throws NumberFormatException
 * @author  Javier Álvarez
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
			// MÉTODO PEDIR FLOAT //
	/**
	 * Es un método que pide un flotante, si no se le da un flotante lanza la excepción en otro cuadro de diálogo<br>
	 * y vuelve a llamar a la función para pedir el flotante
	 * @param mensaje, (titulo)
	 * @return float pasado en el input de diálogo (sin excepción)
	 * @throws NumberFormatException
	 * @author Javier Álvarez
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
	
	// MÉTODO PEDIR DOUBLE //
	/**
	 * Es un método que pide un double, si no se le da un double lanza la excepción en otro cuadro de diálogo<br>
	 * y vuelve a llamar a la función para pedir el double
	 * @param mensaje, (titulo)
	 * @return	double pasado en el input de diálogo (sin excepción)
	 * @throws NumberFormatException
	 * @author Javier Álvarez
	 */
	static public double pedirDouble (String mensaje, String titulo)  {
		String  num;
	
			num = JOptionPane.showInputDialog(null, mensaje, titulo);
			double numV = Double.parseDouble(num);
			return numV;
	}
	static public double pedirDouble (String mensaje)  {
		String  num;
			num = JOptionPane.showInputDialog(null, mensaje, "INTRODUCIR NÚMERO (DOUBLE)");
			double numV = Double.parseDouble(num);
			return numV;
		
	}
	
	// METODO PEDIR OPCION //
	/**
	 * Es un método que pide el mensaje primero, y el array de Strings de opciones (como parámetros) y entonces muestra ese mensaje
	 * @param mensaje, opciones, (titulo)
	 * @return numero (opcion)
	 * @author Javier Álvarez
	 */
	static public int pedirOpcion (String mensaje, String titulo,String[] opciones) {
		int num;
		num = JOptionPane.showOptionDialog(null, mensaje, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		return num;
		
	}
	static public int pedirOpcion (String mensaje, String[] opciones) {
		int num;
		num = JOptionPane.showOptionDialog(null, mensaje, "ESCOGER OPCIÓN", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		return num;
		
	}
	
	// METODO PEDIR CADENA //
		/**
		 * Pide un string y lo devuelve
		 * @param mensaje, (titulo)
		 * @return vuelta (String introducido)
		 * @author Javier Álvarez
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
