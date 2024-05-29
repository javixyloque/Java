package exmProgra;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoDAO {
	private static String usr = "c##alumnos";
	private static String pswd="alumnos";
	private static String bd="jdbc:oracle:thin:@212.230.135.2:1521:xe";
	
	
	// METODO CREAR	//
	public static void create(Alumno alum) {
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
	
	public static void mostrar () {
		Connection conexion=  conectar();
		try {
			String sql = "SELECT * FROM ALUMNOS";
			Statement secuencia  = conexion.createStatement();
			ResultSet rs = secuencia.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Alumno:");
				System.out.println("ID: "+rs.getInt("num"));
				System.out.println("Nombre: "+rs.getString("nombre"));
				System.out.println("Media: "+rs.getDouble("media"));
				System.out.println("Curso: "+rs.getString("curso"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	
	
	
	// METODO PARA CONECTAR
	public static Connection conectar () {
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

