package it.step.interfaces;

import it.step.data.Employee;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {

        EmployeeManager manager;

        // cum vreti sa lucreze aplicatia?
        String option = "db"; // utilizatorul introduce optiunea de la tastatura

        if (option.equalsIgnoreCase("db")){
            manager = new DbEmployeeManager();
        } else if (option.equalsIgnoreCase("memory")) {
            manager = new ArrayEmployeeManager();
        } else {
            manager = new FileEmployeeManager();
        }

        // citim datele de intrare de la tastatura
        manager.create("John", "Smith");
        // intreb utilizatorul ce vrea sa faca
        manager.update(0, "Peter", "Smith");


        // .. delete
        manager.delete(0);

        manager.view();
    }
}
