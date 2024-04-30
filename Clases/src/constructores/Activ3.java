package constructores;
import java.util.Scanner;


public class Activ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nombre;
		int edad;
		System.out.println("Escribe el nombre del empleado 1");
		nombre = sc.nextLine();
		System.out.println("Escribe la edad del empleado 1");
		edad = sc.nextInt();
		
		Empleados emp1 = new Empleados();
		Empleados emp2 = new Empleados();
		
		emp1.crearEmpleado(nombre, edad);
		emp2.crearEmpleado("Jose", 36);
		
		
		/* No se puede instanciar un objeto de esta manera
		
			Empleado empl5=new Empleado("Miguel Abad");
		   
		   básicamente porque Empleado es la clase, no un constructor.
		   
		*/
	}

}
