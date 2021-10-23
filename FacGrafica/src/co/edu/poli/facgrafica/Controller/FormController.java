package co.edu.poli.facgrafica.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import Conector.ConnectionProyect;
import co.edu.poli.facgrafica.model.Alimento;
import co.edu.poli.facgrafica.model.Empleado;
import co.edu.poli.facgrafica.model.Aseo;
import co.edu.poli.facgrafica.model.Cheque;
import co.edu.poli.facgrafica.model.Consumidor;
import co.edu.poli.facgrafica.model.Efectivo;
import co.edu.poli.facgrafica.model.Electronico;
import co.edu.poli.facgrafica.model.Factura;
import co.edu.poli.facgrafica.model.Pago;
import co.edu.poli.facgrafica.model.Producto;
import co.edu.poli.facgrafica.model.Tarjeta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox; 



public class FormController {

    @FXML
    private TitledPane bsuc;

    @FXML
    private Button button1;

    @FXML
    private TextField Correo;


    @FXML
    private TextField Contrasena;

    @FXML
    private TextField Nombre;

    @FXML
    private TextField Cedula;

    @FXML
    private Button button2;

    @FXML
    private ComboBox<String> tipo;

    @FXML
    private TextField codigo;

    @FXML
    private TextField nombre;

    @FXML
    private TextField precio;

    @FXML
    private Label esv;

    @FXML
    private Label v;

    @FXML
    private TextField voltaje;

    @FXML
    private HBox volatil;

    @FXML
    private RadioButton rad1;

    @FXML
    private ToggleGroup grupovolatil;

    @FXML
    private RadioButton rad2;

    @FXML
    private TextField cantidad;
    
    @FXML
    private ToggleGroup impuestogroup;

    @FXML
    private RadioButton noaplica;

    @FXML
    private RadioButton ocho;

    @FXML
    private RadioButton diecinueve;

    @FXML
    private ComboBox<String> tipopago;

    @FXML
    private Button button4;

    @FXML
    private GridPane paneefec;

    @FXML
    private TextField numref11;

    @FXML
    private TextField canbi;

    @FXML
    private TextField canmo;

    @FXML
    private GridPane panetar;

    @FXML
    private TextField numref1;

    @FXML
    private TextField titu;

    @FXML
    private TextField banc;

    @FXML
    private TextField tipotar;

    @FXML
    private TextField dec;

    @FXML
    private TextField ntar;

    @FXML
    private TextField fechacad;

    @FXML
    private GridPane panecheque;

    @FXML
    private TextField numref;

    @FXML
    private TextField banc1;

    @FXML
    private DatePicker dat;

    @FXML
    private TextField pad;

    @FXML
    private TextField cantlet;

    @FXML
    private TextField firm;

    @FXML
    private TitledPane bcl;

    @FXML
    private Button button3;

    @FXML
    private TextField nombrecliente;

    @FXML
    private TextField cedulaclien;

    @FXML
    private TextField correoclien;

    @FXML
    private TextField puntos;

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
    
    ConnectionProyect conexion = new ConnectionProyect(); //GENEREA LA CONECCION A LA BD
    Connection con = conexion.conectar();
    

	public Empleado Emp;
	@FXML
	void enviar1(ActionEvent event) {
		Emp = new Empleado();
		
		Emp.setCorreo(Correo.getText());
		Emp.setContraseña(Contrasena.getText());
		Emp.setNombre(Nombre.getText());
		Emp.setCedula(Cedula.getText());



		System.out.println(Emp);
		Emp.setCorreo(Correo.getText());
		Contrasena.setText(null);
		Cedula.setText(null);
		Nombre.setText(null);

		
		//INERTAR DATOS EN LA BD
		try {                      //
			String SQL = "INSERT INTO empleados values (?, ?, ?, ?); ";
			
			PreparedStatement pst= con.prepareStatement(SQL);
			
			pst.setString(1, Emp.getCorreo());
			pst.setString(2, Emp.getContraseña());
			pst.setString(3, Emp.getNombre());
			pst.setString(4, Emp.getCedula());
			
			
			pst.execute();
			
			System.out.println("se registro los datos");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}
		
	}
		

	Tooltip tt1;
	Tooltip tt2;

