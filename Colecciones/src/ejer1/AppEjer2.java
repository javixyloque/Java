package ejer1;

import java.util.*;

public class AppEjer2 {
	public static void main(String[] args) {
		ArrayList<Socio> socios = new ArrayList<Socio>();
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido al servicio de registro de socios");
		boolean continuar = true;
		int id ;
		String nombre, fechaNac;
		do {
			try {
				System.out.println("Quiere insertar un nuevo socio? (s/n)");
				String resp = sc.next();
				if (resp.toLowerCase().equals("s") || resp.toLowerCase().equals("si")) {
					System.out.println("Introduzca el ID del nuevo socio");
					id= sc.nextInt();
					System.out.println("Escriba el nombre del socio");

					nombre = sc.next();
					System.out.println("Introduzca por ultimo su fecha de nacimiento (dd/mm/aaaa)");
			
					fechaNac = sc.next();
					socios.add(new Socio (id, nombre, fechaNac));
				}
			
			
			
			System.out.println("Quiere continuar? (s/n)");
			String resp2 = sc.next();
			if (resp2.toLowerCase().equals("n") || resp2.toLowerCase().equals("no")) {
				continuar = false;
			}
			
			}catch (InputMismatchException e) {
				System.out.println("El tipo de dato que ha insertado es erróneo, pruebe de nuevo");
				continuar = true;
			}
			
		}while (continuar);
		
		
		// METODO PARA ORDENAR EL ARRAYLIST //
		
		ComparaNombres c = new ComparaNombres();
		Collections.sort(socios, c);
		
		System.out.println(socios);
		
		Collections.sort(socios);
		// METODO PARA ORDENAR EL ARRAYLIST POR EL PARÁMETRO QUE QUERAMOS //
		socios.sort((s1, s2) -> s1.compareTo(s2));
		
		System.out.println(socios);
		for (Socio s: socios) {
			System.out.println(s.toString());
		}
		String resp3;
		System.out.println("Quiere eliminar algún socio? (s/n)");
		resp3 = sc.next();
		if (resp3.toLowerCase().equals("s")) {
			
			System.out.println("Introduzca el número del socio que desea eliminar (Orden de ID, no ID)");
			id = sc.nextInt();
			String eliminado = socios.remove(id-1).toString();
		}
		System.out.println(socios);
		for (Socio s: socios) {
			System.out.println(s.toString());
		}
		
	}
	
}
