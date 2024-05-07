package ejer1_comparadores;
import java.util.Comparator;

public class ComparaEdades implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;
		resul=((Socio)o1).edad()-((Socio)o2).edad();
		//al restar las edades dará valor negativo, 0 o valor positivo.
		return (resul);
	}
	
	/*
	 * if ((Socio)o1).edad()<(Socio)o2).edad())
	 * 	resul=-1;
	 * else
	 * 	if ((Socio)o1).edad()==(Socio)o2).edad())
	 * 		resul=0;
	 * 	else
	 * 		resul=1;
	 * return(resul);
	 */

}
