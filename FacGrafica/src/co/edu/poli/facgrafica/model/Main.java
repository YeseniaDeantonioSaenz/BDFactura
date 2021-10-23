package co.edu.poli.facgrafica.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Accordion root = (Accordion) FXMLLoader.load(getClass().getResource("/co/edu/poli/facgrafica/view/form.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/co/edu/poli/facgrafica/view/styles.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	
	
	try {
		/*Class.forName("com.mysql.jdbc.Driver");*/
		DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_bd", "root", "Ysql");
	
		System.out.println("Conexion hecha");
		
	} /*catch (ClassNotFoundException e){
		System.out.println("Error al cargar el controlador");
		
	}*/catch (SQLException e) {
		System.out.println("Error al conectar");
		}
}
}
