package co.edu.poli.facgrafica.model;

public class Empleado {

	
	private String Correo;

	private String Contrase�a;
	
	private String Nombre;

	private String Cedula;
	
	public Empleado(String Correo, String Contrase�a, String Nombre, String Cedula) {
		super();
		this.Correo = Correo;
		this.Contrase�a = Contrase�a;
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


	public String getContrase�a() {
		return Contrase�a;
	}

	public void setContrase�a(String Contrase�a) {
		this.Contrase�a = Contrase�a;
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
		return "Empleado [Correo=" + Correo + ", Contrase�a=" + Contrase�a + ", Nombre=" + Nombre + ", Cedula=" + Cedula
				 + "]";
	}
	
	

}