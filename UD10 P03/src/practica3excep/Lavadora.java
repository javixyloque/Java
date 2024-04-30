package practica3excep;

public class Lavadora extends Lavadojillas {
	private double maxKg;
	
	public Lavadora(Calif calif, double consumo, double conLit, double maxKg) {
		super(calif, consumo, conLit);
		this.maxKg=maxKg;
	}

	public double getMaxKg() {
		return maxKg;
	}

	public void setMaxKg(double maxKg) {
		this.maxKg = maxKg;
	}

	@Override
	public String toString() {
		return "Lavadora [maxKg=" + maxKg + ", conLit=" + conLit + ", id=" + id + ", calif=" + calif + ", consumo="
				+ consumo + ", nuevo=" + fecha + "]";
	}
	
	
	

}
