package ejerciciosBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlumnoDAO {
	private String usr = "c##alumnos";
	private String pswd="alumnos";
	private String bd="jdbc:oracle:thin:@10.1.2.247:1521:xe";
	
	
	// METODO CREAR	//
	public void create(Alumno alum) {
		Connection conexion = conectar();
		try {
		String sql = "INSERT INTO ALUMNOS (num, nombre, media, curso) "
				+ "VALUES (?, ?, ?, ?)";
		
			PreparedStatement secuencia = conexion.prepareStatement(sql);
			secuencia.setInt(1, alum.getNum());
			secuencia.setString(2, alum.getNombre());
			secuencia.setDouble(3, alum.getMedia());
			secuencia.setString(4, alum.getCurso());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public 
	
	
	
	// METODO PARA CONECTAR
	public Connection conectar () {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(usr, pswd,bd);
			return conexion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}
	
	
}
