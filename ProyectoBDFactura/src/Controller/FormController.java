package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.CallableStatement;

import Conector.ConnectionProyect;
import Model.Alimento;
import Model.Almacen;
import Model.Empleado;
import Model.Aseo;
import Model.Cheque;
import Model.Consumidor;
import Model.Efectivo;
import Model.Electronico;
import Model.Factura;
import Model.TipoPago;
import Model.Producto;
import Model.Tarjeta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox; 

public class FormController {

	@FXML
	private TextField impu8;

	@FXML
	private TextField result;
	
	@FXML
	private TextField impu19;

	@FXML
	private TextField subtotal;

	@FXML
	private TextField cedulaclientecrear;

	@FXML
	private TextField correoclientecrear;

	@FXML
	private TextField nombreclientecrear;

	@FXML
	private TextField nitalmod;

	@FXML
	private TextField nitfact;

	@FXML
	private TextField nombrefact;

	@FXML
	private TextField dirfact;

	@FXML
	private TextField telfact;

	@FXML
	private TextField gerentefact;

	@FXML
	private TextField cedclienfact;

	@FXML
	private TextField correoclienfact;

	@FXML
	private TextField nombreclienfact;

	@FXML
	private TextField cedemplfact;

	@FXML
	private TextField correoemplfact;

	@FXML
	private TextField nombreemplfact;

	@FXML
	private TextField numfact;

	@FXML
	private TextField fechafact;

	@FXML
	private TextField numrecibo;

	@FXML
	private TextField direccionalmod;

	@FXML
	private TextField nombrealmmod;

	@FXML
	private TextField gerentealmmod;

	@FXML
	private TextField telefonoalmod;

	@FXML
	private Button crearcliente;

	@FXML
	private TextField correoemplcrear;

	@FXML
	private TextField nitempresaemp;

	@FXML
	private TextField nombreemplcrear;

	@FXML
	private TextField cedulaemplcrear;

	@FXML
	private Button crearempleado;

	@FXML
	private ComboBox<String> comtipoprodcrear;

	@FXML
	private TextField codigobarrascrear;

	@FXML
	private TextField nombreprodcrear;

	@FXML
	private TextField precioprodcrear;

	@FXML
	private Label esvcrear;

	@FXML
	private Label voltcrear;

	@FXML
	private TextField voltajeprodcrear;

	@FXML
	private HBox volatil;

	@FXML
	private RadioButton rad1;


	@FXML
	private RadioButton rad2;

	@FXML
	private ToggleGroup grupovolatil;

	@FXML
	private RadioButton noaplica;

	@FXML
	private RadioButton ocho;

	@FXML
	private ToggleGroup impuestogroup;

	@FXML
	private RadioButton diecinueve;

	@FXML
	private Button crearprod;

	@FXML
	private Button modcliente;

	@FXML
	private TextField cedulamodcliente;

	@FXML
	private ComboBox<String> combmodcliente;

	@FXML
	private GridPane modcorreocl;

	@FXML
	private TextField correomodcliente;

	@FXML
	private GridPane modnombrecl;

	@FXML
	private TextField nombremodcliente;

	@FXML
	private TextField cedulamodempl;

	@FXML
	private ComboBox<String> combmodempl;

	@FXML
	private GridPane modnombrempl;

	@FXML
	private TextField nombremodempl;

	@FXML
	private GridPane modcorreoempl;

	@FXML
	private TextField correomodempl;

	@FXML
	private Button modprod;

	@FXML
	private GridPane panemodtipo;

	@FXML
	private ComboBox<String> tipoprodmod;

	@FXML
	private TextField codigoprodmod;

	@FXML
	private TextField impuestomod;

	@FXML
	private ComboBox<String> combmodprod;

	@FXML
	private ComboBox<String> combmodalm; 

	@FXML
	private GridPane panemodnombre;

	@FXML
	private GridPane panemodimpuesto;

	@FXML
	private TextField nombreprodmod;

	@FXML
	private GridPane panemodprecio;

	@FXML
	private TextField precioprodmod;

	@FXML
	private TextField cedulaclientecons;

	@FXML
	private TextField correoclientecons;

	@FXML
	private TextField nombreclientecons;

	@FXML
	private Button conscliente;

	@FXML
	private TextField cedulaemplcons;

	@FXML
	private TextField nombreemplcons;

	@FXML
	private TextField correoemplcons;

	@FXML
	private Button consempl;

	@FXML
	private TextField codigoprodcons;

	@FXML
	private TextField nitalmcons;

	@FXML
	private TextField codfactelim; 

	@FXML
	private TextField nombreprodcons;

	@FXML
	private TextField precioprodcons;

	@FXML
	private TextField caracteristicaprodcons;

	@FXML
	private TextField tipoprodcons;

	@FXML
	private TextField impuestoprodcons;

	@FXML
	private Button consprod;

