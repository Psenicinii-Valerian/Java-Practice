package com.step.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(new URL("file:///C:\\Users\\Valerian\\OneDrive\\Desktop\\STEP IT\\Java\\Lectia 26\\Maven Homework\\fx-maven\\src\\main\\resources\\fxml\\calculator.fxml"));
        AnchorPane pane = loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
