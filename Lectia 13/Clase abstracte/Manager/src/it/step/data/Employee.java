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

    public boolean equals(Object obj) {
//        try{
            System.out.println("");

            if (this.getClass() != obj.getClass()) {
                return false;
            }

            Employee e = (Employee) obj;

            System.out.println("Adresa? p:" + this.hashCode()+ "; e:" + e.hashCode()) ;

            // Verificam egalitatea la name, surname, birthdate
            boolean nameEquals = this.name.equalsIgnoreCase(e.name);
            boolean surnameEquals = this.surname.equalsIgnoreCase(e.surname);
            boolean idnpEquals = false;
            if (this.idnp != null){
                idnpEquals = this.idnp.equalsIgnoreCase(e.idnp);
            }

            return nameEquals && surnameEquals && idnpEquals;
 //       }

//        catch (Exception ex) {
//            System.out.println("Am prins o eroare incercand sa comparam obiectele.");
//            System.out.println("Delatii: " + ex.getMessage());
//
//            return false;
//        }

    }

}
