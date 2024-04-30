package practica3excep;
import java.util.*;
import dialogos.Dialogos;
public class ElectroApp {
/**
 * <h2>Descripción: </h2><br> El try-catch, no devuelve al usuario al electrodoméstico que está insertando, sino al principio del todo.<br>
 * <strong>Esto se debe a que las excepciones de la Clase Dialogos hacen saltar su propia excepción, por lo que no puedo hacer <br>
 * que se salga del bucle
 * </strong><br><br>
 * Uso <strong>constructores</strong> en vez de métodos no por nada en especial, me ha resultado menos complicado <br>
 * aunque con ya unos cuantos parámetros que tienen los constructores igual lo mejor es hacerlo con métodos.<br><br>
 * @param args
 * @throws Exception
 * @author <h1>Javier Álvarez Centeno<h1> <br><img src="https://img.freepik.com/vector-gratis/pulgares-arriba-contorno-pegatina-superposicion-vector_53876-162491.jpg?size=338&ext=jpg&ga=GA1.1.1880011253.1705104000&semt=ais">
 */
	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Electrodomestico e[]= new Electrodomestico[6];
		String [] elec= {"Lavadora", "Frigorifico", "Lavavajillas"};
		String [] califi = {"A", "B", "C", "D", "E", "F"};
		Calif calif;
		int tipo, maxServ, id;
		double consumo, conLit, maxKg, maxL;
		String a;
		boolean continuar = false;
		int x = 0;
		// MENÚ DE INSERCIÓN DE DATOS ELECTRODOMÉSTICOS //
		do {
			try {
				for (int i = 0; i<6; i++) {
					tipo = Dialogos.pedirOpcion("Elige tu tipo para el electodoméstico nº "+(i+1), elec);    
					switch (tipo) {
				case 0: 
					a = Dialogos.pedirCadena("Escribe su calificación energética [a - g]");
					calif = Calif.valueOf(a.toUpperCase());
					consumo = Dialogos.pedirDouble("Introduce el consumo en W");
					maxKg = Dialogos.pedirDouble("Ahora su capacidad máxima de carga (en Kg)");
					conLit = Dialogos.pedirDouble("Por ultimo su consumo medio en litros");
					e[i] = new Lavadora(calif, consumo, conLit, maxKg);
					break;
				case 1:
					a = Dialogos.pedirCadena("Escribe su calificación energética");
					calif = Calif.valueOf(a.toUpperCase());
					consumo = Dialogos.pedirDouble("Introduce el consumo en W");
					maxL = Dialogos.pedirDouble("Introduce su capacidad en L");
					e[i] = new Frigorifico(calif, consumo, maxL);
					break;
				case 2:
					a = Dialogos.pedirCadena("Escribe su calificación energética");
					calif = Calif.valueOf(a.toUpperCase());
					consumo = Dialogos.pedirDouble("Introduce el consumo en W");
					conLit = Dialogos.pedirDouble("Ahora su consumo medio en L");
					maxServ = Dialogos.pedirEntero("¿Número máximo de servicios que se pueden lavar (platos, vasos, cubiertos...)?");
					e [i] = new Lavavajillas(calif, consumo, conLit, maxServ);
					break;
				case -1:
					Dialogos.mensajeInfo("Fin del programa", "Saliendo");
					System.out.println(e[0].toString());
					System.exit(0);
				}
				continuar = false;
				} 
			
			} catch (Exception ex) {
				Dialogos.mensajeError("Ha ocurrido un error, intente introducir los datos correctamente");
				continuar = true;
			}
			} while (continuar);
			
		
			// IMPRIMIR DATOS ELECTRODOMÉSTICOS //
			for (int i = 0; i<e.length; i++) {
				Dialogos.mensajeInfo(e[i].toString(), "Electrodoméstico nº "+(i+1));
			}
			
			
			// Pedir qué electrodomésticos desea eliminar el usuario (por id) //
			do {
				try {
				tipo = Dialogos.pedirEntero("Elige el número de electrodomésticos que quieras eliminar");
				for (int i  = 0; i<tipo; i++) {
					id = Dialogos.pedirEntero("Escribe el id del producto que deseas eliminar ");
					e[id] = null;
					}	
				continuar = false; 
				} catch (NullPointerException ex) {
					Dialogos.mensajeError("Ha ocurrido un error, intente introducir los datos correctamente");
					continuar = true;
			}} while (continuar);
			
			// IMPRIMIR DATOS ELECTRODOMÉSTICOS (otra vez) //
				for (int i = 0; i<e.length; i++) {
					if (e[i] != null) {
						Dialogos.mensajeInfo(e[i].toString(), "Electrodoméstico nº "+(i+1));
					}
						
				}
		
	}

}
