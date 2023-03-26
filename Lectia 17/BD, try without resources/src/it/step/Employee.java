package it.step;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String birthdate;
//    private String idnp;
//    private String phoneNumber;

    public Employee(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
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

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public String getBirthdate() {
        return this.birthdate;
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
