package ejerClientes;

import java.io.*;

import dialogos.Dialogos;

public class PrincipalCliente {
	
	public static void main(String[] args) {
				// AÑADIR CLIENTES (CUANTOS CLIENTES) //
				//	LEER CLIENTE	//
				//GUARDAR EN OBJETO//
				//	ESCRIBIR EN FICHERO //
				//	MOSTRAR DATOS CLIENTES JOPTIONPANE
		Dialogos.mensajeInfo("Bienvenido al servicio de registro de clientes", "BIENVENIDO");
		int nClientes = Dialogos.pedirEntero("Introduce el número de clientes que quieres registrar");
		Cliente []clientes = new Cliente[nClientes];
		File archivo = new File("clientes.dat");
		try {
			ObjectOutputStream fichero = new ObjectOutputStream (new FileOutputStream (archivo));
			for (Cliente cli : clientes) {
				cli = new Cliente();
				fichero.writeObject(cli);
			}
			fichero.close();
			
			
			ObjectInputStream mostrar = new ObjectInputStream (new FileInputStream(archivo)); 
			
			Dialogos.mensajeInfo(mostrarDatos(archivo, clientes, mostrar), "Información de los clientes");
			
			mostrar.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException io) {
			io.printStackTrace();
		}
		
	}
	
	// MÉTODO QUE ITERA SOBRE CADA OBJETO Y DEVUELVE UN STRING CON TODOS LOS DATOS //
	
	public static String mostrarDatos (File archivo, Cliente[] clientes,ObjectInputStream mostrar) throws ClassNotFoundException, IOException {
		String info = "";
		for (Cliente cli: clientes) {
			cli = (Cliente)mostrar.readObject();
			// CONCATENAMOS LOS STRINGS DE LA INFORMACION DE LOS CLIENTES	//
			info+= cli.mostrarDatos();
		}
		return info;
	}
	 
	
}
