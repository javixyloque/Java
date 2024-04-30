package ejer1;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		String []hola1 = {"Hola", "Soc el Jaume"};
		
		
//		ArrayList<String> hola  =new  ArrayList <String>();
//		hola.add(hola1[0]);
//		hola.add(hola1[1]);
//		for (String s : hola) {
//			System.out.println(s);
//		}
//		String saludo = hola.remove(0);
//		System.out.println(hola);
//		System.out.println(saludo);
		
		Socio s1 = new Socio (1, "Jose","12/12/2020");
		Socio s2 = new Socio (2, "Angel", "12/01/2001");
		Socio s3 = new Socio (4, "juanjo", "15/02/1998");
		System.out.println(s1.compareTo(s2));
		//		DEVUELVE -1 PORQUE EL ID DEL S1 ES MAS BAJO QUE EL DEL S2	//
		System.out.println(s2.compareTo(s1));
		//		DEVUELVE 1 PORQUE EL ID DE S2 ES MAS ALTO QUE EL DE S1			//
		System.out.println(s1.compareTo(s1));
		//		DEVUELVE 0 PORQUE EL ID ES IGUAL (SON EL MISMO OBJETO)		//
		
		Socio [] club = new Socio[] {
			new Socio(1, "Jose","12/12/2020"), 
			new Socio(5, "Andrés", "12/01/2001"), 
			new Socio(4, "juanjo", "15/02/1998")
		};
		
		for (Socio s: club) {
			System.out.println(s.toString());
		}
		ComparaNombres c = new ComparaNombres();
		int resultado = c.compare(s1,s1);
		System.out.println(resultado);
		
		// METODO PARA ORDENAR	//
		Arrays.sort (club);
		
		//	FOREACH PARA IMPRIMIR LOS OBJETOS DEL ARRAY YA ORDENADOS	//
		for (Socio s: club) {
			System.out.println(s.toString());
		}
		
		// EL TOSTRING NOS DEJA IMPRIMIR PORQUE LO TENEMOS IMPLEMENTADO	//
		System.out.println(Arrays.toString(club));
		System.out.println(Arrays.deepToString(club));
	}

	
}
