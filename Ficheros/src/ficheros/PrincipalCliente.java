package ficheros;

import dialogos.Dialogos;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// AÑADIR CLIENTES (CUANTOS CLIENTES) //
				//	LEER CLIENTE	//
				//GUARDAR EN OBJETO//
				//eSCRIBIR EN FICHERO //
				//	MOSTRAR DATOS CLIENTES JOPTIONPANE
		Dialogos.mensajeInfo("Bienvenido al servicio de registro de clientes", "BIENVENIDO");
		Dialogos.pedirEntero("Introduce el número de clientes que quieres registrar");
	}

}
