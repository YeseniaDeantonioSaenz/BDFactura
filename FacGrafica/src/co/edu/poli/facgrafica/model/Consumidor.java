package co.edu.poli.facgrafica.model;

public class Consumidor {

	
	private String nombre;

	private String Correo;

	private String puntos;
	
	private String cedulaclien;


	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getCedulaclien() {
		return cedulaclien;
	}

	public void setCedulaclien(String cedulaclien) {
		this.cedulaclien = cedulaclien;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}



	public Consumidor(String nombre, String correo, String puntos, String cedulaclien) {
		super();
		this.nombre = nombre;
		Correo = correo;
		this.puntos = puntos;
		this.cedulaclien = cedulaclien;
	}

	@Override
	public String toString() {
		return "Sr. " + nombre + ", Ud tiene" + "\n" + puntos + " Puntos" + "\n" + " Aliados a su cedula: " + cedulaclien;
	}
	

}