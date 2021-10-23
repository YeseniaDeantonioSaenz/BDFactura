package co.edu.poli.facgrafica.model;

public class Aseo extends Producto {

	public Aseo(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo,
			boolean esVolatil) {
		super(codigo, nombre, precio, cantidad, impuesto, tipo);
		this.esVolatil = esVolatil;
	}

	private boolean esVolatil;

	@Override
	public String toString() {
		return ""  + super.toString();
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