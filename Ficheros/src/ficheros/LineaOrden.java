package ficheros;

public class LineaOrden {
	private String descrip;
	private int unidades;
	private double precio;
	
	//	CONSTRUCTORES	//
	public LineaOrden() {
		this.descrip = "";
		this.unidades = 0;
		this.precio = 0;
	}

	public LineaOrden(String descrip, int unidades, double precio) {
		this.descrip = descrip;
		this.unidades = unidades;
		this.precio = precio;
	}

	
	
	//	GETTERS Y SETTERS	//
	
	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarDatos() {
		System.out.println("Descripcion: "+this.descrip+"\nUnidades: "+this.unidades+"\nPrecio: "+this.precio);
	}
}
