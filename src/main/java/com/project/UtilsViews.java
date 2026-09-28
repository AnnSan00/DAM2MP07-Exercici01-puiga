package com.project;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UtilsViews {

    public static Stage parentStage;

    public static void setView(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(UtilsViews.class.getResource("/assets/" + fxml + ".fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            parentStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}