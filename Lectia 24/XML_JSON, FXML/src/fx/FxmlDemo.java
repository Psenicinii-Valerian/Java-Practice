package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;

public class FxmlDemo extends Application {

    public TextField txtField;

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///C:\\Users\\Valerian\\OneDrive\\Desktop\\STEP IT\\Java\\Lectia 24\\XML_JSON, FXML\\src\\fxml\\main.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onPlus(ActionEvent actionEvent) {
        if (txtField!=null) {
            System.out.println("Plus pressed: " + txtField.getText());
        }
    }
}
