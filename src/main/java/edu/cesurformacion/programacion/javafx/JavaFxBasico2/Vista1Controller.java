package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Vista1Controller {

	@FXML
	private TextField txtUserName;
	private Vista2Controller vista2Controller;
	private List<String> userNames;

	public Vista1Controller() {
		userNames = Arrays.asList("user1", "user2", "user3", "gynny");
	}

	public void loggin(ActionEvent e) {
		
		if(!isUserNameValid()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error de Inicio de Sesión");
			alert.setHeaderText(null);
			alert.setContentText("El nombre de usuario ingresado no existe.");
			alert.showAndWait();
			
			return;
		}

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista2.fxml"));
			Parent root = loader.load();
			vista2Controller = loader.getController();
			vista2Controller.setLblUserName(txtUserName.getText());

			Node sourceNode = (Node) e.getSource(); // Obtén el nodo que originó el evento
			Scene scene = sourceNode.getScene(); // obtenemos la escena
			Stage stage = (Stage) scene.getWindow(); // obtenemos el stage
			scene.setRoot(root);

			// Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			// Scene scene = new Scene(root);

		} catch (IOException e1) {
			System.out.println("error al abrir Vista2" + e1.getMessage());
			// e1.printStackTrace();
		}
	}
	
	private boolean isUserNameValid() {		
		return userNames.stream().anyMatch(u -> u.equals(txtUserName.getText()));
	}

}
