package it.step.data;

public class Employee {
    // nume, prenume, varsta, functie, compania

    public String name;
    protected String surname;
    protected String birthdate;
    protected byte age;
    protected String function; //daca avem nevoie de date complexe, aici poate fi creata o clasa speciala, de exemplue EmployeeFunction
    private String companyName;

    public Employee() {
        // this.name = "John";
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = (byte) age;
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

    public void work() {
        System.out.println("Employee is working");
    }
}
