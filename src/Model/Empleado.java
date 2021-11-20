package Model;

import java.util.*;

/**
 * 
 */
public class Empleado {

    /**
     * Default constructor
     */
    public Empleado() {
    }

    /**
     * 
     */
    private String cedula;
    private String correo;
    private String nit;
    private String nombre;

    public Empleado(String cedula, String nombre, String correo, String nit) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.correo = correo;
		this.nit = nit;

	}
    
    public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
     * 
     */

	@Override
	public String toString() {
		return "Empleado [cedula=" + cedula + ", correo=" + correo + ", nombre=" + nombre + "]";
	}



}