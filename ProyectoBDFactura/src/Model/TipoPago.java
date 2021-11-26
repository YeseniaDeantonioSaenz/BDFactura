package Model;

import java.util.*;

/**
 * 
 */
public abstract class TipoPago {

    /**
     * Default constructor
     */
    public TipoPago() {
    }

    /**
     * 
     */
    private String tipodepago;


    public String getTipodepago() {
		return tipodepago;
	}


	public void setTipodepago(String tipodepago) {
		this.tipodepago = tipodepago;
	}


	public TipoPago(String tipodepago) {
		super();
		this.tipodepago = tipodepago;
	}


	/**
     * @return
     */
    public abstract String imprimirtipodepago();

}