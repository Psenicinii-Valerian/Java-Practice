package it.step;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Forma de initializare pe lung
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/manager.fxml"));
        // AnchorPane pane = loader.load();
        // loader.getController();
        // Scene scene = new Scene(pane);
        // primaryStage.setScene(scene);
        // primaryStage.show();

        AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/manager.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}