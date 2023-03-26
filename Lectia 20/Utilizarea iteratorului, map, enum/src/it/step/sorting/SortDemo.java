package it.step.sorting;

import java.util.*;

public class SortDemo {

    public static void main(String[] args) {

        List <String> items = new ArrayList<>();
        items.add("ZZZZZZZZZZZ");
        items.add("RRRRRRRR");
        items.add("GGGGGGG");
        items.add("AAAA");
        for (String s: items) {
            System.out.println(s);
        }

        // Collections.sort(items);

        items.sort(new StringComparator());
        System.out.println("\n Dupa sortare");

        for (String s: items) {
            System.out.println(s);
        }

        List <Employee> objects = new ArrayList<>();
        objects.add( new Employee("John", "Ross") );
        objects.add( new Employee("Alice", "Smith") );

        System.out.println();
        System.out.println("------- OBJECT COMPARE: -------");
        System.out.println();

        Collections.sort(objects);
        // Sortare implicita - dupa nume in cazul nostru (asa am dat la compareTo() din Comparable )

        System.out.println(" Compare by name:");
        for (Employee emp: objects) {
            System.out.print(" ");
            System.out.print(emp.name);
            System.out.print(" ");
            System.out.println(emp.surname);
        }

        objects.sort(new SurnameComparator());
        // Sortare speciala - dupa prenume (asa am dat la compare() din SurnameComparator() )

        System.out.println("\n Compare by surname:");
        for (Employee emp: objects) {
            System.out.print(" ");
            System.out.print(emp.name);
            System.out.print(" ");
            System.out.println(emp.surname);
        }


    }
}

class Employee implements Comparable<Employee> {
    String name;
    String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int compareTo(Employee emp) {
        return name.compareTo(emp.name);
    }
}
