package orden;
import java.util.Scanner;

public class Alumnos {
	public static void main(String[] args) {
	
		/*int notas[][] = {{0,0,0,0},{0,0,0,0,0,0,0},{0,0,0},{0,0}};
		final int NALUM = 4;
		Scanner sc = new Scanner(System.in);
		int i, j, nota, nAl;
		double media=0;
		System.out.println("NOTAS ALUMNOS");
		for (i=0; i<notas.length; i++) {
			//bucle alumnos
			System.out.println("ALUMNO" + i);
			for (j=0; j <notas[i].length; j++) {
				
				do {
					System.out.println("MODULO "+j+". Nota: ");
					nota=sc.nextInt();
				} while (nota<0 || nota>10);
				notas[i][j]=nota;
			}
		}
		for (i=0;i<NALUM; i++) {
			media =media+notas[i][0];
			
		}
		media = media/4.0;
		System.out.println("MEDIA MODULO 1: "+media);
		System.out.println("------NOTAS------");
		for (j=0;j<notas[i].length; j++) {
			System.out.println(notas[i][j]+ "");
			
		}
		System.out.println("¿De qué módulo quieres la media?");
		int mm=sc.nextInt();
		int medmod[] = {};
		media=0;
		nAl=0;
		for (i=0; i<notas.length; i++) {
			if (notas[i].length >= mm ) {
				media=media+notas[i][mm-1];
				nAl++;
			}
			media= media/nAl;
			System.out.println ("MEDIA MÓDULO "+mm+"= "+media);
			
		}*/
		
		
		
		
		int alumnos[][] = {{0,0,0,0},{0,0,0,0,0,0,0},{0,0,0},{0,0}};
		

		int v1 [] = {1,5,6,4};
		alumnos[0]= v1;
		
		int v2[] = {2,5,3,7,3,8,2};
		alumnos[1]=v2;
		
		int v3[]= {5,6,3};
		alumnos[2]=v3;
		
		int v4[] = {8,5};
		alumnos[3]=v4;
		int i, j;
		//Imprimir la matriz
		for (i =0; i<alumnos[i].length; i++) {
			System.out.println (alumnos);
		}
		
	}
}
