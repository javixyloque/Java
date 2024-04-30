package constructores;

public class Empleados {
	private String nombre;
	private int edad;
	
	void crearEmpleado () {
			this.nombre = "Carlos";
			this.edad = 76;
			mostrarEmpleados();
	}
	
	void crearEmpleado (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		mostrarEmpleados();
	}
	
	void mostrarEmpleados() {
		System.out.println(nombre+"   "+edad);
	}
}
