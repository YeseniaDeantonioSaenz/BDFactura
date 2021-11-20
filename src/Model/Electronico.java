package Model;

import java.util.*;

/**
 * 
 */
public class Electronico extends Producto {

    @Override
	public String toString() {
		return super.toString() + " [inputVoltaje=" + inputVoltaje + "]";
	}


	/**
     * Default constructor
     */
    public Electronico() {
    }

    
	public Electronico(String codigobarras, String nombre, double precio, int impuesto, String tipo,
			int inputvoltaje) {
		super(codigobarras, nombre, precio, impuesto, tipo);
		this.inputVoltaje = inputvoltaje;
	}
    /**
     * 
     */
    private int inputVoltaje;

    /**
     * @return
     */
    public String imprimirFichaTecnica() {
        // TODO implement here
        return "";
    }

    public int getInputVoltaje() {
		return inputVoltaje;
	}

	public void setInputVoltaje(int inputVoltaje) {
		this.inputVoltaje = inputVoltaje;
	}

	/**
     * @return
     */
	public String imprimirCaracteristicas() {
		return "Posiblemente Alto Voltaje";

	}
}