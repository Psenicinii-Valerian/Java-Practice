package com.step;

import com.step.model.Employee;
import com.step.model.EmployeeDAO;
import com.step.util.HibernateUtil;
import org.hibernate.SessionFactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // generam obiectul de control al BD
        EmployeeDAO dao = new EmployeeDAO();

        // crearea inregistrarilor
        for (int i = 0; i < 100; i++) {
            dao.create(new Employee("Name "+(i+1), "Surname "+(i+1), LocalDate.now().plus(i, ChronoUnit.WEEKS)));
        }

        List<Employee> created = dao.findAll();
        System.out.println("\n--------------CREATED EMPLOYEES--------------");
        for (Employee emp: created){
            System.out.println(emp);
        }

        // afisarea tuturor inregistrarilor
        System.out.println("\n--------------FOUND EMPLOYEES--------------");
        List<Employee> byName = dao.findByName("%5");
        for (Employee emp: byName) {
            System.out.println(emp);
        }

        // editarea inregistrarii angajatului cu id-ul 76
        Employee byId = dao.findById(76);
        byId.setName("qwerty");
        byId.setSurname("asdfgh");
        byId.setBirthdate(LocalDate.of(1996, 10 , 10));

        dao.update(byId);

        HibernateUtil.shutDown();
    }
}