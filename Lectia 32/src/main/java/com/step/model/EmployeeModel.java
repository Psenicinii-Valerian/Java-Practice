package com.step.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

    // Singleton

    private static EmployeeModel instance = new EmployeeModel();

    public static EmployeeModel getInstance() {
        return instance;
    }

    private List<Employee> employeeList = new ArrayList<>();

    private EmployeeModel() {
        for (int i = 0; i < 100; i++) {

            this.employeeList.add(new Employee(i,"John " + i, "Smith " + i, LocalDate.now()));
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void add(Employee employee) {
        int nextId = this.employeeList.size();
        this.employeeList.add(new Employee(nextId, employee.getName(), employee.getSurname(), employee.getBirthdate()));
    }

    public Employee get(int id) {
        return this.employeeList.get(id);
    }
}
