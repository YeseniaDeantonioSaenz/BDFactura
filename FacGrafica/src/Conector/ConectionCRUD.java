package Conector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionCRUD {
	
	public static void main(String[] args) {
		ConnectionProyect conexion = new ConnectionProyect();
		Connection refConexion = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			refConexion = conexion.conectar();
			statement = refConexion.createStatement();
			result = statement.executeQuery("SELECT * FROM sucursal");
			
			while(result.next()) {
				int nit = result.getInt(1);
				String direccion = result.getString(2);
				int telefono = result.getInt(3);
				String gerente = result.getString(4);
				String razonSocial = result.getNString(5);
				
				System.out.println(nit + " " + direccion + " " + telefono + " " + gerente + " " + razonSocial);
				
				
			}
		} catch (SQLException e) {
			
		} finally {
			try {
				if (result!=null) {
					result.close();
				}
				if (statement!=null) {
					statement.close();
				}
				if (refConexion!=null) {
					refConexion.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
}
