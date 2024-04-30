package dialogos;

public class JPrincipal {

	public static void main(String[] args) {
		int num = Dialogos.confirmaDialogo("Si o no?", "DIME ALGO");
		System.out.println(num);
		Dialogos.mensajeError("Ha habido un error");
		Dialogos.mensajeError("Ha habido un error", "HAZ LAS COSAS BIEN");
		
		Dialogos.mensajeInfo("Aqui van los datos");
		Dialogos.mensajeInfo("Aqui van los datos", "LEE BIEN LOS DATOS");
		
		Dialogos.mensajeWarning("Ojo con eso");
		Dialogos.mensajeWarning("Ojo con eso", "OJO");
		
		Dialogos.pedirEntero("Hay que escribir un número entero");
		Dialogos.pedirDouble("Hay que escribir un tipo double (número con o sin decimales)");
		Dialogos.pedirFloat("Hay que escribir un flotante (número con o sin decimales)");
		
	}

}
