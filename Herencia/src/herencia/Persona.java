package herencia;

public class Persona {
	protected String nombre;
	protected int edad;
	protected double altura;
	
	// CONSTRUCTORES DE PERSONA //
	
	public Persona (String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	public Persona (String nombre) {
		this(nombre, 0, 0.0);
	}
	
	public Persona() {
		this(null, 0, 0.0);
	}
	
	// SETTERS Y GETTERS //

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	// METODO MOSTRAR DATOS //
	
	public void mostrarDatos () {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: "+this.edad );
		System.out.println("Altura: "+this.altura);
	}
	
	
}
