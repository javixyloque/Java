package modelo;

import java.sql.*;

public class FabricanteDAO {
	private static Connection conectar() {
		Connection con=null;		
		String usr="c##bdarticulo",pass="bdarticulo";
		String url="jdbc:oracle:thin:@10.1.2.138:1521:xe";
		
        try {
            con = DriverManager.getConnection(url, usr, pass);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }
        return con;
    }
	
	public static Fabricante read (String codFab) {
		Fabricante fab = null;
		String sql = "SELECT *"
				+ "FROM FABRICANTE "
				+ "WHERE CodFab = ? ";
		try {
			Connection conexion = conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, codFab);
			ResultSet result = sentencia.executeQuery();
			if (result.next()) {
				String nomFab = result.getString("NomFab");
				fab = new Fabricante (codFab, nomFab);
				
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		return fab;
	}
	
	public static void update (Fabricante fab) {
		if (fab != null) {
			String sql = "UPDATE Fabricante "
					+ "SET NomFab = ? "
					+ "WHERE CodFab = ? ";
			try {
				Connection conexion = conectar();
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setString(1, fab.getNomFab());
				sentencia.setString(2, fab.getCodFab());
				sentencia.executeUpdate();
				conexion.close();
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void create (Fabricante fab) {
		if (fab!=null) {
			Connection conexion = conectar();
			String sql = "INSERT INTO FABRICANTE"
					+ "VALUES (?, ?)";
			try {
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setString(1, fab.getCodFab());
				sentencia.setString(2, fab.getNomFab());
				sentencia.executeUpdate();
				conexion.close();
			} catch (SQLException ex) {
				System.out.println("Error al insertar.");
			}
		}
	}
	

	public static void delete (String codFab) {
		String sql = "DELETE FROM FABRICANTE "
				+ "WHERE CodFab = ?";
		Connection conexion = conectar();

		try {
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1,codFab);
			sentencia.executeUpdate();
			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	public static void FabricanteArticulos (String codFab) {
		String sql = "SELECT * "
				+ "FROM ARTICULO A JOIN FABRICANTE F "
				+ "ON (A.CodFab = F.CodFab) "
				+ "WHERE F.CodFab = ?";
		try {
			Connection conexion = conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, codFab);
			ResultSet rs = sentencia.getResultSet();
			while (rs.next()) {
				System.out.println("CODIGO ARTICULO: "+rs.getString("CodArt")
				+" - NOMBRE ARTICULO: "+rs.getString("NomArt")+" - PRECIO: "+rs.getDouble("Precio")+
				" - FABRICANTE: "+rs.getString("NomFab")+" - CODIGO FABRICANTE "+codFab+"\n"+("*".repeat(69)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
}
