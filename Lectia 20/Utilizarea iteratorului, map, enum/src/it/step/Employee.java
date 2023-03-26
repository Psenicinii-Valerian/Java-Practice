package it.step;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthdate; // 10/10/1985; 1985-Octombrie-10; 10-Oct-85
//    private String idnp;
//    private String phoneNumber;

    private Gender gen; // "Male", "MALE", "M", "Female", "FEMALE", "F"
    private char gender; // M, F, m, f
    private boolean genBoolean; // true/false


    public Employee() {

    }

    public Employee(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Employee(String name, String surname, String email, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthdate = birthdate;
    }

    public Employee(int id, String name, String surname, String email, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthdate = birthdate;
    }

    public Employee(int id, String name, String surname, String email) {

        this(name, surname, email);
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setGen(Gender gen) {

        // Verificarea nu mai este necesara daca utilizam enum

        // if (gen.equalsIgnoreCase(Gender.male) || gen.equalsIgnoreCase(Gender.female)) {
            this.gen = gen;
        // } else {
        //     System.out.println(" Genul a fost introdus gresit!");
        // }

    }

    public Gender getGen() {
        return gen;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
