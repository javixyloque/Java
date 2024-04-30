package herencia;
import clasesEjs.*;
public class Ejer1 {
	public static void main(String[] args) {
		Alumno al1 = new Alumno("Jose", 15);
		Profesor pr1 = new Profesor();
		al1.setNombre("Juanjo");
		al1.mostrarDatos();
		pr1.setnombre("Xose");
		pr1.setEspecialidad("Ciencias");
		pr1.mostrarDatos();
		
		Persona per1 = new Persona ("Juanjo", 17, 1.76);
		Empleado emp1 = new Empleado (per1.getNombre(), per1.getEdad(), per1.getAltura(), 7000);
		emp1.mostrarDatos();
	}
	
}






