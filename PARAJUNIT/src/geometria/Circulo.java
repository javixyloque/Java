package geometria;

public class Circulo {
	private float radio;
	
	public Circulo(float size) {
		setRadio(size);
	}
	
	public double perimetro() {
		return 12;
	}
	
	public double area() {
		return Math.PI*radio*radio;
	}

	public float setRadio(float radio) {
		if(radio>0) {
		  this.radio = radio;
		  return radio;
		}else {
			this.radio = 0;
			return -1;
		}
	}

		

}