package usoObjetos;
import java.util.Scanner;
public class RectanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectClase rectangulo = new RectClase();
		int respuesta, inicio;
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe qué figura quieres analizar: \n1 .Triángulo\n2. Rectángulo");
		inicio =sc.nextInt();
		while (inicio!=1 && inicio!=2) {
		System.out.println("Pon algo válido novatin");
		System.out.println("Escribe qué figura quieres analizar: \n1 .Triángulo\n2. Rectángulo");
		inicio = sc.nextInt();
		}
		System.out.println("Escribe la base");
		double b = sc.nextDouble();
		System.out.println("Escribe la altura");
		double h = sc.nextDouble();
		if (inicio == 1) {
			rectangulo.Rectangulo(b,h);
			System.out.println("Área: "+rectangulo.areaTri());
			sc.close();
			System.exit(0);
			
		} else if (inicio == 2) {
			rectangulo.Rectangulo(b,h);
			System.out.println("Calcular 1. Area 2. Perimetro");
			respuesta = sc.nextInt();
			while (respuesta !=1 && respuesta !=2) {
				System.out.println("Pon algo válido novatin");
				System.out.println("Calcular 1. Area 2. Perimetro");
				respuesta = sc.nextInt();
			}
			if (respuesta ==1) {
				System.out.println("Área = "+rectangulo.area());
			} else if (respuesta ==2){
				System.out.println("Perímetro "+rectangulo.perimetroRect());
			}	
		}
				
		sc.close();
		System.exit(0);
	}

}
