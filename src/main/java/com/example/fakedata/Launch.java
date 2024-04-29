package com.example.fakedata;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launch extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launch.class.getResource("menu.fxml"));
        MainController mainController = fxmlLoader.getController();
        Scene scene = new Scene(fxmlLoader.load(), 700, 500 );
        stage.setTitle("Mamkin hacker");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}