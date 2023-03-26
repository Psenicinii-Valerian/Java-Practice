package com.step.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;

    @Column(length = 70)
    private String name;
    @Column(length = 70)
    private String surname;
    @Column
    private LocalDate birthdate;
    @Column (precision = 6, scale = 2)
    private Double salary;
    @OneToOne (cascade = CascadeType.ALL)
    private Address address;

    @ManyToOne (cascade = CascadeType.ALL)
    private Department department;

    public Employee() { }

    public Employee(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Employee(int id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
