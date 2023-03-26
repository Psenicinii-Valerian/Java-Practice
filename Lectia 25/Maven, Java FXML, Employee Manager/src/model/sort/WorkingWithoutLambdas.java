package model.sort;

import model.old.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithoutLambdas {

    public static void main(String[] args) {

        Employee e2 = new Employee("Abigdale", LocalDate.of(1950, 10, 10),  3450, 9.7);
        Employee e1 = new Employee("John", LocalDate.of(1995, 10, 11), 300, 6.7);
        Employee e3 = new Employee("Peter",LocalDate.of(2000, 10, 9),  7489, 8.7);

        List<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

        // Filtrare by performance indicator > 7
        filter (emps, FilterType.PERFORMANCE);
        System.out.println();

        // Filtrare by salary > 1400
        filter (emps, FilterType.SALARY);
        System.out.println();

        // Filtrare by name starts with "j"
        filter (emps, FilterType.NAME);
        System.out.println();

        // Filtrare by birthdate < 1988
        filter (emps, FilterType.MY_BIRTHDATE);
        System.out.println();

        // Filtrare by salary > 560
        filter (emps, FilterType.SALARY560);
    }

    public static void filter(List<Employee> employees, FilterType filterType) {

        for (Employee emp: employees) {

            switch (filterType) {

                case PERFORMANCE :
                    filterByPerformanceIndicator(emp);
                    break;

                case SALARY :
                    filterBySalary(emp);
                    break;

                case NAME :
                    filterByName(emp);
                    break;

                case MY_BIRTHDATE :
                    filterByBirthdate(emp);
                    break;

                case SALARY560:
                    filterBySalary560(emp);
                    break;

                default :
                    System.out.println(" Not supported!");
            }
        }
    }

    private static void filterByPerformanceIndicator(Employee emp) {
        if (emp.getPerformanceIndicator() > 7) {
            System.out.println(emp.getName() + " passed!");
        } else {
            System.out.println(emp.getName() + " failed!");
        }
    }

    private static void filterBySalary(Employee emp) {

        if (emp.getSalary() > 1400) {
            System.out.println(emp.getName() + " has salary > 1400");
        } else {
            System.out.println(emp.getName() + " has salary < 1400");
        }
    }

    private static void filterByName(Employee emp) {
        if (emp.getName().toLowerCase().startsWith("j") ){
            System.out.println(emp.getName() + " has a name that stars with J");
        } else {
            System.out.println(emp.getName() + " has a name that stars with something else");
        }
    }

    private static void filterByBirthdate(Employee emp){
        if (emp.getBirthdate().getYear() < 1988) {
            System.out.println(emp.getName() + " has been born before 1988");
        } else {
            System.out.println(emp.getName() + " has been born after 1988");
        }
    }

    private static void filterBySalary560(Employee emp) {
        if (emp.getSalary() > 560) {
            System.out.println(" Salary greater than 560");
        } else {
            System.out.println(" Salary less than 560");
        }
    }
}
