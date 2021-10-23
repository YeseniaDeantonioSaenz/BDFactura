package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionProyect {
	
	public static final String controlador = "com.mysql.cj.jdbc.Driver";
	public static final String base_datos = "jdbc:mysql://localhost:3306/proyecto_bd";
	public static final String usuario = "root";
	public static final String contraseña = "Ysql";
	Connection conexion = null;
	static {
		try {
			Class.forName(controlador);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
		}
		
	}
							
	public Connection conectar() {
		
		try {
			conexion = DriverManager.getConnection(base_datos, usuario, contraseña);
			System.out.println("Conexion hecha");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
		}
		
		return conexion;
	}
	
	public int InsertarBD(String strStntenciaSQL) {
		
		try {
			PreparedStatement stmprepared = conexion.prepareStatement(strStntenciaSQL);
			stmprepared.execute();
			return 1;
			
			} catch (SQLException e) {
				System.out.println(e);
				return 0;
		}
		
	}
}

	
