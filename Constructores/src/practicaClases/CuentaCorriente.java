package practicaClases;

public class CuentaCorriente {

	// Declaración de variables //
	private String DNI, nombre;
	private double saldo;
	private static double tipoInteres = 3.5;
	private int telefono;
	
	
	
	
	
	// Constructores para crear una cuenta //
	
	
	public CuentaCorriente (String DNI, String nombre) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = 0;
		this.telefono = getTelefono();
	
	}
	public CuentaCorriente (String DNI, double saldo) {
		this.DNI = DNI;
		this.nombre = "";
		this.saldo = saldo;
		this.telefono = getTelefono();
	
	}
	public CuentaCorriente (String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.telefono = getTelefono();
	}
	
	public CuentaCorriente () {
		this("","",0);
	}
	
	// Método para sacar dinero //
	
	public boolean sacarDinero(double extraido) {
		boolean extraer = false;
		
		if (this.saldo>=extraido) {
			extraer = true;
			this.saldo = this.saldo - extraido;
			return extraer;
		} else {
			return extraer;
		}
		
	}
	
	// Método para ingresar //
	
	public void ingresarDinero (double saldo) {
		this.saldo += saldo;
	}
	
	// Método para imprimir datos en pantalla //
	
	public void mostrarDatos () {
		System.out.println("El DNI del cliente es: "+this.DNI);
		System.out.println("Nombre del cliente: "+this.nombre);
		System.out.println("Saldo de la cuenta: "+this.saldo);
		System.out.println("Tipo de interés: "+tipoInteres+ "\n");
	}
	
	// Métodos set y get varios //
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setInteres (double interes) {
		tipoInteres = interes;
	}
	

	
	public void setTelefono (int tel) {
		this.telefono = tel;
		
	}
	
	
	public int getTelefono () {
		
		return this.telefono;
		
	}
	
}
