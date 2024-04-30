package practicaClases;

public class Gestor {
	private String nombre;
	final private int Telefono;
	private double importeMax;
	
	// Declaración de constructores //
	
	public Gestor (String nombre, int telefono) {
		this.nombre = nombre;
		this.Telefono = telefono;
		importeMax = 10000;
	}
	
	
	public Gestor (String nombre, int telefono, double importeMax) {
		this.importeMax = importeMax;
		this.nombre = nombre;
		this.Telefono = telefono;
	}
	
	// Método para visualizar datos del gestor //
	
	public void visualizarDatos () {
		System.out.println("Nombre gestor: "+this.nombre);
		System.out.println("Teléfono: "+this.Telefono);
		System.out.println("Importe máximo autorizado: "+this.importeMax);
	}
	
	
}
