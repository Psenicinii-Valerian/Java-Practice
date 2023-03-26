package model.old;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{

    private String name;
    private String lastName;
    private LocalDate birthdate;
    private double salary;
    private Double performanceIndicator;

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(String name, double salary, Double performanceIndicator) {
        this.name = name;
        this.salary = salary;
        this.performanceIndicator = performanceIndicator;
    }

    public Employee(String name, LocalDate birthdate, double salary, Double performanceIndicator) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
        this.performanceIndicator = performanceIndicator;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public Double getPerformanceIndicator() {
        return performanceIndicator;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.length() - o.getName().length();
    }

}
