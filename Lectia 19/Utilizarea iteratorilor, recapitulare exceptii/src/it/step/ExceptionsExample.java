package it.step;

import it.step.custom.IdNotFoundException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {

//        badExample();
        createEmployee();
        int id = getIdToEdit();
        editEmployee(id);

        while (true) {

            int toDelete = getIdToDelete();
            try {
                deleteEmployee(toDelete);
                break;
            } catch(IdNotFoundException ex) {
                System.out.println(" ID-l nu exista");
            }
        }

        listEmployee();

    }

    private static void listEmployee() {
        System.out.println(" List employees");

    }

    private static int getIdToDelete() {
        while (true) {

            try {
                Scanner sc = new Scanner(System.in);
//                String text = sc.nextLine();
//                Integer.parseInt(text);
                return sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println(" Datele introduse nu sunt corecte");
            }

        }

    }

    private static int getIdToEdit() {
        return 100;
    }

    private static void deleteEmployee(int id) throws IdNotFoundException {

        if(id > 200) {
            throw new IdNotFoundException();
        }
        // dbmanager.delete(id);
    }

    private static void editEmployee(int id) {

    }

    private static void createEmployee() {
        // create 10 employee
    }

    private static void badExample() {
        List <String> items = new ArrayList<>();
        items.add(" Hello");
        items.add(" Hello");
        items.add(" Hello");
        items.add(" Hello");

        items.get(100);
    }

/*
    public void read() throws Exception {

    }

    public void main(){
        try {
            try {
                read();
            } catch (Exception ex) {

            }

            process();
        } catch (Exception ex) {

        }


    }

    public void process() throws Exception {
        verify();
        analyze();
    }
*/

}
