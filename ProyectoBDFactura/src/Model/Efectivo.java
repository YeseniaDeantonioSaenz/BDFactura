package Model;

import java.util.*;

/**
 * 
 */
public class Efectivo extends TipoPago {

    /**
     * Default constructor
     * @param i 
     */


    @Override
	public String toString() {
		return "Efectivo [cantidadrecibida=" + cantidadrecibida +  "]";
	}

	/**
     * 
     */
    private int cantidadrecibida;

    public Efectivo(int cantidadrecibida, int cambio) {
		super();
		this.cantidadrecibida = cantidadrecibida;
	}

	public int getCantidadrecibida() {
		return cantidadrecibida;
	}

	public void setCantidadrecibida(int cantidadrecibida) {
		this.cantidadrecibida = cantidadrecibida;
	}

	/**
     * @return
     */
	public String imprimirtipodepago() {
		// TODO Auto-generated method stub
		return null;
	}
}