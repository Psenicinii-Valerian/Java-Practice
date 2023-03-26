package it.step.interfaces;

import it.step.data.Employee;

public class ArrayEmployeeManager implements EmployeeManager {

    private Employee[] arr = new Employee[0];

    // view, create, update, delete
    public void view() {
        for (Employee emp: arr) {
            System.out.println(emp);
        }
    }

    public void create(String name, String surname) {
        Employee newEmployee = new Employee(name, surname);
        // arr[index] = newEmployee
    }

    public void update(int index, String name, String surname) {
        arr[index].setName(name);
        arr[index].setSurname(surname);
    }

    public void delete(int index) {
        // verificari daca indexul exista?
        arr = new Employee[arr.length-1];
        // copiem toate elementele in afara de elementul de pe indexul specificat
    }










}
