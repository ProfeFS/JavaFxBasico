package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EnableButtonBindingController {
	
	@FXML
	private TextField txtFName;
	@FXML
	private TextField txtFSurname;
	@FXML
	private Label lblName;
	@FXML
	private Button btnSave;
	
	@FXML
	public void initialize() {
		btnSave.disableProperty().bind(txtFName.textProperty().isEmpty().or(txtFSurname.textProperty().isEmpty()));
	}
	
	
	

}
