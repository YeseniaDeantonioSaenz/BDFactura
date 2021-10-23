package co.edu.poli.facgrafica.model;
public class Efectivo extends Pago {


	/**
	 * @param numReferencia
	 * @param cantidadBilletes
	 * @param cantidadMonedas
	 */
	public Efectivo(String numReferencia, int cantidadBilletes, int cantidadMonedas) {
		super(numReferencia);
		this.cantidadBilletes = cantidadBilletes;
		this.cantidadMonedas = cantidadMonedas;
	}

	private int cantidadBilletes;

    private int cantidadMonedas;

    public int getCantidadBilletes() {
		return cantidadBilletes;
	}

	public void setCantidadBilletes(int cantidadBilletes) {
		this.cantidadBilletes = cantidadBilletes;
	}

	public int getCantidadMonedas() {
		return cantidadMonedas;
	}

	public void setCantidadMonedas(int cantidadMonedas) {
		this.cantidadMonedas = cantidadMonedas;
	}

	@Override
	public String procesoDePago() {
		// TODO Auto-generated method stub
		return "Medio de pago: Efectivo";
	}

	@Override
	public String toString() {
		return  "Numero de Referencia " + getNumReferencia() +"\n" + "Cantidad en Billetes " + cantidadBilletes +"\n" + "Cantidad en Monedas " + cantidadMonedas +"\n" ;
	}

	

}