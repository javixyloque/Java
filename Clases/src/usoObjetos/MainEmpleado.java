package usoObjetos;
import java.util.Scanner;
public class MainEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sueldo1, sueldo2;
		String nombre1;
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		
		empleado1.pedirDatos();
		empleado2.pedirDatos();
		empleado1.visualizarDatos();
		empleado2.visualizarDatos();
		
		sueldo1 = empleado1.getSueldo();
		empleado3.asignarValores ("Pepe", sueldo1);
		empleado3.asignarSueldo (1465);
		empleado3.visualizarDatos();
		
		
		sueldo2 = empleado2.getSueldo();
		nombre1 = empleado1.getNombre();
		
		compararSueldos(sueldo1, sueldo2, empleado1.getNombre(), empleado2.getNombre());
	}
	
	
	static void compararSueldos (float sueldo1, float sueldo2, String nomEmp1, String nomEmp2) {
		if (sueldo1 > sueldo2) {
			System.out.println(nomEmp1+" cobra más que "+nomEmp2);
		} else if (sueldo2 >sueldo1) {
			System.out.println(nomEmp2+" cobra más que "+nomEmp1);
		} else if (sueldo1 == sueldo2) {
			System.out.println("Ambos empleados cobran lo mismo");
		}
	}

}
