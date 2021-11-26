package Model;

import java.util.*;
import java.time.LocalDate;

/**
 * 
 */
public  class Cheque extends TipoPago {

    @Override
	public String toString() {
		return "Cheque [titular=" + titular + ", numerocheque=" + numerocheque + ", fechaemision=" + fechaemision
				+ ", banco=" + banco + "]";
	}

	/**
     * Default constructor
     */
    public Cheque() {
    }

    public Cheque(String titular, String numerocheque, LocalDate fechaemision, String banco) {
		super();
		this.titular = titular;
		this.numerocheque = numerocheque;
		this.fechaemision = fechaemision;
		this.banco = banco;
	}

	/**
     * 
     */
    private String titular;

    public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumerocheque() {
		return numerocheque;
	}

	public void setNumerocheque(String numerocheque) {
		this.numerocheque = numerocheque;
	}

	public LocalDate getFechaemision() {
		return fechaemision;
	}

	public void setFechaemision(LocalDate fechaemision) {
		this.fechaemision = fechaemision;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	/**
     * 
     */
    private String numerocheque;

    /**
     * 
     */
    private LocalDate fechaemision;

    /**
     * 
     */
    private String banco;

	@Override
	public String imprimirtipodepago() {
		// TODO Auto-generated method stub
		return null;
	}

    /**
     * @return
     */

}