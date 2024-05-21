package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;

import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingTransfController {
    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAge;

    @FXML
    private Label lblName;

    @FXML
    private Label lblAge;

    @FXML
    private Button btnChangeAge;

    private Person person;

    public BindingTransfController() {
        // Instanciar la persona en el constructor
        person = new Person();
        person.setName("Anna");
        person.setAge(4);
    }

    @FXML
    public void initialize() {
        // Binding bidireccional para el nombre
        txtName.textProperty().bindBidirectional(person.nameProperty());

        // Mostrar el valor inicial en el Label
        lblName.textProperty().bind(person.nameProperty());

        // Binding unidireccional para la edad
        lblAge.textProperty().bind(Bindings.convert(person.ageProperty()));

        // Validation Listener para validar y actualizar la edad
        txtAge.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()) {
                person.setAge(0);
            } else {
                try {
                    int age = Integer.parseInt(newValue);
                    person.setAge(age);
                } catch (NumberFormatException e) {
                    txtAge.setText(oldValue);
                }
            }
        });

//        // Change Listener para actualizar la etiqueta del nombre
//        txtName.textProperty().addListener((observable, oldValue, newValue) -> {
//            lblName.setText(newValue);
//        });
//
//        // Cambiar la edad desde el código
//        btnChangeAge.setOnAction(event -> person.setAge(25));
    }
}
