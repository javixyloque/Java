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
		String [] respuestas =  {"Añadir académico", "Listar academicos por orden de letra", "Listar academico por orden de nombre", "Eliminar académico","Ordenar por año de ingreso", "Salir"};
		char letra;
		String nombre; 
		int aIngreso;
		HashMap<Character, Academico> mapa = new HashMap<Character, Academico>();

		while (1>0) {
		int decis = Dialogos.pedirOpcion("Escoge la opción", "BIENVENIDO", respuestas);
		File archivo = new File("academicos.dat");
			switch (decis) {
				case 0:
					nombre = Dialogos.pedirCadena("Inserte su nombre");
					aIngreso = Dialogos.pedirEntero("Registre el año de ingreso");
					letra = Dialogos.pedirCadena("Introduzca el sillón que va a ocupar").toLowerCase().charAt(0);
					
					Academico acad = new Academico (nombre, aIngreso);
					
					nuevoAcademico(mapa, acad, letra, archivo);
					break;
				case 1: 
					ordenarLetra(archivo);
					break; 
				case 2: 
				try {
					ordenarNombre(archivo);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
				case 3:
					eliminarAcademico(mapa, archivo);
					break;
				case 4: 
					ordenarAnio(archivo);
					break;
				case 5:
					Dialogos.mensajeInfo("FIN DEL PROGRAMA");
					System.exit(0);
					break;
				case -1 :
					Dialogos.mensajeInfo("FIN DEL PROGRAMA");
					System.exit(0);
					break;
			}
		}
	}
	
	
	static void eliminarAcademico (HashMap<Character, Academico> mapa, File archivo) {
		char letra  = Dialogos.pedirCadena("Introduzca el sillon del academico que quiere eliminar").toLowerCase().charAt(0);
		mapa.remove(letra);
		try {
			ObjectOutputStream entrada = new ObjectOutputStream (new FileOutputStream (archivo));
			entrada.writeObject(mapa);
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	static boolean nuevoAcademico (HashMap<Character, Academico> mapa, Academico acad, char letra, File archivo) {
			
		// Character.isLetter(letra);	//
		if ((65<=letra && letra<=90 ) || (97<=letra && letra<=122)) {
			mapa.put(letra, acad);
		}
		
		if (mapa.containsValue(acad)) {
			try {
				ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));
				salida.writeObject(mapa);
				salida.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
		
	}
	
	
	static void ordenarNombre(File archivo) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ordNom = new ObjectInputStream (new FileInputStream(archivo));
		HashMap<Character, Academico> objetos = new HashMap<Character, Academico>();
		objetos.putAll((HashMap<Character, Academico>) ordNom.readObject());
		
		ArrayList<Academico> objetosArr = new ArrayList<Academico>();
		objetosArr.addAll(objetos.values());
		Collections.sort(objetosArr);
		objetosArr.sort((obj1, obj2) -> obj1.compareTo(obj2));
		String lista = "";
		for (Academico acad : objetosArr) {
			for (Map.Entry<Character, Academico> fila : objetos.entrySet()) {
				if (fila.getValue().compareTo(acad) == 0) {
					lista+="Sillón: "+fila.getKey()+" "+fila.getValue().toString()+"\n"+("*".repeat(60)+"\n");
				}
			}
		}
		ordNom.close();
		
		Dialogos.mensajeInfo(lista, "ACADEMICOS ORDENADOS POR NOMBRE");
	}

	public static void ordenarLetra (File archivo) {
		try {
			
			ObjectInputStream ordLetra = new ObjectInputStream (new FileInputStream(archivo));
			HashMap<Character, Academico> datos =  (HashMap<Character, Academico>) ordLetra.readObject();
			String lista="";
			for (Map.Entry<Character, Academico> fila: datos.entrySet()) {
				lista+= "Sillón: "+fila.getKey()+" "+fila.getValue().toString()+"\n"+("*".repeat(60)+"\n");
			}
			Dialogos.mensajeInfo(lista, "ACADEMICOS ORDENADOS POR LETRA");
			ordLetra.close();
		}catch (ClassNotFoundException cne){
			cne.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void ordenarAnio (File archivo) {
		try {
			ObjectInputStream ordAnio = new ObjectInputStream (new FileInputStream(archivo));
			HashMap <Character, Academico> datos = (HashMap<Character, Academico>) ordAnio.readObject();
			ArrayList< Academico> arr = new ArrayList<Academico>();
			arr.addAll(datos.values());
			
			ComparaAnio comp = new ComparaAnio();
			arr.sort(comp);
			String lista = "";
			for (Academico acad : arr) {
				for (Map.Entry<Character, Academico> fila : datos.entrySet()) {
					if (fila.getValue().compareTo(acad) == 0) {
						lista+="Sillón: "+fila.getKey()+" "+fila.getValue().toString()+"\n"+("*".repeat(60)+"\n");
					}
				}
			}
			Dialogos.mensajeInfo(lista, "ACADEMICOS ORDENADOS POR AÑO DE INGRESO");
			ordAnio.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
