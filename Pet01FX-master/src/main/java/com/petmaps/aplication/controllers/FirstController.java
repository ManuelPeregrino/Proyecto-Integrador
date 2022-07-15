package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FirstController {

    @FXML
    private ImageView M;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnMaps;


    @FXML
    private Button btnServicios;

    @FXML
    private Button btnSobreNosotros;

    @FXML
    private Button btnUneteAs;

    @FXML
    void btnInicioOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnMapsOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnNosotrosOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnServiciosOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnUneteAsOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("user-view", "Change user - controll");
    }

}

//