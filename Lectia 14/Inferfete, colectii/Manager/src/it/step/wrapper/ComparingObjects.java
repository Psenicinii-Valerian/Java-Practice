package it.step.wrapper;

import it.step.calculator.SimpleCalculator;
import it.step.data.Accountant;
import it.step.data.Employee;
import it.step.data.militar.PoliceOfficer;

import java.util.Scanner;

public class ComparingObjects {
    private String value;

    public static void main(String[] args) {

    /*
        String hw = "Hello World!";
        String hw2 = "Hello World!";
        System.out.println(hw.equals(hw2));



        ComparingObjects cmp = new ComparingObjects();
        // cmp.value = sc.nextLine(); // aceasta valoare o putem transmite in constructorul employee
        // daca nu avem nevoie de transmis valoare deodata, putem initia obiectul clasei ComparingObjects in constructorul employee

        Employee employee = getEmployee();
        Employee employee2 = new Employee("Peter", "Smith");
        Employee employee3 = new Employee("John", "Smith");

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        System.out.println(employee.equals(employee3));
    */

        Employee p = new Employee("Ion", "Smith");
        Employee a = new Employee("Ion", "Smith");

        System.out.println("Object comparing: ");

        System.out.println(p.equals(new SimpleCalculator()));
        System.out.println(p.equals(new Employee("Jane", "Smith")));
        System.out.println(p.equals(new Employee("Ion", "Smith")));

        Employee[] employees = new Employee[100];
        employees[0] = p;
        employees[1] = a;
    }

    public static Employee getEmployee()
    {
        // This is a comment
        return new Employee("John","Smith");
    }





}
