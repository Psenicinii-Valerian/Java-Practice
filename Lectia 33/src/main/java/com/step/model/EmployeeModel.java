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

    public Employee get(int id) { // returneaza indexul elementului cu id-ul indicat ca parametru
        return this.employeeList.get(id); // metoda data get() e una prescrisa in sistemul java ca si add, clear, size etc.
    }

    public void edit(Integer id, String name, String surname, LocalDate birthdate) {
        employeeList.get(id).setName(name);
        employeeList.get(id).setSurname(surname);
        employeeList.get(id).setBirthdate(birthdate);
    }

    public void remove(int id) {

        int index = -1;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            employeeList.remove(index);
        }
    }

    public Employee getEmployee(int id) {

        int index = -1;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return null;
        }

        return employeeList.get(index);
    }
}
