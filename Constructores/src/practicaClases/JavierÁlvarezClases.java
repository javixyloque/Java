package practicaClases;

public class JavierÁlvarezClases {

	public static void main(String[] args) {
		
		
		// Declaración cuenta corriente //
		
		CuentaCorriente cuenta1 = new CuentaCorriente("71654739P","Josines");
		
		// Llamada al método que ingresa dinero //
		
		cuenta1.ingresarDinero(280);
		
		
		// Condicional que comprueba si se puede retirar que directamente hace la operacion //
		
		if (cuenta1.sacarDinero(260)) {
			System.out.println("Operación finalizada exitosamente");
		} else {
			System.out.println("No existe dinero suficiente");
		};
			
		// Set para el interés //
		
		cuenta1.setInteres(3.2);
		
		cuenta1.mostrarDatos();
		
		// Set para el teléfono (creación de un gestor) //
		
		cuenta1.setTelefono(123238943);
		
		// Declaración del gestor //
		
		Gestor gestor = new Gestor(cuenta1.getNombre(), cuenta1.getTelefono());
		gestor.visualizarDatos();
		
		
		
		
	}

}
