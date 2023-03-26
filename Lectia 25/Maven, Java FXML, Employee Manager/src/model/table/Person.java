package model.table;

import java.time.LocalDate;

public class Person {

    private int id;
    private String name;
    private LocalDate Birthdate;

    public Person(int id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        Birthdate = birthdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        Birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }
}
