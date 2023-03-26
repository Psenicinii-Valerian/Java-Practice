package com.step.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table()
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 70)
    private String name;
    @Column(length = 70)
    private String surname;
    @Column
    private LocalDate birthdate;
    @Column(precision = 6, scale = 2) // Decimal(5,2)
    private Double salary; //145.32
}
