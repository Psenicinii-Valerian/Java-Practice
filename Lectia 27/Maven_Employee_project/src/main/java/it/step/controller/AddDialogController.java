package it.step.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class AddDialogController {
    public TextField nameTxtField;
    public DatePicker birthdatePicker;
    public void onAdd(ActionEvent event) {

        String name = nameTxtField.getText();
        LocalDate birthdate = birthdatePicker.getValue();
        if (!name.isEmpty() && birthdate != null) {
            // save the data
            // close
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
        }
    }

}
