package co.edu.poli.facgrafica.model;

public class Electronico extends Producto {

	public Electronico(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo,
			int inputVoltaje) {
		super(codigo, nombre, precio, cantidad, impuesto, tipo);
		this.inputVoltaje = inputVoltaje;
	}

	private int inputVoltaje;

	public int getInputVoltaje() {
		return inputVoltaje;
	}

	public void setInputVoltaje(int inputVoltaje) {
		this.inputVoltaje = inputVoltaje;
	}

	@Override
	public String toString() {
		return "" + super.toString() ;
	}

	public String imprimirFichaTecnica() {
		// TODO implement here
		return "";
	}

	public String imprimirCaracteristicas() {

		return "Referencia técnica";
	}
}