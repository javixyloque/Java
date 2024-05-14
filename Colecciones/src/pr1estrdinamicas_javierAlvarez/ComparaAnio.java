package pr1estrdinamicas_javierAlvarez;

import java.util.Comparator;

public class ComparaAnio implements Comparator<Academico>{

	@Override
	public int compare(Academico acad1, Academico acad2) {
		int result;
		result = acad1.getaIngreso() - acad2.getaIngreso();
		return result;
	}

}
