package com.example.labomba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class bombaMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(bombaMain.class.getResource("bomba.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("bombaCSS.css").toExternalForm());
       //String css = this.getClass().getResource("bombaCSS.css").toExternalForm();
       //scene.getStylesheets().add(css);
        stage.setTitle("Capum!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}