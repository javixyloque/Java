package entregaEntornos;

import java.sql.*;

public class Articulo {
	// PARA LA CONEXION //
	private static String url = "jdbc:oracle:thin:@10.0.2.15:1521:xe", usr ="c##bdarticulos", pswd="bdarticulos";
	// ATRIBUTOS DE LA CLASE //
	private String codArt, nomArt, codFab, nomFab;
	private double precio; 
	
	
	
	

	public Articulo(String codArt) {
		this.read(codArt);
	}
	


	// METODO PARA LEER UN ARTICULO CON EL FINAL 
	// COMO EL CODIGO DE ARTICULO INSERTADO (ASI NO HAY QUE INSERTAR 8/9 CEROS) //
	
	public void read(String codArt) {
        String sql = "SELECT A.*, F.NOMFAB "
                + "FROM Articulo A JOIN Fabricante F "
                + "ON (F.CodFab = A.CodFab) "
                + "WHERE A.CodArt LIKE ? ";
        try {
            Connection conexion = connect();
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, "%"+codArt); 
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) { 
            	
            	this.codArt=codArt;
                this.nomArt = rs.getString("NomArt").toUpperCase();                
                this.precio = rs.getDouble("Precio");
                this.codFab = rs.getString("CodFab");
                this.nomFab = rs.getString("NomFab").toUpperCase();
               
                rs.close();
                sentencia.close();
                conexion.close();
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar un artículo.");
        }
         
    }
	

	// HAGO EL METODO CONECTAR PERO VAMOS QUE NO ES NECESARIO AL TENER SOLO UNA CONSULTA
	// SE PUEDE HACER EN EL MISMO METODO DE READ PERO ASI ES MAS ORGANIZADO
	
	public static Connection connect() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url, usr, pswd);
			
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}
		return conexion;
	}
	
	
	
	// GETTERS Y SETTERS (NUNCA SE SABE) //
	
	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}

	public String getNomArt() {
		return nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}

	public String getCodFab() {
		return codFab;
	}

	public void setCodFab(String codFab) {
		this.codFab = codFab;
	}

	public String getNomFab() {
		return nomFab;
	}

	public void setNomFab(String nomFab) {
		this.nomFab = nomFab;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
