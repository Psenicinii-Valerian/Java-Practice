package model.sort;

import model.Employee;

import java.util.Comparator;

public class EmployeeSorting {

    public static Comparator<Employee> byName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().length() - o2.getName().length();
        }
    };

    public static Comparator<Employee> bySurname = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getLastName().length() - o2.getLastName().length();
        }
    };
}
