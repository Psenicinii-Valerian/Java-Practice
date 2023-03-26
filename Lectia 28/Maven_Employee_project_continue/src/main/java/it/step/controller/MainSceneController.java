package it.step.controller;

import it.step.db.EmployeeManagerDB;
import it.step.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {
    public TableColumn<Person, Integer> idCol;
    public TableColumn<Person, String> nameCol;
    public TableColumn<Person, LocalDate> birthdateCol;
    public TableView<Person> table;
    private EmployeeManagerDB db = new EmployeeManagerDB();

    public MainSceneController() {
    }

    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Person> list = FXCollections.observableArrayList();
        List<Person> persons = this.db.selectAll();
        Iterator var5 = persons.iterator();

        while(var5.hasNext()) {
            Person p = (Person)var5.next();
            list.add(p);
        }

        this.table.setItems(list);
        this.idCol.setCellValueFactory(new PropertyValueFactory("id"));
        this.nameCol.setCellValueFactory(new PropertyValueFactory("name"));
        this.birthdateCol.setCellValueFactory(new PropertyValueFactory("birthdate"));
    }

    public void onAdd(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/add.fxml"));
        AnchorPane parent = (AnchorPane)loader.load();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setTitle("Add employee window");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
        AddDialogController dialogController = (AddDialogController)loader.getController();
        String name = dialogController.nameTxtField.getText();
        LocalDate birthdate = (LocalDate)dialogController.birthdatePicker.getValue();
        this.table.getItems().add(new Person(1, name, birthdate));
    }

    public void onEdit(ActionEvent event) throws IOException {
        int idx = this.table.getSelectionModel().getSelectedIndex();
        if (idx != -1) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/edit.fxml"));
            AnchorPane parent = (AnchorPane)loader.load();
            EditDialogController controller = (EditDialogController)loader.getController();
            controller.setPerson((Person)this.table.getItems().get(idx));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setTitle("Edit employee window");
            stage.setScene(scene);
            stage.showAndWait();
            String name = controller.nameTxtField.getText();
            Person person = controller.getResult();
            this.table.getItems().set(idx, person);
            this.table.refresh();
        }

    }

    public void onDelete(ActionEvent event) {
        int idx = this.table.getSelectionModel().getSelectedIndex();
        Alert alert;
        if (idx != -1) {
            alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("This is a header: please confirm");
            alert.setContentText("Are you sure you want to delete? \n" + ((Person)this.table.getItems().get(idx)).toString());
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                this.table.getItems().remove(idx);
            }
        } else {
            alert = new Alert(AlertType.WARNING);
            alert.setContentText("Please select something");
            alert.setTitle("Title dialog");
            alert.show();
        }

    }

    public void onClose(ActionEvent event) {
        System.exit(0);
    }
}
