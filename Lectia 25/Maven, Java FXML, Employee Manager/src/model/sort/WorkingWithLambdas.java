package model.sort;

import model.old.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLambdas {

    public static void main(String[] args) {

        Employee e2 = new Employee("Abigdale", LocalDate.of(1950, 10, 10),  3450, 9.7);
        Employee e1 = new Employee("John", LocalDate.of(1995, 10, 11), 333, 6.7);
        Employee e3 = new Employee("Peter",LocalDate.of(2000, 10, 9),  7489, 8.7);

        List<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

        // Filtrare by performance indicator > 7
        filter (emps, emp -> {
            if (emp.getPerformanceIndicator() > 7) {
                System.out.println(emp.getName() + " passed!");
            } else {
                System.out.println(emp.getName() + " failed!");
            }
        });

        System.out.println();

        // Filtrare by salary > 1400
        filter (emps, emp -> {
            if (emp.getSalary() > 1400) {
                System.out.println(emp.getName() + " has salary > 1400");
            } else {
                System.out.println(emp.getName() + " has salary < 1400");
            }
        });

        System.out.println();

        // Filtrare by name starts with "j"
        filter (emps, emp -> {
            if (emp.getName().toLowerCase().startsWith("j") ){
                System.out.println(emp.getName() + " has a name that stars with J");
            } else {
                System.out.println(emp.getName() + " has a name that stars with something else");
            }
        });

        System.out.println();

        // Filtrare dupa ziua de nastere < 1988
        filter (emps, emp -> {
            if (emp.getBirthdate().getYear() < 1988) {
                System.out.println(emp.getName() + " has been born before 1988");
            } else {
                System.out.println(emp.getName() + " has been born after 1988");
            }
        });

        System.out.println();

        filter(emps, emp -> {
            if (emp.getSalary() > 560) {
                System.out.println(" Salary greater than 560");
            } else {
                System.out.println(" Salary less than 560");
            }
        });

    }

    public static void filter(List<Employee> employees, Filterable rule) {

        for (Employee emp: employees) {
                rule.apply(emp);
            };
    }
}


