package it.step.collections;

import it.step.data.Employee;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John", "Smith"));
        employees.get(0);
        employees.set(0, new Employee("Peter", "Smith"));
        employees.remove(0);
        employees.size();
        // employees.addAll();

    }
}
