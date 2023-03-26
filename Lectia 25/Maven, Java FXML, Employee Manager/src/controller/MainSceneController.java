package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.table.Person;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {

    public TableColumn<Person, Integer> idCol;
        // *sau putem scrie declaratia de mai sus astfel:   @FXML
        //                                                  private TableColumn<Person, Integer> idCol;
    public TableColumn<Person, String> nameCol;
    public TableColumn<Person, LocalDate> birthdateCol;

    public TableView<Person> table;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Create person list
        ObservableList<Person> list = FXCollections.observableArrayList();
        list.add(new Person(1, "John Smith", LocalDate.of(1980, 10, 10)));
        list.add(new Person(2, "Jane Smith", LocalDate.of(1980, 10, 10)));
        list.add(new Person(3, "Peter Smith", LocalDate.of(1980, 10, 10)));
        list.add(new Person(4, "Max Smith", LocalDate.of(1980, 10, 10)));

        // Link person list with table
        table.setItems(list);

        // Link id with idCol
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        // Link name with nameCol
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Link birthdate with birthdateCol
        birthdateCol.setCellValueFactory(new PropertyValueFactory<>("birthdate"));
    }

    public void onAdd(ActionEvent event){
        table.getItems().add(new Person(1, " Chris Smith", LocalDate.now()));
    }

    public void onEdit(ActionEvent event){
        int idx = table.getSelectionModel().getSelectedIndex();
        table.getItems().get(idx).setName("EDITED NAME");
        table.getItems().get(idx).setId(999);
        table.getItems().get(idx).setBirthdate(LocalDate.MIN);
        table.refresh();

        // pentru ca numele sau alt atribut sa se actualizeze automat (fara refresh) trebuie sa fie de tip StringProperty
    }

    public void onDelete(ActionEvent event){
        int idx = table.getSelectionModel().getSelectedIndex();

        if (idx != -1) {
            table.getItems().remove(idx);
        }

        // get selected index
        // delete selected index
    }


}
