package co.edu.poli.facgrafica.model;

public class Alimento extends Producto {

	public Alimento(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo,
			double grAzucar) {
		super(codigo, nombre, precio, cantidad, impuesto, tipo);
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
		return "" + super.toString() ;
	}

	public String imprimirTablaNutricional() {
		// TODO implement here
		return "";
	}

	public String imprimirCaracteristicas() {
		return "Tabla nutricional";
	}
}
