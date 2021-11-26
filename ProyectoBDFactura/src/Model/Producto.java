package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.swing.JOptionPane;

import javafx.collections.ObservableList;

/**
 * 
 */
public abstract class Producto {

	/**
	 * Default constructor
	 */
	public Producto() {
	}

	public Producto(String codigobarras, String nombre, double precio, int cantidad) {
		this.codigobarras = codigobarras;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;

	}

	public Producto(String codigobarras, String nombre, double precio, int impuesto, String tipo) {
		super();
		this.codigobarras = codigobarras;
		this.nombre = nombre;
		this.precio = precio;
		this.impuesto = impuesto;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Producto [codigobarras=" + codigobarras + ", nombre=" + nombre + ", precio=" + precio + ", impuesto="
				+ impuesto + ", tipo=" + tipo + "]";
	}

	/**
	 * 
	 */
	private String codigobarras;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private double precio;

	/**
	 * 
	 */
	private int cantidad;

	public String getCodigobarras() {
		return codigobarras;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 */
	private int impuesto;

	/**
	 * 
	 */
	private String tipo;


	/**
	 * @return
	 */
	public abstract String imprimirCaracteristicas();


	public static void llenarinfoprod (Connection con, ObservableList<Producto> productos,String numrecibo) {


		try {                      
			String SQL = "SELECT *FROM PRODCANT WHERE numerorecibo=?; ";
			PreparedStatement pst= con.prepareStatement(SQL);


			pst.setString(1, numrecibo);

			ResultSet Result = pst.executeQuery();
			

			while (Result.next()) {

				
					productos.add(new Alimento(
							Result.getString("codigobarras"),
							Result.getString("nombre"),
							Result.getDouble("precio"),
							Result.getInt("impuesto"),
							Result.getString("tipo"),
							Result.getDouble("cantidad")
							));

			}

			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}


	}



}

