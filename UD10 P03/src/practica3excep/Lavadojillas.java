package practica3excep;

public class Lavadojillas extends Electrodomestico {
	protected double conLit;
	
	public Lavadojillas (Calif calif, double consumo, double conLit) {
		super(calif, consumo);
		this.conLit = conLit;
	}

	
	
	public double getConLit() {
		return conLit;
	}

	public void setConLit(double conLit) {
		this.conLit = conLit;
	}



	
	
	
	
	// Se puede hacer de las dos maneras, la cosa es 	que al usar el super llamas	//
	//	otra vez al tostring de la superclase y te vuelve a poner electrodoméstico 		//
	
//	@Override
//	public String toString() {
//		return "Lavadojillas [conLit=" + conLit + ", id=" + id + ", calif=" + calif + ", consumo=" + consumo
//				+ ", nuevo=" + nuevo + "]";
//	}

//
//
//	@Override
//	public String toString() {
//		return "Lavadojillas [conLit=" + conLit + "]"+super.toString();
//	}

	
}
