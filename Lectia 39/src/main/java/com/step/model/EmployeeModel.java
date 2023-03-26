package com.step.model;

import java.time.LocalDate;
import java.util.List;

public class EmployeeModel {

    // modificarea lui EmployeeModel de la "lucrul" cu liste, la "lucrul" cu BD

    // Singleton
    private static EmployeeModel instance = new EmployeeModel();

    public static EmployeeModel getInstance() {
        return instance;
    }

    private EmployeeDAO employeeDao = new EmployeeDAO();
    private int rowsPerPage = 10;
    private EmployeeModel() {}

    public void add(Employee employee) {
        employeeDao.create(employee);
    }

    public Employee get(int id) { // returneaza indexul elementului cu id-ul indicat ca parametru
        return employeeDao.findById(id);
    }

    public void edit(Integer id, String name, String surname, LocalDate birthdate) {
        Employee employee = new Employee(id, name, surname, birthdate);
        employeeDao.update(employee);
    }

    public void remove(int id) {
        employeeDao.delete(id);
    }

//    public Employee getEmployee(int id) {
//
//      int index = -1;
//
//        for (int i = 0; i < employeeList.size(); i++) {
//            if (employeeList.get(i).getId() == id) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index == -1) {
//            return null;
//        }
//
//        return employeeList.get(index);
//    }

    public List<Employee> getPage(int page) {
        return employeeDao.findPage(page, rowsPerPage);
    }

    public long getTotalPages() {
        long count = employeeDao.countAll();
        long numberOfPages = count/rowsPerPage;
        // Daca avem 10 elemente (impartim la 10) = 1 pagina,
        // 23/10 = 2.3, 35/10 = 3.5
        long rest = count % rowsPerPage; // 0, 3, 5

        if (rest > 0) {
            numberOfPages += 1;
        }

        return numberOfPages;
    }

    public long getTotalPages(String filter) {
        long count = employeeDao.countAll(filter);

        long numberOfPages = count/rowsPerPage;
        long rest = count % rowsPerPage; // 0, 3, 5

        if (rest > 0) {
            numberOfPages += 1;
        }

        return numberOfPages;
    }


    public List<Employee> search(String searchBy, int page) {
        return employeeDao.findPage(page, rowsPerPage, searchBy);
   }

}
