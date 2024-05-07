package ejer1_comparadores;
import java.util.*;


public class AppEjer2 {

	public static void main(String[] args) {
		//Pedir socios
		ArrayList<Socio> socios=new ArrayList<Socio>();
		String seguir="SI";
		int iden=0,i=0;
		int borrarS;
		String nombre="",fechNac="";
		Scanner teclado=new Scanner(System.in);
		boolean encontrado=false;
		
		while (seguir.toUpperCase().compareTo("SI")==0) {
			System.out.println("N socio: ");
			iden=teclado.nextInt();
			teclado.nextLine();
			System.out.println("Nombre: ");
			nombre=teclado.nextLine();
			System.out.println("Fecha nacimiento: ");
			fechNac=teclado.next();			
			socios.add(new Socio(iden,nombre,fechNac));
			teclado.nextLine();
			System.out.println("¿Desea seguir? (SI/NO): ");
			seguir=teclado.nextLine();
		}
		
		//Ordenamos
		Collections.sort(socios);

		//Mostrar datos
		System.out.println("DATOS SOCIOS ordenados por id ");
		for(i=0;i<socios.size();i++)
			System.out.println(socios.get(i).toString());
		
		ComparaNombres c2=new ComparaNombres();
		Collections.sort(socios,c2);
		//Mostrar datos
		System.out.println("DATOS SOCIOS ordenados por nombre");
		for(i=0;i<socios.size();i++)
			System.out.println(socios.get(i).toString());
		
		//Eliminar socio
		System.out.println("Id del socio a eliminar: ");
		borrarS=teclado.nextInt();
		encontrado=false;
		for(i=0;i<socios.size();i++) {
			if(socios.get(i).getId()==borrarS) {
				socios.remove(i);
				encontrado=true;
			}
		}
		if (encontrado==false)
			System.out.println("No se encontró el id. No se eliminó ningún socio");
		
		//Mostrar datos
		System.out.println("DATOS SOCIOS ordenados por nombre");
		for(i=0;i<socios.size();i++)
			System.out.println(socios.get(i).toString());
		
		
		//Mostrar datos. Recorremos con un for-each		
		System.out.println("DATOS SOCIOS for-each");
		for(Socio elemento:socios)
			System.out.println(elemento.toString());
		
		//Mostrar datos. Recorremos con un iterador	
				System.out.println("DATOS SOCIOS iterador");
				Iterator<Socio> it=socios.iterator();
				while(it.hasNext())
					System.out.println(it.next().toString());
		System.out.println("FIN");

	}

}
