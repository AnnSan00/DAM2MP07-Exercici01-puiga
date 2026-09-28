package com.project;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static String nom = "";
    public static String edat = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        UtilsViews.parentStage = primaryStage;
        UtilsViews.setView("VistaA");
        
        primaryStage.setTitle("Exercici 01");

        // Configuramos el tamaño directamente en el Stage
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}