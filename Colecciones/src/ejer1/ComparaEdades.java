package ejer1;

import java.util.Comparator;

public class ComparaEdades implements Comparator<Socio>{

	
	
	@Override
	public int compare(Socio o1, Socio o2) {
		
		if (o1.edad()<o2.edad()) {
			return -1;
		} else if (o1.edad()==o2.edad()) {
			return 0;
		} else  {
			return 1;
		}
	}
	
}
