package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerVistaB {

    @FXML
    private Label lblResultat;

    @FXML
    public void initialize() {
        // Lee las variables estáticas de Main
        lblResultat.setText("Hola " + Main.nom + ", tens " + Main.edat + " anys!");
    }

    @FXML
    public void tornar() {
        // Vuelve a la primera vista
        UtilsViews.setView("VistaA");
    }
}