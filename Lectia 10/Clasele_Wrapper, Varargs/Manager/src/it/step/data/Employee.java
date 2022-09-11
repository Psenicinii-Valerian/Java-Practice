package it.step.data;

import it.step.wrapper.ComparingObjects;

public class Employee extends Object { // Object
    // nume, prenume, varsta, functie, compania

    private String name;
    private String surname;
    private String idnp;
    private String birhtdate;
    private double salary;

    private int age;

    public Employee() {

    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ComparingObjects c = new ComparingObjects();
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = (byte) age;
    }

    public String getIdnp() {
        return this.idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String name) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Calling work method:");
        System.out.println("Another message");
    }

    public String toString() {
        return "Employee: name - " + name + ", surname - " + surname;
    }

//    protected void finalize() {
//        System.out.println("Employee este sters din memorie");
//    }

}
