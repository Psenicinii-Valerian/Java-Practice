package com.step.model;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 70)
    private String name;
    @Column(length = 70)
    private String surname;
    @Column
    private LocalDate birthdate;
    @Column(precision = 6, scale = 2) // Decimal(5,2)
    private Double salary; //145.32

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @ManyToOne
    private Department department;

//    @ManyToMany
//    private List<Project> projects;


    public Employee() {
    }

    public Employee(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Integer getId() {
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

    public void setId(Integer id) {
        this.id = id;
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

    // address
    public void setAdress(Address adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", salary=" + salary +
                ", adress=" + address +
                ", department=" + department +
                '}';
    }
}
