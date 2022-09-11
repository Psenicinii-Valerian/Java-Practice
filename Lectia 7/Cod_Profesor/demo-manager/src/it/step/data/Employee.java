package it.step.data;

public class Employee {
    // nume, prenume, varsta, functie, compania
    public final String name;
    private String surname;
    private String birthdate;
    private byte age;
    private String function; // daca avem nevoie de date complexe, aici poate fi o variabila de tip clasa, spre exemplu EmployeeFunction
    private String companyName;

    public Employee() {
        this.name = "John";
    }

    public Employee(String n, String s) {
        name = n;
        surname = s;
    }


    public Employee(String name, String surname, int age) {
       this.name = name;
       this.surname = surname;
       this.age = (byte) age;
   }

// Setterul dat nu functioneaza pentru ca name este FINAL
//    public void setName(String name) {
//        // if ! empty String
//        this.name = name;
//    }

    public final void setAge(final byte value) {
        if (value > 18) {
            age = value;
        }
    }

    public byte getAge(){
        return age;
    }
}
