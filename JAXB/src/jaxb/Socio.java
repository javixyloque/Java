package jaxb;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="socio")  //el elemento raíz se llamará 'socio'
@XmlType(propOrder= {"nombreSocio","direccion","fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Socio {
	@XmlAttribute(name="id",required=true)
	private Integer identificacion;
	@XmlElement(name="nombre")
	private String nombreSocio;
	private String direccion;
	@XmlElement(name="alta")
	private String fechaAlta;
	
	public Socio() {		
	}
	
	public Socio(Integer identificacion, String nombreSocio, String direccion, String fechaAlta) {		
		this.identificacion = identificacion;
		this.nombreSocio = nombreSocio;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombreSocio() {
		return nombreSocio;
	}

	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Socio [identificacion=" + identificacion + ", nombreSocio=" + nombreSocio + ", direccion=" + direccion
				+ ", fechaAlta=" + fechaAlta + "]";
	}	
	
}
