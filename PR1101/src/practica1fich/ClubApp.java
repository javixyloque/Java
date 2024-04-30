package practica1fich;

import java.io.*;

import dialogos.Dialogos;

public class ClubApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] opciones = {"Registrar cliente", "Listar clientes", "Salir"};
		int choice;
		choice = Dialogos.pedirOpcion("Escoja su primera opción", "Registro y listado de socios", opciones);
		while (choice!=-1) {
			System.out.println(choice);
			switch(choice){
				case 0:
					registrar();
					break;
				case 1:
					listar();
					break;
				case 2:
					Dialogos.mensajeWarning("Gracias por usar el servicio de registro de socios :)", "FIN DEL PROGRAMA");
					System.exit(0);
			}
			choice = Dialogos.pedirOpcion("Escoja su siguiente opción", "Registro y listado de socios", opciones);
		}
	}
	
	//	METODO PARA REGISTRAR UN SOCIO Y GUARDARLO EN SOCIOS.DAT	//
	public static void registrar() {
		Socio s = new Socio();
		
		try {
			File archivo = new File ("socios.dat");
			if (archivo.exists()== false) {
				ObjectOutputStream edit = new ObjectOutputStream (new FileOutputStream(archivo)); 
				edit.writeObject(s);
				edit.close();
		} else {
				MiObjectOutputStream edit2 = new MiObjectOutputStream (new FileOutputStream(archivo, true));
				edit2.writeObject(s);
				edit2.close();
			}
		} catch (FileNotFoundException e) {
			Dialogos.mensajeWarning("El fichero no existe");
		} catch(IOException ex) {
			Dialogos.mensajeError("Ha ocurrido un error, pruebe de nuevo");
		}
	}
	
	
	public static void listar()  {
		String lista="";
		try {
			Socio s;
			ObjectInputStream salida = new ObjectInputStream (new FileInputStream("socios.dat"));
			s = (Socio) salida.readObject();
			while (s!=null) {
				lista += s.mostrarDatos();
				s = (Socio) salida.readObject();	
			}
			salida.close();
		} catch (ClassNotFoundException cne) {
			Dialogos.mensajeWarning("La clase no existe");
		} catch(EOFException e) {
			Dialogos.mensajeInfo(lista, "LISTADO DE SOCIOS");
		}catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
