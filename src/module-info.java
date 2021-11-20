module ProyectoBDFactura {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	requires java.sql;
	requires mysql.connector.java;

	opens Controller to javafx.graphics, javafx.fxml;
	opens Model to javafx.graphics, javafx.fxml;
	opens View to javafx.graphics, javafx.fxml;

}
