package fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.net.URL;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(new URL("file:///C:\\Users\\Valerian\\OneDrive\\Desktop\\STEP IT\\Java\\Lectia 25\\Maven, Java FXML, Employee Manager\\src\\fxml\\manager.fxml"));
        AnchorPane pane = loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
