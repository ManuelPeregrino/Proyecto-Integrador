module com.petmaps.aplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.petmaps.aplication to javafx.fxml;
    exports com.petmaps.aplication;
    exports com.petmaps.aplication.models;
    opens com.petmaps.aplication.models to javafx.fxml;
    exports com.petmaps.aplication.controllers;
    opens com.petmaps.aplication.controllers to javafx.fxml;
}