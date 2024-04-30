package constructores;

public class Alumnos {
	private String nombre;
	private int edad;
	
	public void crearAlumno(String nombre, int edad, char a) {
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Nombre: "+nombre);
		System.out.println("Edda "+edad);
		lineaAsteriscos(a);
	}
	void lineaAsteriscos(char a) {
		String rep = Character.toString(a);
		System.out.println("\n"+rep.repeat(40)+"\n");
	}
}
