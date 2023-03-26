package com.step;

import com.step.model.Address;
import com.step.model.Employee;
import com.step.model.EmployeeDAO;
import com.step.util.HibernateUtil;
import org.hibernate.SessionFactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // generam obiectul de control al BD
        EmployeeDAO dao = new EmployeeDAO();

        // 1. create random objects
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee e = new Employee("Name"+i, "Surname"+i, LocalDate.of(i, 10, 10));
            e.setAdress(new Address("Columna"+i, "Chisinau"));
            employeeList.add(e);
        }

        // 2. save random objects
        for(Employee emp: employeeList){
            dao.create(emp);
        }

        List<Employee> all = dao.findAll();
        for (Employee employee:all) {
            System.out.println(employee);
        }

        dao.delete(5);

        HibernateUtil.shutDown();
    }
}