package Model;

import java.util.*;

/**
 * 
 */
public class Almacen {

    /**
     * Default constructor
     */
    public Almacen() {
    }

	public  ArrayList<Empleado>  getEmpleados() {
		return empleados;
	}

	public void setEmpleado(ArrayList<Empleado>  empleados) {
		this.empleados = empleados;
	}
    
    
    public Almacen(String nit, String nombre, String direccion, String nombreGerente, String telefono, ArrayList<Empleado> empleados) {
		super();
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.nombreGerente = nombreGerente;
		this.telefono = telefono;
		this.empleados = empleados;
    }

	@Override
	public String toString() {
		return "Almacen [nit=" + nit + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", nombreGerente=" + nombreGerente + ", telefono=" + telefono + ", empleados=" + empleados + "]";
	}

	/**
     * 
     */
    private String nit;

    /**
     * 
     */
    private String nombre;

    private ArrayList<Empleado> empleados;

    
    /**
     * 
     */
    private String direccion;

    public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreGerente() {
		return nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
     * 
     */
    private String nombreGerente;

    /**
     * 
     */
    private String telefono;



}