package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;


public class ControlesController {

	@FXML
	private Label lblFood;
	@FXML
	private RadioButton rBtnArepas, rBtnPizza, rBtnPasta;
	@FXML
	private ToggleGroup comidas;

	public void showFoodSelected(ActionEvent event) {

		if (rBtnArepas.isSelected()) {
			lblFood.setText(rBtnArepas.getText());
		} else if (rBtnPizza.isSelected()) {
			lblFood.setText(rBtnPizza.getText());
		} else if (rBtnPasta.isSelected()) {
			lblFood.setText(rBtnPasta.getText());
		}

	}

	@FXML
	public void initialize() {
		
		rBtnArepas.setUserData("Arepasssss");
		rBtnPizza.setUserData("Pizzassss");
		rBtnPasta.setUserData("Pastassss");

		comidas.selectedToggleProperty()
				.addListener((ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) -> {
					if (comidas.getSelectedToggle() != null) {
						lblFood.setText(comidas.getSelectedToggle().getUserData().toString());
					}
				});

	}

}
