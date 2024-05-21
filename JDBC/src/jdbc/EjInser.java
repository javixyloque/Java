package jdbc;
import java.sql.*;
public class EjInser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.1.2.247:1521:xe", "c##bdarticulos", "bdarticulos");
			Statement stat = conexion.createStatement();
			int numIns = 0;
			
			System.out.println("Inserciones: "+numIns);
			numIns=stat.executeUpdate("DELETE FROM FABRICANTE WHERE NOMFAB = 'Trust'");
			String consulta = "SELECT * FROM FABRICANTE";
			ResultSet rset = stat.executeQuery(consulta);
			while (rset.next()) {
				System.out.print(rset.getString(1));
				System.out.println(rset.getString(2));
			}
			conexion.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
