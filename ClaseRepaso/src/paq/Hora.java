package paq;

public class Hora {
	private int hora, minuto, segundo;
	
	public Hora () {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
	public Hora (int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	public Hora (int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}
	public Hora (int hora, int minuto, int segundo)  {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	
	
	public int getHora () {
		return this.hora;
	}
	public int getMinuto () {
		return this.minuto;
	}
	public int getSegundo () {
		return this.segundo;
	}
	
	public void setHora (int hora) {
		if (hora >=0 && hora <=23) {
			this.hora= hora;
		} else {
			this.hora = 0;
		}
		
	}
	public void setMin (int minuto) {
		if (minuto >=0 && minuto<60) {
			this.minuto = minuto;
			
		} else {
			this.minuto = 0;
		}
	}
	
	public void setSeg (int seg) {
		if (seg>=0 && seg <60 ) {
			this.segundo = seg;
		} else {
			this.segundo =0;
		}
	}
	
	public void incSeg () {
		
		this.segundo++;
		if (this.segundo >=60) {
			this.segundo-=60;
			this.minuto++;
		}
		if (this.minuto>=60) {
			this.minuto -=60;
			this.hora++;
		}
		if (this.hora >= 24) {
			this.hora = 0;
		}
		
		
	}
	
	public void mostrarDatos () {
		System.out.println("Hora: "+this.hora+":"+this.minuto+":"+this.segundo);
	}
	

}
