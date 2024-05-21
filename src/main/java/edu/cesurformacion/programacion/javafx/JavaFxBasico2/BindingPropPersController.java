package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingPropPersController {
	
	@FXML
	Label lblName;
	@FXML
	TextField txtName;
	
	private Person person;
	
	public BindingPropPersController() {
		person = new Person();
		person.setName("Gynny");
		System.out.println(person.getName());
	}
	
	@FXML
	public void initialize() {
		txtName.textProperty().bindBidirectional(person.nameProperty());
		//person.nameProperty().bind(txtName.textProperty());
		lblName.textProperty().bind(person.nameProperty());
		if(person.getName().contentEquals("")) {
			System.out.println("name es vacío");			
		}else {
			System.out.println(" esto es l que hay en person.getName: ------->" + person.getName() +  " <---");
		}
		
	}
}
