package practica3excep;

public class Lavavajillas extends Lavadojillas {
	
	private int maxServ;
	
	public Lavavajillas(Calif calif, double consumo, double conLit, int maxServ) {
		super(calif, consumo, conLit);
		this.maxServ = maxServ;
		// TODO Auto-generated constructor stub
	}

	
	public int getMaxServ() {
		return maxServ;
	}

	public void setMaxServ(int maxServ) {
		this.maxServ = maxServ;
	}


	@Override
	public String toString() {
		return "Lavavajillas [maxServ=" + maxServ + ", conLit=" + conLit + ", id=" + id + ", calif=" + calif
				+ ", consumo=" + consumo + ", nuevo=" + fecha + "]";
	}

	
	
}
