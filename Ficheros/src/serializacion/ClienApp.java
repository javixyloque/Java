package serializacion;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dialogos.Dialogos;

public class ClienApp {

	public static void main(String[] args) {
		String [] opciones = {"Nuevo cliente", "Listar clientes", "Salir"};		
		int opcion;
		opcion=Dialogos.pedirOpcion("Elige accion", "ClienApp", opciones);
		while (opcion!=2) {			
			switch (opcion) {
				case 0:
					guardaCliente(); break;
				case 1:
					listarClientes(); break;
				default:
					Dialogos.mensajeInfo("Fin del programa","ClienApp");break;				
			}
			opcion=Dialogos.pedirOpcion("Elige accion", "ClienApp", opciones);
		}
	}

	public static void guardaCliente() {
		Cliente cl=new Cliente();
//		Dialogos.mensajeInfo(cl.toString(),"ClienApp");		
		try {
			File fdatos=new File("clientes.dat");		
			FileOutputStream fich;
			System.out.println(fdatos.exists());
			//Guardamos el objeto cliente en el fichero la primera vez que abrimos el fichero
			if (fdatos.exists()==false) {		
				// EL FILEOUTPUT CREA EL ARCHIVO, EL FILE NO //
				fich=new FileOutputStream(fdatos);
				ObjectOutputStream fichIni=new ObjectOutputStream(fich);
				fichIni.writeObject(cl);
				fichIni.close();
			}
			//Guardamos el objeto cliente en el fichero, si ya existe el fichero
			else {	
				fich=new FileOutputStream("clientes.dat",true);
				MiObjectOutputStream fichero=new MiObjectOutputStream(fich);
				fichero.writeObject(cl);			
				fichero.close();
			}
		}		
		catch(FileNotFoundException e) {
			Dialogos.mensajeWarning("El fichero no existe", "ClienApp");
		}
		catch(IOException e) {
			Dialogos.mensajeError("Error de E/S", "ClienApp");
		}
	}
	
	public static void listarClientes() {
		//Leemos del fichero los objetos	
		Cliente cl=null;
		try {
			FileInputStream fich=new FileInputStream("clientes.dat");
			ObjectInputStream fichero=new ObjectInputStream(fich);				
			cl=(Cliente)fichero.readObject();
			while(cl!=null) {					
				Dialogos.mensajeInfo(cl.toString(),"ClienApp");
				cl=(Cliente)fichero.readObject();					
			}					
			fichero.close();			
		}	
		catch(EOFException e) {
			Dialogos.mensajeWarning("No hay más clientes", "ClienApp");
		}	
		catch(FileNotFoundException e) {
			Dialogos.mensajeWarning("El fichero no existe", "ClienApp");
		}
		catch (ClassNotFoundException e) {			
			Dialogos.mensajeWarning("La clase no se encuentra", "ClienApp");
		}
		catch(IOException e) {
			Dialogos.mensajeError("Error de E/S", "ClienApp");
		} 

	}

}
