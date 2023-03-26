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
    public TextField txtField2;

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///C:\\Users\\Valerian\\OneDrive\\Desktop\\STEP IT\\Java\\Lectia 24\\FXML Homework\\src\\fxml\\main.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onPlus(ActionEvent actionEvent) {
        if (!(txtField.getText().isEmpty() || txtField2.getText().isEmpty())) {
            txtField.setText(String.valueOf(Double.valueOf(txtField.getText()) + Double.valueOf(txtField2.getText())));
            txtField2.setText("");
        } else {
            System.out.println(" Introduceti toate datele necesare!");
        }
    }

    public void onSubstract(ActionEvent actionEvent) {
        if (!(txtField.getText().isEmpty() || txtField2.getText().isEmpty())) {
            txtField.setText(String.valueOf(Double.valueOf(txtField.getText()) - Double.valueOf(txtField2.getText())) );
            txtField2.setText("");
        } else {
            System.out.println(" Introduceti toate datele necesare!");
        }
    }

    public void onMultiply(ActionEvent actionEvent) {
        if (!(txtField.getText().isEmpty() || txtField2.getText().isEmpty())) {
            txtField.setText(String.valueOf(Double.valueOf(txtField.getText()) * Double.valueOf(txtField2.getText())) );
            txtField2.setText("");
        } else {
            System.out.println(" Introduceti toate datele necesare!");
        }
    }

    public void onDivide(ActionEvent actionEvent) {
        if (txtField.getText().equalsIgnoreCase("0") && txtField2.getText().equalsIgnoreCase("0")) {
            System.out.println(" 0/0 este nedefinit!");
        }

        else if (txtField2.getText().equalsIgnoreCase("0")) {
            System.out.println(" Nu este posibila impartirea la 0!");
        }


        else if (!(txtField.getText().isEmpty() || txtField2.getText().isEmpty())){
            txtField.setText(String.valueOf(Double.valueOf(txtField.getText()) / Double.valueOf(txtField2.getText())) );
            txtField2.setText("");
        }

        else {
            System.out.println(" Introduceti toate datele necesare!");
        }
    }

}
