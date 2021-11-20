package Model;

import java.util.*;

import Model.Producto;

/**
 * 
 */
public class Alimento extends Producto {

	public Alimento(String codigobarras, String nombre, double precio, int impuesto, String tipo,
			double grAzucar) {
		super(codigobarras, nombre, precio, impuesto, tipo);
		this.grAzucar = grAzucar;
	}



	private double grAzucar;

	public double getGrAzucar() {
		return grAzucar;
	}

	public void setGrAzucar(double grAzucar) {
		this.grAzucar = grAzucar;
	}

	@Override
	public String toString() {
		return super.toString() + " [grAzucar=" + grAzucar + "]";
	}

	public String imprimirTablaNutricional() {
		// TODO implement here
		return "";
	}

	public String imprimirCaracteristicas() {
		return "Tabla nutricional";
	}
}
