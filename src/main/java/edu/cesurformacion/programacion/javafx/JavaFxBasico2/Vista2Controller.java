package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Vista2Controller {
	@FXML
	private Label lblUserName;
	
	public void goToVista1(ActionEvent e) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista1.fxml"));
			Parent root = loader.load();
			
			Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}

	public void setLblUserName(String text) {
		lblUserName.setText(text);
		
	}

}