	@FXML
	private Label caraccons;

	@FXML
	private TextField codigoprodconsfactura;

	@FXML
	private TextField cantidadconsprodfactura;

	@FXML
	private Button agregarprodfactura;

	@FXML
	private TextField cedulaclienteconsfactura;

	@FXML
	private TextField cedulaemplconsfactura;

	@FXML
	private ComboBox<String> tipopago;

	@FXML
	private GridPane paneefec;

	@FXML
	private GridPane panetar;

	@FXML
	private GridPane panecheque;

	@FXML
	private Button crearfactura;

	@FXML
	private TextArea impalm;

	@FXML
	private TextArea textfe;

	@FXML
	private TextField total;

	@FXML
	private TextArea improd;

	@FXML
	private Button imp;

	@FXML
	private  TextField considfactura;

	@FXML
	private TextField nombrealmcons;

	@FXML
	private TextField gerentealmcons;

	@FXML
	private TextField telefonoalmcons;

	@FXML
	private TextField direccionalmcons;

	@FXML
	private TextField grazucar;

	@FXML
	private Label titulgrazu;

	@FXML
	private TextField nombrealmcrear;

	@FXML
	private TextField gerentealmcrear;

	@FXML
	private TextField nitalmcrear;

	@FXML
	private TextField telefonoalmcrear;

	@FXML
	private TextField direccionalmcrear;

	@FXML
	private TextField numref;

	@FXML
	private TextField titucheque;

	@FXML
	private DatePicker fechacheque; 

	@FXML
	private TextField banccheque;

	@FXML
	private TextField numreftar;

	@FXML
	private TextField titulartar;

	@FXML
	private TextField ntar;

	@FXML
	private TextField banctar;

	@FXML
	private TextField tipotar;

	@FXML
	private TextField numrefefec;

	@FXML
	private TextField cantidadefectivo;

	@FXML
	private Button crearalm;

	@FXML
	private GridPane panemodgerentealm;

	@FXML
	private GridPane panemodtelefonoalm;

	@FXML
	private GridPane panemodnombrealm;

	@FXML
	private GridPane panemoddiralm;	

	@FXML
	private TableView<Producto> tablaprod;

	@FXML
	private TableColumn<Producto, String> colcant;

	@FXML
	private TableColumn<Producto, String> coldesc;

	@FXML
	private TableColumn<Producto, String> colprecio;

	@FXML
	private TableColumn<Producto, String> colimp;



	ConnectionProyect conexion = new ConnectionProyect(); //Genera la Conexión a la BD
	Connection con = conexion.conectar();

	ObservableList<String> Tipodepago = FXCollections.observableArrayList("Cheque","Tarjeta","Efectivo"); 
	ObservableList<String> clientemod = FXCollections.observableArrayList("Nombre","Correo"); 
	ObservableList<String> empleadomod = FXCollections.observableArrayList("Nombre","Correo"); 
	ObservableList<String> productomod = FXCollections.observableArrayList("Tipo Producto","Nombre","Precio","Impuesto"); 
	ObservableList<String> almacenmod = FXCollections.observableArrayList("Nombre","Teléfono","Dirección","Gerente"); 
	private ObservableList<Producto> listaproductos;

	public ArrayList<Producto>  Carrito ;
	public ArrayList<Empleado>  empleados ;

	public void initialize() {



		comtipoprodcrear.getItems().add("Aseo");
		comtipoprodcrear.getItems().add("Bebidas");
		comtipoprodcrear.getItems().add("Carnes");
		comtipoprodcrear.getItems().add("Frutas");
		comtipoprodcrear.getItems().add("Harinas");
		comtipoprodcrear.getItems().add("Lácteos");
		comtipoprodcrear.getItems().add("Proteínas");
		comtipoprodcrear.getItems().add("Carbohidratos");
		comtipoprodcrear.getItems().add("Verduras");
		comtipoprodcrear.getItems().add("Electrónico");
		comtipoprodcrear.getItems().add("Otros");

		tipoprodmod.getItems().add("Aseo");
		tipoprodmod.getItems().add("Bebidas");
		tipoprodmod.getItems().add("Carnes");
		tipoprodmod.getItems().add("Frutas");
		tipoprodmod.getItems().add("Harinas");
		tipoprodmod.getItems().add("Lácteos");
		tipoprodmod.getItems().add("Proteínas");
		tipoprodmod.getItems().add("Carbohidratos");
		tipoprodmod.getItems().add("Verduras");
		tipoprodmod.getItems().add("Electrónico");
		tipoprodmod.getItems().add("Otros");

		tipopago.setItems(Tipodepago);
		combmodcliente.setItems(clientemod);
		combmodempl.setItems(empleadomod);
		combmodprod.setItems(productomod);
		combmodalm.setItems(almacenmod);

		voltajeprodcrear.setVisible(false);
		volatil.setVisible(false);
		voltcrear.setVisible(false);
		esvcrear.setVisible(false);
		panecheque.setVisible(false);
		paneefec.setVisible(false);
		panetar.setVisible(false);
		titulgrazu.setVisible(false);
		grazucar.setVisible(false);
		modnombrecl.setVisible(false);
		modcorreocl.setVisible(false);
		modnombrempl.setVisible(false);
		modcorreoempl.setVisible(false);
		panemodtipo.setVisible(false);
		panemodprecio.setVisible(false);
		panemodnombre.setVisible(false);
		panemodimpuesto.setVisible(false);
		panecheque.setVisible(false);
		panetar.setVisible(false);
		paneefec.setVisible(false);
		panemodgerentealm.setVisible(false);
		panemodtelefonoalm.setVisible(false);
		panemodnombrealm.setVisible(false);
		panemoddiralm.setVisible(false);

		Carrito = new ArrayList<Producto>();
		empleados = new  ArrayList<Empleado>() ;

		impuestogroup = new ToggleGroup();
		this.noaplica.setToggleGroup(impuestogroup);
		this.ocho.setToggleGroup(impuestogroup);
		this.diecinueve.setToggleGroup(impuestogroup);
		listaproductos = FXCollections.observableArrayList();




	}

