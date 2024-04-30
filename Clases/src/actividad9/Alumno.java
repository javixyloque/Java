package actividad9;
import java.util.Scanner;
public class Alumno {
	private String nombre;
	private int grupo;
	private double [] notas = new double[5];
	
	
	public Alumno () {
		this.nombre  = "";
		this.grupo = 0;
		
	}
	
	public Alumno (String nombre) {
		this.nombre = nombre;
		this.grupo = 0;

		
	}
	
	public Alumno (String nombre, int grupo) {
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public Alumno (String nombre, int grupo, double[] notas) {
		this.nombre = nombre;
		this.grupo = grupo;
		this.notas = notas;
	}
	
	public void pedirDatos () {
		System.out.println("Introduzca los datos del alumno \n");
		System.out.println("*".repeat(50)+"\n");
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el nombre del alumno");
		this.nombre = sc.nextLine();
		System.out.println("Introduce su grupo");
		this.grupo = sc.nextInt();
		for (int i = 0; i<notas.length; i++) {
			System.out.println("Introduce sus notas en la asignatura "+(i+1));
			this.notas[i] = sc.nextDouble();
		}
	}
	
	public void visualizarDatos () {
		System.out.println("Nombre del alumno: "+this.nombre);
		System.out.println("Grupo: "+this.grupo);
		for (int i = 0; i<notas.length; i++) {
			System.out.println("Calificación asignatura nº "+(i+1)+" = "+this.notas[i]);
		}
	}
	
	public void visualizarNotas () {
		for (int i = 0; i<notas.length; i++) {
			System.out.println("Calificación asignatura nº "+(i+1)+" = "+this.notas[i]);
		}
	}
	
	public double notaMedia () {
		double total = 0;
		for (int i = 0; i<notas.length; i++) {
			total+=this.notas[i];
		}
		return total/this.notas.length;
	}
	
	public int suspensos () {
		int contador = 0;
		for (int i = 0; i<this.notas.length; i++) {
			if (this.notas[i]<5) {
				contador++;
			}
		}
		return contador;
	}
	
	public void modificarModulo () {
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Introduzca el número del módulo que quiere modificar");
		numero = sc.nextInt();
		System.out.println("Introduzca la nueva nota");
		this.notas[numero-1] = sc.nextInt();
	}
	
	
	// GETTERS Y SETTERS //
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
}
