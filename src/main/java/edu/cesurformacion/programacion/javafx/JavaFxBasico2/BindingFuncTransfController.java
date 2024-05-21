package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import java.text.NumberFormat;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingFuncTransfController {
	@FXML
    private TextField txtFnumber;

    @FXML
    private Label lblFormatted;

    @FXML
    public void initialize() {
        // Crear un binding para formatear el número como valor monetario
        StringBinding formattedString = Bindings.createStringBinding(() -> {
            try {
                double value = Double.parseDouble(txtFnumber.getText());
                return NumberFormat.getCurrencyInstance().format(value);
            } catch (NumberFormatException e) {
                return "Invalid number";
            }
        }, txtFnumber.textProperty());

        // Vincular el Label al binding formateado
        lblFormatted.textProperty().bind(formattedString);
    }

}
