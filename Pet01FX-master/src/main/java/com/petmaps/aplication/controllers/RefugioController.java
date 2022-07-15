package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class RefugioController {

    @FXML
    private Button btnAgregarDAtos;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtCapacidad;

    @FXML
    private TextField txtNombreRefugio;

    @FXML
    private TextField txtRFC;

    @FXML
    private TextField txtUbicacion;

    @FXML
    void btnAgregarDAtosOnMouseClicked(MouseEvent event) {
        String NombreRefugio=(txtNombreRefugio.getText());
        String RFC=(txtRFC.getText());
        String Ubucacion=(txtUbicacion.getText());
        String Capacida=( txtCapacidad.getText());


    }

    @FXML
    void btnRegresarOnMouseCliked(MouseEvent event) {
        HelloApplication.setFXML("First-view", "First view - controll");

    }

}
