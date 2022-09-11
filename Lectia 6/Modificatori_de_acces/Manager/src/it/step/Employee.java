package it.step;

public class Employee {
    // nume, prenume, varsta, functie, compania

    private final String name;
    private String surname;
    private byte age;
    private String function; //daca avem nevoie de date complexe, aici poate fi creata o clasa speciala, de exemplue EmployeeFunction
    private String companyName;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = (byte) age;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
// Setterul dat nu functioneaza deoarece name este FINAL
//    public void setName(String value) {
//        // if ! empty String
//        name = value;
//    }


    public void setAge(byte value) {
        if(value>18) {
            age = value;
        }
    }

    public byte getAge() {
        return age;
    }
}
