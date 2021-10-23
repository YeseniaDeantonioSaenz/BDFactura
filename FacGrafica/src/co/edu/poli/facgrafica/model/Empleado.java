package co.edu.poli.facgrafica.model;

public class Empleado {

	
	private String Correo;

	private String Contraseña;
	
	private String Nombre;

	private String Cedula;
	
	public Empleado(String Correo, String Contraseña, String Nombre, String Cedula) {
		super();
		this.Correo = Correo;
		this.Contraseña = Contraseña;
		this.Nombre =Nombre;
		this.Cedula = Cedula;

	}
	

	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String Correo) {
		this.Correo = Correo;
	}


	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String Contraseña) {
		this.Contraseña = Contraseña;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	

	public void setCedula(String Cedula) {
		this.Cedula = Cedula;
	}


	public String getCedula() {
		return Cedula;
	}

	public void setDireccion(String Cedula) {
		this.Cedula = Cedula;
	}


	@Override
	public String toString() {
		return "Empleado [Correo=" + Correo + ", Contraseña=" + Contraseña + ", Nombre=" + Nombre + ", Cedula=" + Cedula
				 + "]";
	}
	
	

}