	public Consumidor clien;
	@FXML
	void actioncrearcliente(ActionEvent event) {

		clien = new Consumidor();

		clien.setCedulacliente(cedulaclientecrear.getText());
		clien.setCorreo(correoclientecrear.getText());
		clien.setNombre(nombreclientecrear.getText());

		try {                      
			String SQL = "INSERT INTO cliente values (?, ?, ?); ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, clien.getCorreo());
			pst.setString(2, clien.getNombre());
			pst.setString(3, clien.getCedulacliente());

			pst.execute();

			System.out.println("se registro los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		System.out.println(clien);
		cedulaclientecrear.setText(null);
		correoclientecrear.setText(null);
		nombreclientecrear.setText(null);
	}

	public Empleado empl;


	public void anadiremp(Empleado empl) {

		empleados.add(empl);
		System.out.println(empleados);
	}

	@FXML
	void actioncrearempl(ActionEvent event) {
		empl = new Empleado();

		empl.setCedula(cedulaemplcrear.getText());
		empl.setNombre(nombreemplcrear.getText());
		empl.setCorreo(correoemplcrear.getText());
		empl.setNit(nitempresaemp.getText());

		try {                      
			String SQL = "INSERT INTO empleados values (?, ?, ?, ?); ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, empl.getNombre());
			pst.setString(2, empl.getCedula());
			pst.setString(3, empl.getCorreo());
			pst.setString(4, empl.getNit());

			pst.execute();

			System.out.println("se registro los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		anadiremp(empl);

		cedulaemplcrear.setText(null);
		correoemplcrear.setText(null);
		nombreemplcrear.setText(null);
		nitempresaemp.setText(null);


	}



	@FXML
	void addtipocrear(ActionEvent event) {
		if (comtipoprodcrear.getValue().equals("Aseo")) {
			volatil.setVisible(true);
			esvcrear.setVisible(true);
			voltajeprodcrear.setVisible(false);
			voltcrear.setVisible(false);
			titulgrazu.setVisible(false);
			grazucar.setVisible(false);

		} else if(comtipoprodcrear.getValue().equals("Electrónico")){
			voltajeprodcrear.setVisible(true);
			voltcrear.setVisible(true);
			volatil.setVisible(false);
			esvcrear.setVisible(false);
			titulgrazu.setVisible(false);
			grazucar.setVisible(false);

		}else {
			volatil.setVisible(false);
			voltcrear.setVisible(false);
			voltajeprodcrear.setVisible(false);
			esvcrear.setVisible(false);
			titulgrazu.setVisible(true);
			grazucar.setVisible(true);
		}
	}

	public void anadirprod(Producto prod) {

		Carrito.add(prod);
		System.out.println(Carrito);
	}

	int impr;


	@FXML
	void actioncrearprod(ActionEvent event) {

		if (this.impuestogroup.getSelectedToggle().equals(this.noaplica)) {
			impr = 0;
		}else if (this.impuestogroup.getSelectedToggle().equals(this.ocho)) {
			impr = 8;
		}else {
			impr = 19;
		}

		System.out.println(impr);

		if (comtipoprodcrear.getValue().equals("Aseo")) {
			Aseo prod = new Aseo(codigobarrascrear.getText(), nombreprodcrear.getText(), Double.parseDouble(precioprodcrear.getText()), impr ,comtipoprodcrear.getValue(), (rad1.isSelected() ? true : false) );
			anadirprod(prod);

			try {                      
				String SQL = "INSERT INTO producto values (?, ?, ?, ?, ?);";
				String SQL1 = "INSERT INTO aseo (esvolatil,codigobarras) values (?, ?);";


				PreparedStatement pst= con.prepareStatement(SQL);
				PreparedStatement pst1= con.prepareStatement(SQL1);

				pst.setString(1, codigobarrascrear.getText());
				pst.setString(2, comtipoprodcrear.getValue());
				pst.setInt(3, impr);
				pst.setString(4, nombreprodcrear.getText());
				pst.setString(5, precioprodcrear.getText());

				pst1.setString(1, rad1.getText());
				pst1.setString(2, codigobarrascrear.getText());

				pst.execute();
				pst1.execute();

				System.out.println("se registro los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}



		}else if(comtipoprodcrear.getValue().equals("Electrónico")) {
			Electronico prod = new Electronico(codigobarrascrear.getText(),nombreprodcrear.getText(),Double.parseDouble(precioprodcrear.getText()), impr, comtipoprodcrear.getValue(),  Integer.parseInt(voltajeprodcrear.getText()) );
			anadirprod(prod);


			try {                      
				String SQL = "INSERT INTO producto values (?, ?, ?, ?, ?);";
				String SQL1 = "INSERT INTO electronico (voltaje,codigobarras) values (?, ?);";

				PreparedStatement pst= con.prepareStatement(SQL);
				PreparedStatement pst1= con.prepareStatement(SQL1);

				pst.setString(1, codigobarrascrear.getText());
				pst.setString(2, comtipoprodcrear.getValue());
				pst.setInt(3, impr);
				pst.setString(4, nombreprodcrear.getText());
				pst.setString(5, precioprodcrear.getText());

				pst1.setString(1, voltajeprodcrear.getText());
				pst1.setString(2, codigobarrascrear.getText());

				pst.execute();
				pst1.execute();

				System.out.println("se registro los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else {
			Alimento prod = new Alimento(codigobarrascrear.getText(),nombreprodcrear.getText(),Double.parseDouble(precioprodcrear.getText()), impr, comtipoprodcrear.getValue(), Double.parseDouble(grazucar.getText()) );
			anadirprod(prod);
			try {                      
				String SQL = "INSERT INTO producto values (?, ?, ?, ?, ?);";
				String SQL1 = "INSERT INTO alimento (grazucar,codigobarras) values (?, ?);";


				PreparedStatement pst= con.prepareStatement(SQL);
				PreparedStatement pst1= con.prepareStatement(SQL1);

				pst.setString(1, codigobarrascrear.getText());
				pst.setString(2, comtipoprodcrear.getValue());
				pst.setInt(3, impr);
				pst.setString(4, nombreprodcrear.getText());
				pst.setString(5, precioprodcrear.getText());

				pst1.setString(1, grazucar.getText());
				pst1.setString(2, codigobarrascrear.getText());

				pst.execute();
				pst1.execute();

				System.out.println("se registro los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}

		codigobarrascrear.setText(null);
		nombreprodcrear.setText(null);
		precioprodcrear.setText(null);
		voltajeprodcrear.setText(null);
		grazucar.setText(null);

	}

	@FXML
	void actionmodcliente(ActionEvent event) {


		String clienmodced = (cedulamodcliente.getText());

		String Valorcambio;

		if (combmodcliente.getValue().equals("Nombre")) {

			Valorcambio = nombremodcliente.getText();

			try {                      
				String SQL = "UPDATE cliente SET nombrecliente=? WHERE cedulacliente=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, Valorcambio);
				pst.setString(2, clienmodced);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}


		}else {

			Valorcambio = correomodcliente.getText();

			try {                      
				String SQL = "UPDATE cliente SET correocliente=? WHERE cedulacliente=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, Valorcambio);
				pst.setString(2, clienmodced);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}	

		cedulamodcliente.setText(null);
		correomodcliente.setText(null);
		nombremodcliente.setText(null);

	}

	@FXML
	void actionmodempl(ActionEvent event) {

		String Valorcambio;
		String emplmodced = (cedulamodempl.getText());

		if (combmodempl.getValue().equals("Nombre")) {

			Valorcambio = nombremodempl.getText();

			try {                      
				String SQL = "UPDATE empleados SET nombreempleado=? WHERE cedulaempleado=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, Valorcambio);
				pst.setString(2, emplmodced);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else {

			Valorcambio = correomodempl.getText();

			try {                      
				String SQL = "UPDATE empleados SET correoempleado=? WHERE cedulaempleado=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, Valorcambio);
				pst.setString(2, emplmodced);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}		

		cedulamodempl.setText(null);
		correomodempl.setText(null);
		nombremodempl.setText(null);
		combmodempl.setValue(" ");
	}

	@FXML
	void addcamposcliente(ActionEvent event) {
		if (combmodcliente.getValue().equals("Nombre")) {
			modnombrecl.setVisible(true);
			modcorreocl.setVisible(false);

		}else {
			modcorreocl.setVisible(true);
			modnombrecl.setVisible(false);

		}

	}

	@FXML
	void addcamposempl(ActionEvent event) {
		if (combmodempl.getValue().equals("Nombre")) {
			modnombrempl.setVisible(true);
			modcorreoempl.setVisible(false);

		}else {
			modcorreoempl.setVisible(true);
			modnombrempl.setVisible(false);

		}
	}

	@FXML
	void addcombmodprod(ActionEvent event) {

		if (combmodprod.getValue().equals("Tipo Producto")) {
			panemodtipo.setVisible(true);
			panemodprecio.setVisible(false);
			panemodnombre.setVisible(false);
			panemodimpuesto.setVisible(false);

		}else if (combmodprod.getValue().equals("Nombre")){
			panemodtipo.setVisible(false);
			panemodprecio.setVisible(false);
			panemodnombre.setVisible(true);
			panemodimpuesto.setVisible(false);

		}else if(combmodprod.getValue().equals("Precio")) {
			panemodtipo.setVisible(false);
			panemodprecio.setVisible(true);
			panemodnombre.setVisible(false);
			panemodimpuesto.setVisible(false);
		}else if(combmodprod.getValue().equals("Impuesto")){
			panemodtipo.setVisible(false);
			panemodprecio.setVisible(false);
			panemodnombre.setVisible(false);
			panemodimpuesto.setVisible(true);    		
		}else {
			panemodtipo.setVisible(false);
			panemodprecio.setVisible(false);
			panemodnombre.setVisible(false);
			panemodimpuesto.setVisible(false);    	
		}
	}

	@FXML
	void actionmodprod(ActionEvent event) {

		String codigobarprodmod = (codigoprodmod.getText());
		String valorcambio;

		if (combmodprod.getValue().equals("Tipo Producto")) {

			valorcambio = tipoprodmod.getValue();

			try {                      
				String SQL = "UPDATE producto SET tipo=? WHERE codigobarras=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, codigobarprodmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}else if (combmodprod.getValue().equals("Nombre")){

			valorcambio = nombreprodmod.getText();

			try {                      
				String SQL = "UPDATE producto SET nombre=? WHERE codigobarras=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, codigobarprodmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else if(combmodprod.getValue().equals("Precio")) {

			valorcambio = precioprodmod.getText();

			try {                      
				String SQL = "UPDATE producto SET precio=? WHERE codigobarras=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, codigobarprodmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}else {

			valorcambio = impuestomod.getText();
			try {                      
				String SQL = "UPDATE producto SET impuesto=? WHERE codigobarras=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, codigobarprodmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}


		codigoprodmod.setText(null);
		nombreprodmod.setText(null);
		impuestomod.setText(null);
		precioprodmod.setText(null);
		combmodprod.setValue("");
	}

	Almacen alm;
	@FXML
	void actioncrearalm(ActionEvent event) {

		alm = new Almacen();

		alm.setNit(nitalmcrear.getText());
		alm.setNombre(nombrealmcrear.getText());
		alm.setNombreGerente(gerentealmcrear.getText());
		alm.setTelefono(telefonoalmcrear.getText());
		alm.setDireccion(direccionalmcrear.getText());
		alm.setEmpleado(empleados);


		try {                      
			String SQL = "INSERT INTO almacen values (?, ?, ?, ?, ?); ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, alm.getNit());
			pst.setString(2, alm.getDireccion());
			pst.setString(3, alm.getTelefono());
			pst.setString(4, alm.getNombreGerente());
			pst.setString(5, alm.getNombre());

			pst.execute();

			System.out.println("se registro los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		System.out.println(alm);



		nitalmcrear.setText(null);
		nombrealmcrear.setText(null);
		gerentealmcrear.setText(null);
		telefonoalmcrear.setText(null);		
		direccionalmcrear.setText(null);		

	}

	@FXML
	void actionconscliente(ActionEvent event) {
		String cedulacliencons = cedulaclientecons.getText();

		try {                      
			String SQL = "SELECT correocliente, nombrecliente FROM cliente WHERE cedulacliente=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, cedulacliencons);

			ResultSet Result = pst.executeQuery();
			String correocl= "";
			String nombrecl="";
			while (Result.next()) {
				correocl = Result.getString("correocliente");
				nombrecl = Result.getString("nombrecliente");
			}

			correoclientecons.setText(correocl);
			nombreclientecons.setText(nombrecl);

			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

	}

	@FXML
	void actionconsemp(ActionEvent event) {

		String cedempcons = cedulaemplcons.getText();

		try {                      
			String SQL = "SELECT correoempleado, nombreempleado FROM empleados WHERE cedulaempleado=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, cedempcons);

			ResultSet Result = pst.executeQuery();
			String correoempl= "";
			String nombreempl="";
			while (Result.next()) {
				correoempl = Result.getString("correoempleado");
				nombreempl = Result.getString("nombreempleado");
			}

			nombreemplcons.setText(correoempl);
			correoemplcons.setText(nombreempl);

			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

	}

	@FXML
	void actionconsprod(ActionEvent event) {
		String codprodcons = codigoprodcons.getText();

		try {                      
			String SQL = "SELECT tipo, nombre, precio, impuesto FROM producto WHERE codigobarras=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, codprodcons);

			ResultSet Result = pst.executeQuery();

			String tipoprod= "";
			String nombreprod="";
			String precioprod="";
			String impuestoprod="";

			while (Result.next()) {
				tipoprod = Result.getString("tipo");
				nombreprod = Result.getString("nombre");
				precioprod = Result.getString("precio");
				impuestoprod = Result.getString("impuesto");

			}

			tipoprodcons.setText(tipoprod);
			nombreprodcons.setText(nombreprod);
			precioprodcons.setText(precioprod);
			impuestoprodcons.setText(impuestoprod);

			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}
	}

	@FXML
	void actionconsalm(ActionEvent event) {
		String nitalmconsu = nitalmcons.getText();

		try {                      
			String SQL = "SELECT nombrealmacen, telefonoalmacen, gerente, direccion FROM almacen WHERE nit=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, nitalmconsu);

			ResultSet Result = pst.executeQuery();

			String nombrealm= "";
			String telefonoalm="";
			String gerentealm="";
			String direccionalm="";

			while (Result.next()) {
				nombrealm = Result.getString("nombrealmacen");
				telefonoalm = Result.getString("telefonoalmacen");
				gerentealm = Result.getString("gerente");
				direccionalm = Result.getString("direccion");

			}

			nombrealmcons.setText(nombrealm);
			telefonoalmcons.setText(telefonoalm);
			gerentealmcons.setText(gerentealm);
			direccionalmcons.setText(direccionalm);

			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

	}

	@FXML
	void actionelimfact(ActionEvent event) {
		
		
		try {       
			java.sql.CallableStatement  pst= null;

			String SQL = "call ELIMINFACT(?);";
			pst = con.prepareCall(SQL);

			pst.setString(1, codfactelim.getText());

			int filasafectada = pst.executeUpdate();

			if (filasafectada == 0 ) {
				result.setText("ERROR : Verifique los Datos Ingresados");
			}else {
				result.setText("Factura Eliminada Correctamente");

			}
System.out.println("filasafectada" + filasafectada);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}
		
	}

	@FXML
	void actionagregarprodfactura(ActionEvent event) {

		String numfact = numrecibo.getText();

		try {                      
			String SQL = "INSERT INTO descfactura(cantidad,numerorecibo,codigobarras) values (?, ?, ?);";


			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, cantidadconsprodfactura.getText());
			pst.setString(2, numfact);
			pst.setString(3, codigoprodconsfactura.getText());


			pst.execute();

			System.out.println("se registro los datos");

			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}


	}

	@FXML
	void addtipopago(ActionEvent event) {
		if (tipopago.getValue().equals(Tipodepago.get(0))) {
			panecheque.setVisible(true);
			paneefec.setVisible(false);
			panetar.setVisible(false);
		} else if(tipopago.getValue().equals(Tipodepago.get(1))){
			panetar.setVisible(true);
			panecheque.setVisible(false);
			paneefec.setVisible(false);
		}else {
			paneefec.setVisible(true);
			panecheque.setVisible(false);
			panetar.setVisible(false);
		}



	}

	@FXML
	void actionmodificaralm(ActionEvent event) {

		String nitalmmod = (nitalmod.getText());
		String valorcambio;

		if (combmodalm.getValue().equals("Nombre")) {

			valorcambio = nombrealmmod.getText();
			try {                      
				String SQL = "UPDATE almacen SET nombrealmacen=? WHERE nit=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, nitalmmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}else if (combmodalm.getValue().equals("Teléfono")){

			valorcambio = telefonoalmod.getText();

			try {                      
				String SQL = "UPDATE almacen SET telefonoalmacen=? WHERE nit=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, nitalmmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else if(combmodalm.getValue().equals("Dirección")) {

			valorcambio = direccionalmod.getText();

			try {                      
				String SQL = "UPDATE almacen SET direccion=? WHERE nit=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, nitalmmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else {

			valorcambio = gerentealmmod.getText();

			try {                      
				String SQL = "UPDATE almacen SET gerente=? WHERE nit=?;";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, valorcambio);
				pst.setString(2, nitalmmod);



				pst.execute();

				System.out.println("se modifico los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}
	}

	@FXML
	void addcombmodalm(ActionEvent event) {

		if (combmodalm.getValue().equals("Nombre")) {

			panemodgerentealm.setVisible(false);
			panemodtelefonoalm.setVisible(false);
			panemodnombrealm.setVisible(true);
			panemoddiralm.setVisible(false);

		}else if (combmodalm.getValue().equals("Teléfono")){

			panemodgerentealm.setVisible(false);
			panemodtelefonoalm.setVisible(true);
			panemodnombrealm.setVisible(false);
			panemoddiralm.setVisible(false);

		}else if(combmodalm.getValue().equals("Dirección")) {

			panemodgerentealm.setVisible(false);
			panemodtelefonoalm.setVisible(false);
			panemodnombrealm.setVisible(false);
			panemoddiralm.setVisible(true);

		}else if(combmodalm.getValue().equals("Gerente")){

			panemodgerentealm.setVisible(true);
			panemodtelefonoalm.setVisible(false);
			panemodnombrealm.setVisible(false);
			panemoddiralm.setVisible(false);

		}else {

			panemodgerentealm.setVisible(false);
			panemodtelefonoalm.setVisible(false);
			panemodnombrealm.setVisible(false);
			panemoddiralm.setVisible(false);

		}

	}

	public TipoPago pago;


	@FXML
	void actionaddtipopagofact(ActionEvent event) {

	}
	Factura fact ;
	@FXML
	void actioncrearfactura(ActionEvent event) {


		//fecha 

		Calendar fecha = new GregorianCalendar();

		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);

		String s=  año + "-" + (mes+1) + "-" + dia;




		//PRECIO
		int precio = 0;

		try {       
			java.sql.CallableStatement  pst= null;

			String SQL = "call CalculatePrice(?,?);";
			pst = con.prepareCall(SQL);

			pst.setString(1, numrecibo.getText());
			pst.registerOutParameter(2, java.sql.Types.BIGINT);

			pst.execute();

			precio = pst.getInt(2);
			System.out.println(precio);



		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}


		// Creación Factura 

		try {                      
			String SQL = "INSERT INTO factura  values (?, ?, ?, ?, ?, ?);";


			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, s);
			pst.setString(2, numrecibo.getText());
			pst.setInt(3, precio);
			pst.setString(4, tipopago.getValue());
			pst.setString(5, cedulaclienteconsfactura.getText());
			pst.setString(6, cedulaemplconsfactura.getText());

			pst.execute();

			System.out.println("se registro los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		//Tipo pago 

		if (tipopago.getValue().equals(Tipodepago.get(0))) {
			pago = new Cheque(titucheque.getText(), numref.getText(),fechacheque.getValue(), banccheque.getText() );
			System.out.println(pago);



			try {                      
				String SQL = "INSERT INTO cheque  values (?, ?, ?, ?, ?);";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, numref.getText());
				pst.setString(2, titucheque.getText());
				pst.setString(3, fechacheque.getValue()+"");
				pst.setString(4, banccheque.getText());
				pst.setString(5, numrecibo.getText());


				pst.execute();

				System.out.println("se registro los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}



		}else if(tipopago.getValue().equals(Tipodepago.get(1))) {

			pago = new Tarjeta(ntar.getText(), tipotar.getText(), titulartar.getText(), banctar.getText());
			System.out.println(pago);



			try {                      
				String SQL = "INSERT INTO tarjeta (numtarjeta,tipotarjeta,titular,banco,numerorecibo)  values (?, ?, ?, ?, ?);";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, ntar.getText());
				pst.setString(2, tipotar.getText());
				pst.setString(3, titulartar.getText());
				pst.setString(4, banctar.getText());
				pst.setString(5, numrecibo.getText());


				pst.execute();

				System.out.println("se registro los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}


		}else {
			pago = new Efectivo(Integer.parseInt(cantidadefectivo.getText()),0);
			System.out.println(pago);


			try {                      
				String SQL = "INSERT INTO efectivo (cantidadrecibida,numerorecibo)  values (?, ?);";


				PreparedStatement pst= con.prepareStatement(SQL);

				pst.setString(1, cantidadefectivo.getText());
				pst.setString(2, numrecibo.getText());


				pst.execute();

				System.out.println("se registro los datos");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}

		fact = new Factura(numrecibo.getText(), s, alm, clien, Carrito, pago, empl);


	}


	@FXML	
	void onimp(ActionEvent event) {

		String numrecibcons = considfactura.getText();
		Producto.llenarinfoprod(con, listaproductos, numrecibcons );
		System.out.println(listaproductos.toString());
		tablaprod.setItems(listaproductos);

		colcant.setCellValueFactory(new PropertyValueFactory<Producto,String>("codigobarras"));
		coldesc.setCellValueFactory(new PropertyValueFactory<Producto,String>("nombre"));
		colprecio.setCellValueFactory(new PropertyValueFactory<Producto,String>("grAzucar"));
		colimp.setCellValueFactory(new PropertyValueFactory<Producto,String>("precio"));

		//Almacen / Empleado

		try {                      
			String SQL = "SELECT * FROM ALMEMPL where numerorecibo=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, numrecibcons );

			ResultSet Result = pst.executeQuery();

			String nitalma= "";
			String direccionalma="";
			String telefonoalma="";
			String gerentealma="";
			String nombrealma="";
			String nombreemple="";
			String cedulaemple="";
			String correoemple="";

			while (Result.next()) {

				nitalma = Result.getString("nit");
				direccionalma = Result.getString("direccion");
				telefonoalma = Result.getString("telefonoalmacen");
				gerentealma = Result.getString("gerente");
				nombrealma = Result.getString("nombrealmacen");
				nombreemple = Result.getString("nombreempleado");
				cedulaemple = Result.getString("cedulaempleado");
				correoemple = Result.getString("correoempleado");				
			}

			nitfact.setText(nitalma);
			nombrefact.setText(nombrealma);
			dirfact.setText(direccionalma);
			telfact.setText(telefonoalma);
			gerentefact.setText(gerentealma);
			cedemplfact.setText(cedulaemple);
			correoemplfact.setText(correoemple);
			nombreemplfact.setText(nombreemple);

			System.out.println("se consulto los datos ");


		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		//Cliente

		try {                      
			String SQL = "SELECT * FROM clienfact where numerorecibo=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, numrecibcons );

			ResultSet Result = pst.executeQuery();

			String correoclient= "";
			String nombreclient="";
			String cedulaclient="";

			while (Result.next()) {

				correoclient = Result.getString("correocliente");
				nombreclient = Result.getString("nombrecliente");
				cedulaclient = Result.getString("cedulacliente");



			}

			correoclienfact.setText(correoclient);
			nombreclienfact.setText(nombreclient);
			cedclienfact.setText(cedulaclient);


			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		//Factura

		try {                      
			String SQL = "SELECT * FROM factura where numerorecibo=?; ";

			PreparedStatement pst= con.prepareStatement(SQL);

			pst.setString(1, numrecibcons );

			ResultSet Result = pst.executeQuery();

			String fechafactur = "";
			String valortotalfact ="";
			String tipodeepago ="";

			while (Result.next()) {

				fechafactur = Result.getString("fecha");
				valortotalfact = Result.getString("valortotal");
				tipodeepago = Result.getString("tipopago");



			}

			fechafact.setText(fechafactur);
			numfact.setText(numrecibcons);


			System.out.println("se consulto los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		//Impuestos 

		// 8%

		double imp8 = 0;

		try {       
			java.sql.CallableStatement  pst= null;

			String SQL = "call CALCULATEIMP8(?,?);";
			pst = con.prepareCall(SQL);

			pst.setString(1, considfactura.getText());
			pst.registerOutParameter(2, java.sql.Types.BIGINT);

			pst.execute();

			imp8 = pst.getInt(2);
			System.out.println(imp8);

			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			String moneyString = formatter.format(imp8);
			System.out.println(moneyString);

			impu8.setText(moneyString);


		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		// 19 %

		double imp19 = 0;

		try {       
			java.sql.CallableStatement  pst= null;

			String SQL = "call CALCULATEIMP19(?,?);";
			pst = con.prepareCall(SQL);

			pst.setString(1, considfactura.getText());
			pst.registerOutParameter(2, java.sql.Types.BIGINT);

			pst.execute();

			imp19 = pst.getInt(2);
			System.out.println(imp19);

			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			String moneyString = formatter.format(imp19);
			System.out.println(moneyString);

			impu19.setText(moneyString);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}


		//Subtotal

		double subtotalfact = 0;

		try {       
			java.sql.CallableStatement  pst= null;

			String SQL = "call CalculatePrice(?,?);";
			pst = con.prepareCall(SQL);

			pst.setString(1, considfactura.getText());
			pst.registerOutParameter(2, java.sql.Types.BIGINT);

			pst.execute();

			subtotalfact = pst.getInt(2);
			System.out.println(subtotalfact);

			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			String moneyString = formatter.format(subtotalfact);
			System.out.println(moneyString);

			subtotal.setText(moneyString);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}

		//Total

		double totalfactc = 0;

		totalfactc = (imp8+imp19+subtotalfact) ;

		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(totalfactc);
		System.out.println(moneyString);


		total.setText(moneyString);
	}

	@FXML	
	void actionlimpiar(ActionEvent event) {
		considfactura.setText(null);
		nitfact.setText(null);
		nombrefact.setText(null);
		dirfact.setText(null);
		telfact.setText(null);
		gerentefact.setText(null);
		cedemplfact.setText(null);
		correoemplfact.setText(null);
		nombreemplfact.setText(null);
		correoclienfact.setText(null);
		nombreclienfact.setText(null);
		cedclienfact.setText(null);
		fechafact.setText(null);
		numfact.setText(null);
		impu8.setText(null);
		impu19.setText(null);
		subtotal.setText(null);
		total.setText(null); 
		listaproductos = FXCollections.observableArrayList();
		tablaprod.setItems(null);
		}


}
