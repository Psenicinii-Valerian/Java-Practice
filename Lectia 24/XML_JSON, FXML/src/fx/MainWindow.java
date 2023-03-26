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

    public String operationCheck(String operation) {

        if (! (firstNumber.getText().isEmpty() || secondNumber.getText().isEmpty())) {
            String first = firstNumber.getText();
            String second = secondNumber.getText();

                switch (operation) {
                    case "+" : result.setText(String.valueOf(Double.valueOf(first) + Double.valueOf(second))); break;
                    case "-" : result.setText(String.valueOf(Double.valueOf(first) - Double.valueOf(second))); break;
                    case "*" : result.setText(String.valueOf(Double.valueOf(first) * Double.valueOf(second))); break;
                    case "/" : {
                        if ( firstNumber.getText().equalsIgnoreCase("0") && secondNumber.getText().equalsIgnoreCase("0") ){
                            System.out.println(" 0/0 este nedefinit!");
                        }

                        else if ( secondNumber.getText().equalsIgnoreCase("0")){
                            System.out.println(" Nu este posibila impartirea la 0!");
                        }

                        else {
                            result.setText(String.valueOf(Double.valueOf(first) / Double.valueOf(second)));
                        }

                    } break;
                }

            firstNumber.setText(result.getText());
            secondNumber.clear();

        } else {
            System.out.println(" Introduceti toate datele necesare!");
        }

         return result.getText();
    }

    public void start(Stage primaryStage) throws Exception {


        HBox firstNumberBox = new HBox();
        firstNumber = new TextField();
        firstNumberBox.getChildren().add(firstNumber);

        HBox SimpleOperationsBox = new HBox();
        SimpleOperationsBox.setSpacing(10);

        HBox AdvancedOperationsBox = new HBox();
        AdvancedOperationsBox.setSpacing(14);

        Button plusButton = new Button("+");
        Button substract = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");


        plusButton.setOnAction(event -> operationCheck("+") );
        substract.setOnAction(event -> operationCheck("-") );
        multiply.setOnAction(event -> operationCheck("*") );
        divide.setOnAction( event -> operationCheck("/") );

        SimpleOperationsBox.getChildren().add(plusButton);
        SimpleOperationsBox.getChildren().add(substract);
        AdvancedOperationsBox.getChildren().add(multiply);
        AdvancedOperationsBox.getChildren().add(divide);


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
        vertical.getChildren().add(SimpleOperationsBox);
        vertical.getChildren().add(AdvancedOperationsBox);
        vertical.getChildren().add(secondNumberBox);
       // vertical.getChildren().add(resultBox);
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
