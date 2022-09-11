package it.step.wrapper;

import it.step.data.Employee;
import java.util.Scanner;

public class ComparingObjects {
    private String value;

    public static void main(String[] args) {

        String hw = "Hello World!";
        String hw2 = "Hello World!";
        System.out.println(hw.equals(hw2));

        Scanner sc = new Scanner(System.in);

        ComparingObjects cmp = new ComparingObjects();
        // cmp.value = sc.nextLine(); // aceasta valoare o putem transmite in constructorul employee
        // daca nu avem nevoie de transmis valoare deodata, putem initia obiectul clasei ComparingObjects in constructorul employee

        Employee employee = new Employee("John", "Smith");
        employee = new Employee("Peter", "Smith");

        // sc.nextLine();

        Employee employee2 = new Employee("John", "Smith");

        System.out.println(employee);

    }

}
