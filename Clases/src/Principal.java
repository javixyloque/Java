
public class Principal {

	public static void main(String[] args) {
		Libro libro1 = new Libro (); 
		Libro libro2 = new Libro ();
		System.out.println();libro1.Libro("Quijote", "Cervantes");
		Libro.setEdit ("Planeta de Agostini");
		libro2.Libro ("La traviata", "Monteverdi");
		
		libro1.visualizarDatos();
		libro2.visualizarDatos();
		

	}

}
