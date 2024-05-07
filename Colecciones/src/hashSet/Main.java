package hashSet;

import java.time.format.DateTimeParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		HashSet <Socio> socios = new HashSet<Socio>();
		do {
		try {
			
		int id= 0;
		String nombre=null, fechaNac=null, respuesta=null;
		System.out.println("Id del cliente");
		id = sc.nextInt();
		System.out.println("Nombre del cliente");
		nombre = sc.next();
		System.out.println("Fecha de nacimiento (dd/mm/aaaa)");
		fechaNac = sc.next();
		socios.add(new Socio(id, nombre, fechaNac));

		
		System.out.println("Quiere seguir? (s/n)");
		respuesta = sc.next();
		if (respuesta.toLowerCase().equals("s") || respuesta.toLowerCase().equals("si") || respuesta.toLowerCase().equals("sí")) {
			seguir = true;
		} else if (respuesta.toLowerCase().equals("n") || respuesta.toLowerCase().equals("no")) {
			seguir = false;
		}
		} catch (InputMismatchException e) {
			System.out.println("tipo de dato erróneo, pruebe otra vez");
			seguir = true;
			sc.next();
		} catch (DateTimeParseException ex) {
			System.out.println("Formato invalido para la fecha, prueba de nuevo");
		}
		} while (seguir);
		
		
		
		
		// ITERADOR PARA IMPRIMIR SOCIOS Y PARA COMPROBAR QUE EL METODO HASHCODE FUNCIONA	//
		Iterator<Socio> it = socios.iterator();
		while (it.hasNext()) {
			Socio s = it.next();
			 System.out.println(s.toString());
			 System.out.println("Hashcode "+s.hashCode());
		}
		
//			ELIMINAR SOCIO	//
		int idEliminar;
		System.out.println("ID del socio que quieres eliminar");
		idEliminar = sc.nextInt();
		Iterator<Socio> it2 = socios.iterator();
		while (it2.hasNext()) {
			Socio s2 = it2.next();
			if (s2.getId()==idEliminar) {
				it2.remove();
				System.out.println("Socio borrado:  "+s2.toString());
			}
			
		}
		//	BUCLE FOREACH PARA IMPRIMIR, ME DA PEREZA HACER OTRO ITERADOR	//
		for (Socio s : socios) {
			System.out.println(s.toString());
		}
		
		
	}
	


}
