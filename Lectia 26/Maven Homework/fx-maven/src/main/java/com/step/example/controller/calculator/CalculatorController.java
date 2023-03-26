package com.step.example.controller.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CalculatorController {

    public TextField txtField;
    public TextField txtField2;

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
