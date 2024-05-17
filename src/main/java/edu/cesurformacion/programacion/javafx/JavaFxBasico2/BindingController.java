package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingController {
	@FXML
	private TextField txtName;
	@FXML
	private Label lblName;
	@FXML
	private TextField txtName2;
	@FXML
	private Label lblName2;

	private StringProperty name;

	@FXML
	public void initialize() {
		name = new SimpleStringProperty();
		
		// Bindings
		//lblName.textProperty().bind(txtName.textProperty());
		//name.bind(lblName.textProperty());
		name.bind(lblName2.textProperty());

		// Listener
		name.addListener((observable, oldValue, newValue) -> { 
		    System.out.println("Name changed from " + oldValue + " to " + newValue); 
		});
		

		
		 txtName2.textProperty().addListener((observable, oldValue, newValue) -> {
	            lblName2.setText(newValue);
	        });

	}

}
