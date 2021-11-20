package Model;

import java.util.*;

/**
 * 
 */
public abstract class Producto {

    /**
     * Default constructor
     */
    public Producto() {
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

}