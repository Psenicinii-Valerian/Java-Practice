package it.step.model;

import java.time.LocalDate;

public class Person {

    private int id;
    private String name;
    private String surname;
    private LocalDate Birthdate;

    public Person(int id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.Birthdate = birthdate;
    }

    public Person(int id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.Birthdate = birthdate;
    }

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.Birthdate = birthdate;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public LocalDate getBirthdate() {
        return this.Birthdate;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "name='" + name + '\'' +
                ", Birthdate= " + Birthdate +
                '}';
    }
}
