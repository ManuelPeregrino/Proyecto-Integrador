package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import com.petmaps.aplication.models.ValidarUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private Button btnIniciar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnIniciaOnMouseClicked(MouseEvent event) {
        ValidarUser user = new ValidarUser();
        if(user.autenticarUsers(txtUsername.getText(), txtPassword.getText())){
            HelloApplication.setFXML("First-view", "Home - apĺication");
            /*Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login- Info");
            alert.setContentText("Bienvenido al sistema");
            alert.showAndWait();*/
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("Error User does not exist");
            alert.showAndWait();
        }

    }

    @FXML
    void btnSAlirOnMouseClicked(MouseEvent event) {
        System.exit(1);

    }

}
