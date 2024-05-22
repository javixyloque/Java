package modelo;

import java.sql.*;

public class FabricanteDAO {
	private static Connection conectar() {
		Connection con=null;		
		String usr="c##bdarticulos",pass="bdarticulos";
		String url="jdbc:oracle:thin:@192.168.0.18:1521:xe";
		
        try {
            con = DriverManager.getConnection(url, usr, pass);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }
        return con;
    }
	
	public static void create (Fabricante fab) {
		if (fab!=null) {
			Connection conexion = conectar();
			String sql = "INSERT INTO FABRICANTE"
					+ "";
		}
	}
	
	
	
	
}
