package co.edu.poli.facgrafica.model;

import java.time.LocalDate;

public class Cheque extends Pago implements PasarelaPago {

	/**
	 * @param numReferencia
	 * @param banco
	 * @param fecha
	 * @param pagueseA
	 * @param cantidadDePesos
	 * @param firma
	 */
	public Cheque(String numReferencia, String banco, LocalDate fecha, String pagueseA, String cantidadDePesos,
			String firma) {
		super(numReferencia);
		this.banco = banco;
		this.fecha = fecha;
		this.pagueseA = pagueseA;
		this.cantidadDePesos = cantidadDePesos;
		this.firma = firma;
	}

	private String banco;

    private LocalDate fecha;

    private String pagueseA;

    private String cantidadDePesos;

    private String firma;

    public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getPagueseA() {
		return pagueseA;
	}

	public void setPagueseA(String pagueseA) {
		this.pagueseA = pagueseA;
	}

	public String getCantidadDePesos() {
		return cantidadDePesos;
	}

	public void setCantidadDePesos(String cantidadDePesos) {
		this.cantidadDePesos = cantidadDePesos;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	@Override
	public String procesoDePago() {
		// TODO Auto-generated method stub
		return "Medio de pago: Cheque";
	}

	@Override
	public String toString() {
		return 
	            "Número de Referencia " + getNumReferencia() +"\n" +  "Banco " + banco +"\n" + " Fecha" + fecha +"\n" + " Paguese Antes De " + pagueseA +"\n" +  "Cantidad Pesos "
				+ cantidadDePesos +"\n" + " Firma" + firma +"\n" ;
	}

	@Override
	public boolean establecerComunicacion() {
		// TODO Auto-generated method stub
		return true;
	}


}