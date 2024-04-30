package practicaHerencia;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String respuesta, respuestaSeg;
		int i = 0;
		
		//INTRODUCCION DE DATOS Y CREACION ARRAYS DE NOTAS //
		
		System.out.println("Introduce la melodia de las dos manos del piano");
		System.out.println("Introduce la melodia de la mano derecha");
		respuesta = sc.nextLine();
		
		StringTokenizer respuesta1 = new StringTokenizer(respuesta);
		String notasD[] = new String [respuesta1.countTokens()];
		// BUCLE PARA RELLENAR EL ARRAY
		while (respuesta1.hasMoreTokens()) {
			notasD[i] = respuesta1.nextToken().toUpperCase().trim();
			i++;
		}
		System.out.println("Introduce la melodia de la mano derecha");
		respuestaSeg = sc.nextLine();
		
		StringTokenizer respuesta2 = new StringTokenizer(respuestaSeg);
		String notasI[] = new String [respuesta2.countTokens()];
		// RESET DE LA I
		i = 0;
		// BUCLE PARA RELLENAR EL ARRAY
		while (respuesta2.hasMoreTokens()) {
			notasI[i] = respuesta2.nextToken().toUpperCase().trim();
			i++;
		}
		
		// DECLARACION DEL OBJETO PIANO Y COMPROBACION DE LAS MELODIAS //
		Piano p1 = new Piano (notasD,notasI);
		if (p1.introMelodia(notasD,notasI)) {
			
			
			// MOSTRAR DURACION DE LAS MELODIAS //
			System.out.println("Duración melodía mano derecha: "+p1.duracion() + " notas");
			System.out.println("Duración melodía mano izquierda: "+p1.duracIzda() + " notas");
			
			// MOSTRAR LAS DOS MELODIAS //
			p1.interpretar();
			
			// CONTAR NOTA EN LA MANO DERECHA
			String nota;
			System.out.println("\nIntroduce la nota que quieras buscar en la mano derecha");
			nota = sc.next().toUpperCase();
			System.out.println(nota+" aparece "+ p1.contarNota(nota)+ " veces en las 2 manos");;
			
			// CONTAR NOTA  2 MANOS
			String nota2;
			System.out.println("Introduce la nota que quieras buscar en ambas manos");
			nota2 = sc.next().toUpperCase();			
			System.out.println(nota2+" aparece "+ p1.contarNotaDosManos(nota2)+ " veces en las 2 manos"); ;	
			
			sc.close();
			System.exit(0);
			
		} else {
			// CONDICION NO CUMPLIDA, LAS NOTAS NO ESTABAN BIEN ESCRITAS
		System.out.println("Has introducido mal las notas, fin del programa");
		sc.close();
		System.exit(0);
		}
		
		p1.interpretar();		
	}

}
