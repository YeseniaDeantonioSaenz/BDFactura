module FacGrafica {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	requires java.sql;

	opens co.edu.poli.facgrafica.Controller to javafx.graphics, javafx.fxml;
	opens co.edu.poli.facgrafica.model to javafx.graphics, javafx.fxml;
	opens co.edu.poli.facgrafica.view to javafx.graphics, javafx.fxml;

}
