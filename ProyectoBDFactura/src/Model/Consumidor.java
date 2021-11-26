package Model;

import java.util.*;

/**
 * 
 */
public class Consumidor {

    /**
     * Default constructor
     */
    public Consumidor() {
    }

    /**
     * 
     */
    private String nombre;

    public Consumidor(String nombre, String cedulacliente, String correo) {
		super();
		this.nombre = nombre;
		this.cedulacliente = cedulacliente;
		this.correo = correo;
	}

	/**
     * 
     */
    private String cedulacliente;

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedulacliente() {
		return cedulacliente;
	}

	public void setCedulacliente(String cedulacliente) {
		this.cedulacliente = cedulacliente;
	}

	public String getCorreo() {
		return correo;
	}

	@Override
	public String toString() {
		return "Consumidor [nombre=" + nombre + ", cedulacliente=" + cedulacliente + ", correo=" + correo
				+  "]";
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
     * 
     */
    private String correo;

    /**
     * 
     */


}