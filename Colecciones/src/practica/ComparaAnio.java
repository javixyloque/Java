package practica;

import java.util.Comparator;

public class ComparaAnio implements Comparator<Academico> {



	@Override
	public int compare(Academico acad1, Academico acad2) {
		if (acad1.getaIngreso()< acad2.getaIngreso()) {
			return -1;
		} else if (acad1.getaIngreso() == acad2.getaIngreso()){
			return 0;
		} else {
			return 1;
		}
	}

}
