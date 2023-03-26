package com.step.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {

    private final static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String houseNumber;

    @Column
    private String apartment;

    public Address() {
    }

    public Address(String street, String city, String state, String houseNumber, String apartment) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
    }

    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
