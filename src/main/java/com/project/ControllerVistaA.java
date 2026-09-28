package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerVistaA {

    @FXML
    private TextField txtNom;

    @FXML
    private TextField txtEdad;

    @FXML
    private Button btnEnviar;

    @FXML
    public void initialize() {
        // El botón empieza deshabilitado
        btnEnviar.setDisable(true);

        // Habilitar solo cuando ambos campos tengan texto
        txtNom.textProperty().addListener((obs, oldVal, newVal) -> validarCamps());
        txtEdad.textProperty().addListener((obs, oldVal, newVal) -> validarCamps());
    }

    private void validarCamps() {
        boolean nomOmplert = !txtNom.getText().trim().isEmpty();
        boolean edatOmplerta = !txtEdad.getText().trim().isEmpty();

        btnEnviar.setDisable(!(nomOmplert && edatOmplerta));
    }

    @FXML
    public void canviarAEnviar() {
        // Guardar valores en las variables estáticas de Main
        Main.nom = txtNom.getText().trim();
        Main.edat = txtEdad.getText().trim();

        // Cambiar a la Vista B usando UtilsViews (solo el nombre sin extensión)
        UtilsViews.setView("VistaB");
    }
}