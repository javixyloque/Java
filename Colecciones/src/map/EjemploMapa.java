package map;
import java.util.*;
public class EjemploMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> alumno = new HashMap();
		
		alumno.put("Luis", 1.60);
		alumno.put("Pedro", 1.75);
		alumno.put("Angel", 1.96);
		alumno.put("Jose", 1.73);
		alumno.put("Pepe", 1.80);
		
		alumno.put("Luis", 1.70);
		
		alumno.remove("Pedro");
		
		alumno.forEach((k,v) -> System.out.println("Alumno: "+k+" Altura: "+v));
		
		System.out.println(alumno);
		ArrayList <Double> alturas = new ArrayList();
		alturas.addAll(alumno.values());
		Collections.sort(alturas);
		System.out.println("Alturas ordenadas: "+alturas);
		
		Map<String, Double> alts = new TreeMap();
		
		// ESTOS DOS METODOS HACEN LO MISMO, ITERAN SOBRE ALUMNO Y LE AÑADEN SUS ENTRADAS A 
		//ALTS
//		alumno.forEach((k,v)->alts.put(k,v));
		
		alts.putAll(alumno);
		System.out.println(alts);
	}

}
