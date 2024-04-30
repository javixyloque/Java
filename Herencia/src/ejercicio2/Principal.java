package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an1 = new Animal();
		an1.pedirDatos();
		Mamifero m[] = new Mamifero[3];
		for (int i = 0; i<3; i++) {
			m[i] = new Mamifero();
			System.out.println("Toma de datos mamífero nº"+(i+1));
			m[i].pedirDatos();
		}
		Persona p1;
		p1 = new Persona ();
		
		for (int i = 0; i<3; i++) {
			System.out.println("Datos del mamifero nº"+(i+1));
			m[i].mostrarDatos();
		}
		p1.pedirDatos();
		p1.mostrarDatos();
	}

}
