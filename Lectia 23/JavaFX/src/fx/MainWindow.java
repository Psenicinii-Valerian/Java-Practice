package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainWindow extends Application {

    private TextField firstNumber;
    private TextField secondNumber;
    private Label result;

    public void start(Stage primaryStage) throws Exception {


        HBox firstNumberBox = new HBox();
        firstNumber = new TextField();
        firstNumberBox.getChildren().add(firstNumber);

        HBox operationsBox = new HBox();
        operationsBox.setSpacing(10);

        Button plusButton = new Button("+");
        Button substract = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");

        plusButton.setOnAction(event -> {
            String first = firstNumber.getText();
            String second = secondNumber.getText();
            result.setText(String.valueOf(Double.valueOf(first) + Double.valueOf(second)));
        });

        substract.setOnAction(event -> {
            String first = firstNumber.getText();
            String second = secondNumber.getText();
            result.setText(String.valueOf(Double.valueOf(first) - Double.valueOf(second)));
        });

        multiply.setOnAction(event -> {
            String first = firstNumber.getText();
            String second = secondNumber.getText();
            result.setText(String.valueOf(Double.valueOf(first) * Double.valueOf(second)));
        });

        divide.setOnAction(event -> {
            String first = firstNumber.getText();
            String second = secondNumber.getText();
            result.setText(String.valueOf(Double.valueOf(first) / Double.valueOf(second)));
        });

        operationsBox.getChildren().add(plusButton);
        operationsBox.getChildren().add(substract);
        operationsBox.getChildren().add(multiply);
        operationsBox.getChildren().add(divide);


        HBox boxButtons = new HBox();
        Button button = new Button("Result");
        button.setOnAction((ActionEvent event) -> {
            String value = firstNumber.getText();
            System.out.println("Value saved: " + value);
        });
        boxButtons.getChildren().add(button);

        HBox secondNumberBox = new HBox();
        secondNumber = new TextField();
        secondNumberBox.getChildren().add(secondNumber);

        HBox resultBox = new HBox();
        result = new Label("Result");
        resultBox.getChildren().add(result);

        VBox vertical = new VBox();
        vertical.getChildren().add(firstNumberBox);
        vertical.getChildren().add(operationsBox);
        vertical.getChildren().add(secondNumberBox);
        vertical.getChildren().add(resultBox);
        vertical.setSpacing(10);

        Scene scene = new Scene(vertical, 400, 200);
//      scene.setCursor(Cursor.OPEN_HAND);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.centerOnScreen();

        primaryStage.setOnCloseRequest((WindowEvent event) -> {
            System.out.println(" Closing app!");
            }
        );

        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            System.out.println(" Key: " + event.toString());

            if (event.getCode() == KeyCode.ESCAPE) {
                primaryStage.close();
            }
        });

    }

    public static void main(String... args) {
        launch(args);
    }
}
