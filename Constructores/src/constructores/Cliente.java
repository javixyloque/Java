package constructores;

public class Cliente {
	private String nomTit;
	private double saldo = 0;
	private static double beneficio;
	
	public Cliente (String nomTit, double saldo) {
		this.nomTit = nomTit;
		this.saldo = saldo;
	}
	
	public void setBeneficio (double beneficio) {
		Cliente.beneficio = beneficio;
	}
}
