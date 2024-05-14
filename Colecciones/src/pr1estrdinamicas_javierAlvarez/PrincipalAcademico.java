package pr1estrdinamicas_javierAlvarez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.Map.Entry;

import dialogos.Dialogos;

public class PrincipalAcademico {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String [] respuestas =  {"Añadir académico", "Crear archivo y listarlos", "Eliminar académico"};
		char letra;
		String nombre; 
		int aIngreso;
		char respuesta;
		HashMap<Character, Academico> mapa = new HashMap<Character, Academico>();
		Boolean continuar = true;
		
		while (continuar) {
		int decis = Dialogos.pedirOpcion("Escoge la opción", "BIENVENIDO", respuestas);
			switch (decis) {
				case 0:
					nombre = Dialogos.pedirCadena("Inserte su nombre");
					aIngreso = Dialogos.pedirEntero("Registre el año de ingreso");
					letra = Dialogos.pedirCadena("Introduzca el sillón que va a ocupar").toLowerCase().charAt(0);
					
					Academico acad = new Academico (nombre, aIngreso);
					nuevoAcademico(mapa, acad, letra);
					break;
				case 1: 
					try {
						mostrarDatos(mapa);
						break;
					}catch(FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException ex) {
						ex.printStackTrace();
					} break;
				case 2: 
					eliminarAcademico(mapa);
					break;
				case -1 :
					System.exit(0);
				
			}
			
		}
		
		
	}
	static void eliminarAcademico (HashMap<Character, Academico> mapa) {
		char letra  = Dialogos.pedirCadena("Introduzca el sillon del academico que quiere eliminar").toLowerCase().charAt(0);
		mapa.forEach((key, value)-> {
			if (key==letra) {
				mapa.remove(key);
			}
		});
	}

	static boolean nuevoAcademico (HashMap<Character, Academico> mapa, Academico acad, char letra) {
			
		
		if ((65<=letra && letra<=90 ) || (97<=letra && letra<=122)) {
			mapa.put(letra, acad);
		}

		
		if (mapa.containsValue(acad)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	static void mostrarDatos(HashMap<Character, Academico> mapa) throws FileNotFoundException, IOException {

		ArrayList<Academico> objetos = new ArrayList();
		
		
		for (Academico a: mapa.values()) {
			objetos.add(a);
		}
		
		objetos.sort((ob1, ob2) -> ob1.compareTo(ob2));
		
		System.out.println(objetos);
		
		System.out.println("Vamos a verlos ordenados por nombre");
		// BUCLE RECORRE OBJETOS	//
		for (Academico a : objetos) {
			mapa.forEach((key, value) -> {
				if (value.equals(a)) {
					System.out.println("Key: "+key+" Value: "+value);
					
				}
			});
		} 
		
		
		// Ordenados por letra //
		System.out.println("Ordenados por letra del asiento");
		System.out.println(mapa);
		
		// LES VOY A PASAR ORDENADOS POR LETRA, BASICAMENTE CREO QUE ES LO MÁS LÓGICO	//
		try {
			File archivo = new File("academicos.dat");
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(mapa);			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
	}
	
}
