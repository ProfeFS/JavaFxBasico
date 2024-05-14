package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Vista1Controller {
	
	@FXML
	private TextField txtUserName;
	private Vista2Controller vista2Controller;
	
	public void loggin(ActionEvent e) {
	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista2.fxml"));
			Parent root = loader.load();
			vista2Controller = loader.getController();
			vista2Controller.setLblUserName(txtUserName.getText());
			
			Node sourceNode = (Node) e.getSource(); // Obtén el nodo que originó el evento			
			Scene scene = sourceNode.getScene(); //obtenemos la escena
			Stage stage = (Stage) scene.getWindow(); //obtenemos el stage
			scene.setRoot(root);
			
			//Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			//Scene scene = new Scene(root);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
	}
	

}
