package exmProgra;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		Alumno alum =  new Alumno (13, "Joselu", "1B", 6.5);
		AlumnoDAO.create(alum);
		AlumnoDAO.mostrar();
	}
	
}
