package metodos;

public class Metodos_ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		String nombre = "leocadio";
		saludar(nombre);
		System.out.println(nombre);
	}

		public static void saludar (String nombre) {
		String mayus = nombre.toUpperCase();
		System.out.println("Método>> hola "+mayus);
		
		
	}

}