	ObservableList<String> Tipodepago = FXCollections.observableArrayList("Cheque","Tarjeta","Efectivo"); 

int impr;

	public void initialize() {
		


    	tipo.getItems().add("Aseo");
    	tipo.getItems().add("Bebidas");
    	tipo.getItems().add("Carnes");
    	tipo.getItems().add("Frutas");
    	tipo.getItems().add("Harinas");
    	tipo.getItems().add("Lácteos");
    	tipo.getItems().add("Proteínas");
    	tipo.getItems().add("Proteínas");
    	tipo.getItems().add("Verduras");
    	tipo.getItems().add("Electrónico");
    	tipo.getItems().add("Otros");
    	
		tipopago.setItems(Tipodepago);

		volatil.setVisible(false);
		voltaje.setVisible(false);
		v.setVisible(false);
		esv.setVisible(false);
		panecheque.setVisible(false);
		paneefec.setVisible(false);
		panetar.setVisible(false);

		Carrito = new ArrayList<Producto>();
		
		 impuestogroup = new ToggleGroup();
		this.noaplica.setToggleGroup(impuestogroup);
		this.ocho.setToggleGroup(impuestogroup);
		this.diecinueve.setToggleGroup(impuestogroup);
		



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
	void addtipo(ActionEvent event) {
		if (tipo.getValue().equals("Aseo")) {
			volatil.setVisible(true);
			esv.setVisible(true);
			voltaje.setVisible(false);
			v.setVisible(false);

		} else if(tipo.getValue().equals("Electrónico")){
			voltaje.setVisible(true);
			v.setVisible(true);
			volatil.setVisible(false);
			esv.setVisible(false);


		}else {
			volatil.setVisible(false);
			v.setVisible(false);
			voltaje.setVisible(false);
			esv.setVisible(false);

		}



	}

	public ArrayList<Producto>  Carrito ;

	public void anadirprod(Producto prod) {

		Carrito.add(prod);
		System.out.println(Carrito);
	}

	@FXML
	void send2(ActionEvent event) {
		if (this.impuestogroup.getSelectedToggle().equals(this.noaplica)) {
			impr = 0;
		}else if (this.impuestogroup.getSelectedToggle().equals(this.ocho)) {
			impr = 8;
		}else {
			impr = 19;
		}
		
		System.out.println(impr);
		if (tipo.getValue().equals("Aseo")) {
			Aseo prod = new Aseo(codigo.getText(),nombre.getText(),Double.parseDouble(precio.getText()), Double.parseDouble(cantidad.getText()), impr ,tipo.getValue(), (rad1.isSelected() ? true : false) );
			anadirprod(prod);
			
			//INERTAR DATOS EN LA BD
			try {                      //
				String SQL = "INSERT INTO aseo values (?, ?, ?); INSERT INTO aseo values (?, ?, ?);";
				
				
				PreparedStatement pst= con.prepareStatement(SQL);
				
				/*pst.setString(1, tienda.getNit());
				pst.setString(2, tienda.getDireccion());
				pst.setString(3, tienda.getTelefono());*/

				
				
				pst.execute();
				
				System.out.println("se registro los datos");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
			
		}else if(tipo.getValue().equals("Electrónico")) {
			Electronico prod = new Electronico(codigo.getText(),nombre.getText(),Double.parseDouble(precio.getText()), Double.parseDouble(cantidad.getText()), impr, tipo.getValue(),  Integer.parseInt(voltaje.getText()) );
			anadirprod(prod);


		}else {
			Alimento prod = new Alimento(codigo.getText(),nombre.getText(),Double.parseDouble(precio.getText()),  Double.parseDouble(cantidad.getText()), impr,tipo.getValue(), 0 );
			anadirprod(prod);
		}

		codigo.setText(null);
		nombre.setText(null);
		precio.setText(null);
		cantidad.setText(null);
		voltaje.setText(null);
		

		
	}

	public Pago pago;

	@FXML 
	void send4(ActionEvent event) {


		if (tipopago.getValue().equals(Tipodepago.get(0))) {
			pago = new Cheque(numref.getText(), banc.getText() , dat.getValue(), pad.getText(), cantlet.getText(), firm.getText());
			System.out.println(pago);
			
			//INERTAR DATOS EN LA BD//
			try {                  
				String SQL = "INSERT INTO formapago values (?, ?);";
				
				
				PreparedStatement pst= con.prepareStatement(SQL);
				
				pst.setString(1, cantlet.getText());
				pst.setString(2, numref.getText());
			
				pst.execute();
				
				System.out.println("se registro los datos");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else if(tipopago.getValue().equals(Tipodepago.get(1))) {
			pago = new Tarjeta(numref1.getText(),titu.getText(),ntar.getText(), banc.getText(), tipotar.getText(),dec.getText(), fechacad.getText());
			System.out.println(pago);
			
			//INERTAR DATOS EN LA BD
			try {                      //
				String SQL = "INSERT INTO formapago values (?, ?);";
				String SQL1 = "INSERT INTO tarjeta values (?, ?, ?, ?, ?);";
				
				
				PreparedStatement pst= con.prepareStatement(SQL);
				PreparedStatement pst1= con.prepareStatement(SQL1);
				
				pst.setString(1, dec.getText());
				pst.setString(2, numref1.getText());
				
				pst1.setString(1, ntar.getText());
				pst1.setString(2, tipotar.getText());
				pst1.setString(3, titu.getText());
				pst1.setString(4, banc.getText());
				pst1.setString(5, numref1.getText());
			
				pst.execute();
				pst1.execute();
				
				System.out.println("se registro los datos");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}

		}else {
			pago = new Efectivo(numref11.getText(), Integer.parseInt(canbi.getText()), Integer.parseInt(canmo.getText()) );
			System.out.println(pago);

			//INERTAR DATOS EN LA BD
			try {                      
				String SQL = "INSERT INTO formapago values (?, ?);";
				String SQL1 = "INSERT INTO efectivo values (?, ?, ?);";
				
				
				PreparedStatement pst= con.prepareStatement(SQL);
				PreparedStatement pst1= con.prepareStatement(SQL1);
				
				pst.setString(1, canbi.getText());
				pst.setString(2, numref11.getText());
				
				pst1.setString(1, canbi.getText());
				pst1.setString(2, canmo.getText());
				pst1.setString(3, numref11.getText());
				
				pst.execute();
				pst1.execute();
				
				System.out.println("se registro los datos");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
				System.out.println("error de registro");
			}
		}

		numref.setText(null);
		banc.setText(null);
		pad	.setText(null);
		cantlet	.setText(null);
		firm.setText(null);
		numref1.setText(null);
		titu.setText(null);
		ntar.setText(null);
		tipotar.setText(null);
		dec.setText(null);
		fechacad.setText(null);
		numref11.setText(null);
		canbi.setText(null);
		canmo.setText(null);


	}


	public Consumidor client;

	@FXML
	void send3(ActionEvent event) {
		client = new Consumidor(nombrecliente.getText(), correoclien.getText(), puntos.getText(), cedulaclien.getText());
		System.out.println(client);

		try {                      
			String SQL = "INSERT INTO CLIENTE values (?, ?, ?, ?);";
			
			
			PreparedStatement pst= con.prepareStatement(SQL);
		
			
			pst.setString(1, cedulaclien.getText());
			pst.setString(2, correoclien.getText());
			pst.setString(3, nombrecliente.getText());
			pst.setString(4, puntos.getText());
			
			pst.execute();
			
			
			System.out.println("se registro los datos");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
			System.out.println("error de registro");
		}
		
		nombrecliente.setText(null);
		correoclien.setText(null);
		puntos.setText(null);
		cedulaclien.setText(null);

	}



	@FXML
	void onimp(ActionEvent event) {
		impalm.setText(Emp.getNombre() + "\n" + Emp.getCorreo() + "\n" + Emp.getCedula() + "\n" + "NIT. " + "89847423-1" + "\n" + "Tel: " + "74387392" + "\n");

		Calendar fecha = new GregorianCalendar();

		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);

		String s=  dia + " / " + (mes+1) + " / " + año;

		textfe.setText(""+s);

		Factura facfinal = new Factura(1, s , Emp , client, Carrito,  pago );

		System.out.println(facfinal.toString());
		improd.setText(facfinal.toString());

		total.setText("TOTAL                    $" + facfinal.calcularTotal());
		
			}



}





