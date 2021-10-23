package co.edu.poli.facgrafica.model;

import java.util.ArrayList;

/**
 * 
 */
public class Factura {

	/**
	 * 
	 */
	private int numero;
	/**
	 * 
	 */
	private String fecha;
	/**
	 * 
	 */
	private Empleado almacen;
	/**
	 * 
	 */
	private Consumidor consumidor;
	/**
	 * 
	 */
	private ArrayList<Producto> productos;

	private Pago pago;

	public Factura(int numero, String fecha, Empleado almacen, Consumidor consumidor, ArrayList<Producto> productos, Pago pago) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.almacen = almacen;
		this.consumidor = consumidor;
		this.productos = productos;
		this.pago = pago;
	}

	public Factura(int numero, String fecha, Empleado almacen, Consumidor consumidor, ArrayList<Producto> productos) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.almacen = almacen;
		this.consumidor = consumidor;
		this.productos = productos;
	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;

	}

	public void setFecha(String fecha) {
		this.fecha = fecha;

	}

	public Empleado getAlmacen() {

		return almacen;

	}

	public void setAlmacen(Empleado almacen) {

		this.almacen = almacen;

	}

	public Consumidor getConsumidor() {

		return consumidor;

	}

	public void setConsumidor(Consumidor consumidor) {

		this.consumidor = consumidor;

	}

	public ArrayList<Producto> getProductos() {

		return productos;

	}

	public void setProductos(ArrayList<Producto> productos) {

		this.productos = productos;

	}


	public Pago getPago() {
		return pago;
	}



	public void setPago(Pago pago) {
		this.pago = pago;
	}



	public double calcularTotal() {

		double total = 0;

		for (int i = 0; i < productos.size(); i++) {

			Producto p = productos.get(i);

			total += p.getPrecio()*p.getCantidad();
		}

		return total;

	}

	/**
	 * @param valorImpuesto
	 * @return
	 */
	public double calcularImpuesto(int valorImpuesto) {

		if (valorImpuesto != 0) {
			double total = 0;
			for (int i = 0; i < productos.size(); i++) {
				Producto p = productos.get(i);
				if (valorImpuesto == p.getImpuesto())
					total += p.getPrecio();
			}
			return total * valorImpuesto/100;
		}
		return 0;
	}

	/**
	 * @param tipo
	 * @return
	 */
	public double calcularPorTipo(String tipo) {
		double total = 0;
		for (int i = 0; i < productos.size(); i++) {
			Producto p = productos.get(i);
			if (tipo == p.getTipo())
				total += p.getPrecio()*p.getCantidad();
		}

		return total;
	}

	@Override
	public String toString() {

		String totalfact = String.valueOf(calcularTotal());

		String impuesto8 = String.valueOf(calcularImpuesto(8));
		String impuesto19 = String.valueOf(calcularImpuesto(19));

		String tipoaseo = String.valueOf(calcularPorTipo("Aseo"));
		String tipobebida = String.valueOf(calcularPorTipo("Bebidas"));
		String tipocarne = String.valueOf(calcularPorTipo("Carnes"));
		String tipofruta = String.valueOf(calcularPorTipo("Frutas"));
		String tipoharina = String.valueOf(calcularPorTipo("Harinas"));
		String tipolacteo = String.valueOf(calcularPorTipo("Lácteos"));
		String tipoproteina = String.valueOf(calcularPorTipo("Proteínas"));
		String tipoverdura = String.valueOf(calcularPorTipo("Verduras"));
		String tipoelectronico = String.valueOf(calcularPorTipo("Electrónico"));

		String s = "";


		for (int i = 0; i < productos.size(); i++) {
			s += productos.get(i) + " ";
		}

		return "" + s +  "\n"+ "DETALLE FORMA DE PAGO" +  "\n" + "\n" + pago + "\n" + "\n"+ "DETALLE DE IMPUESTOS" + "\n" + "\n" +	"Impuesto 8% " + impuesto8 + "\n" +	"Impuesto 19% " + impuesto19 + "\n"+"\n"+ consumidor	+ "\n"+ "\n" + "TOTAL POR TIPO: " + "\n" + "\n" + "Total Aseo: $" + tipoaseo + "\n" + "Total Bebida: $" + tipobebida + "\n" + "Total Carnes: " + tipocarne + "\n" + "Total Fruta: $" + tipofruta + "\n" + "Total Harinas: $" + tipoharina + "\n" + "Total Lácteos: $" + tipolacteo + "\n" + "Total Proteínas: $" + tipoproteina  + "\n" + "Total Verdura: $" + tipoverdura + "\n" + "Total Electrónico: $" + tipoelectronico + "\n" + "\n" + " TOTAL $ " + totalfact ; 
	}



}
