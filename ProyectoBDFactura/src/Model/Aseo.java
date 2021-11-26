package Model;

import java.util.*;

import Model.Producto;

/**
 * 
 */
public class Aseo extends Producto {

	public Aseo (String codigobarras, String nombre, String cantidad, String precio) {

	};


	


	public Aseo(String codigobarras, String nombre, double precio, int impuesto, String tipo, boolean esVolatil) {
		super(codigobarras, nombre, precio, impuesto, tipo);
		this.esVolatil = esVolatil;
	}





	private boolean esVolatil;



	@Override
	public String toString() {
		return super.toString() + " [esVolatil=" + esVolatil + "]";
	}

	public String imprimirComQuimica() {

		return "";
	}

	public boolean isEsVolatil() {
		return esVolatil;
	}

	public void setEsVolatil(boolean esVolatil) {
		this.esVolatil = esVolatil;
	}

	public String imprimirCaracteristicas() {
		return "Compuestos quimicos";

	}
}