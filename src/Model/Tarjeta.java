package Model;

import java.util.*;

/**
 * 
 */
public class Tarjeta extends TipoPago {

    @Override
	public String toString() {
		return "Tarjeta [numerotarjeta=" + numerotarjeta + ", decendencia=" + decendencia + ", titular=" + titular
				+ ", banco=" + banco + "]";
	}

	/**
     * Default constructor
     */
    public Tarjeta() {
    }

    /**
     * 
     */
    private String numerotarjeta;

    /**
     * 
     */
    private String decendencia;

    /**
     * 
     */
    private String titular;

    /**
     * 
     */
    private String banco;

    public String getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getDecendencia() {
		return decendencia;
	}

	public void setDecendencia(String decendencia) {
		this.decendencia = decendencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Tarjeta(String numerotarjeta, String decendencia, String titular, String banco) {
		super();
		this.numerotarjeta = numerotarjeta;
		this.decendencia = decendencia;
		this.titular = titular;
		this.banco = banco;
	}

	/**
     * @return
     */
	public String imprimirtipodepago() {
		// TODO Auto-generated method stub
		return null;
	}
}