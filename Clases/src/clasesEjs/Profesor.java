package clasesEjs;
import java.util.Scanner;

// Clase con visibilidad solo en el paquete (por default)
class Profesor {
	private String nombre, especialidad;
	
	public Profesor() {
		this.nombre = "";
		this.especialidad = "";
	}
	
	public Profesor (String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	
	public Profesor (String nombre) {
		this(nombre, "");
	}
	
	public String getNombre () {
		return this.nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad () {
		return this.especialidad;
	}
	public void setEspecialidad (String especialidad) {
		this.especialidad = especialidad;
	}
	
	public void inicializarDatos (String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	
	public void modificarDatos () {
		this.pedirNombre();
		this.pedirEspecialidad();
	}
	
	public void pedirEspecialidad () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Establece una nueva especialidad para el profesor");
		this.especialidad = sc.nextLine();
	
	}
	
	public void pedirNombre () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el nombre del profesor");
		this.nombre = sc.nextLine();
	}

	
	public void mostrarDatos () {
		String a = "*";
		System.out.println("DATOS DEL PROFESOR");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Especialidad "+this.especialidad+"\n"+a.repeat(50));
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", especialidad=" + especialidad + "]";
	}
	
}
