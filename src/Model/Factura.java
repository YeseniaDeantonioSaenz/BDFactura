package Model;

import java.util.*;

import Model.Producto;

/**
 * 
 */
public class Factura {

    /**
     * Default constructor
     */
    public Factura() {
    }

    /**
     * 
     */
    private String numero;

    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private Almacen almacen;

    /**
     * 
     */
    private Consumidor consumidor;

    /**
     * 
     */
    private ArrayList<Producto> productos;
    /**
     * 
     */
    private TipoPago tipopago;

    /**
     * 
     */
    private Empleado empleado;






    public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Consumidor getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}

	public  ArrayList<Producto>  getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto>  productos) {
		this.productos = productos;
	}

	public TipoPago getTipopago() {
		return tipopago;
	}

	public void setTipopago(TipoPago tipopago) {
		this.tipopago = tipopago;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Factura(String numero, String fecha, Almacen almacen, Consumidor consumidor, ArrayList<Producto> productos,
			TipoPago tipopago, Empleado empleado) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.almacen = almacen;
		this.consumidor = consumidor;
		this.productos = productos;
		this.tipopago = tipopago;
		this.empleado = empleado;
	}

	/**
     * @return
     */
	/*public double calcularTotal() {

		double total = 0;

		for (int i = 0; i < productos.size(); i++) {

			Producto p = productos.get(i);

			total += p.getPrecio()*p.getCantidad();
		}

		return total;

	}*/

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

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", fecha=" + fecha + ", almacen=" + almacen + ", consumidor=" + consumidor
				+ ", productos=" + productos + ", tipopago=" + tipopago + ", empleado=" + empleado + "]";
	}

    /**
     * @param tipo 
     * @return
     */
	/*public double calcularPorTipo(String tipo) {
		double total = 0;
		for (int i = 0; i < productos.size(); i++) {
			Producto p = productos.get(i);
			if (tipo == p.getTipo())
				total += p.getPrecio()*p.getCantidad();
		}

		return total;
	}
	
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

		return "" + s +  "\n"+ "DETALLE FORMA DE PAGO" +  "\n" + "\n" + tipopago + "\n" + "\n"+ "DETALLE DE IMPUESTOS" + "\n" + "\n" +	"Impuesto 8% " + impuesto8 + "\n" +	"Impuesto 19% " + impuesto19 + "\n"+"\n"+ consumidor	+ "\n"+ "\n" + "TOTAL POR TIPO: " + "\n" + "\n" + "Total Aseo: $" + tipoaseo + "\n" + "Total Bebida: $" + tipobebida + "\n" + "Total Carnes: " + tipocarne + "\n" + "Total Fruta: $" + tipofruta + "\n" + "Total Harinas: $" + tipoharina + "\n" + "Total Lácteos: $" + tipolacteo + "\n" + "Total Proteínas: $" + tipoproteina  + "\n" + "Total Verdura: $" + tipoverdura + "\n" + "Total Electrónico: $" + tipoelectronico + "\n" + "\n" + " TOTAL $ " + totalfact ; 
	}
*/
}