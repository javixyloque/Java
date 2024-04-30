package personal;

public class Mecanico extends Personal {
	private int telefono;
	enum Especialidad{FRENOS, HIRDRAULICA, ELECTRICIDAD, MOTOR};
	private Especialidad especialidad;
	
	public Mecanico () {
		super();
		this.DNI="";
		this.nombre="";
		this.especialidad =Especialidad.FRENOS;
		this.telefono = 0;
	}
	public Mecanico (String nombre, String DNI, Especialidad esp, int telefono) {
		super();
		this.DNI=DNI;
		this.nombre=nombre;
		this.especialidad =esp;
		this.telefono = telefono;
	}
	
	public int getTelefono() {
		return telefono;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
