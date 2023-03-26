package it.step.collections;

import it.step.data.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    private static Employee emp;

    public static void main(String[] args) {

        String[] arr = new String[10];
        if (arr.length > 99){
            arr[100] = "Hello";
        }

        if (emp != null){
            emp.setSurname("John");
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Hello" + 1;
        }

        String[] largeArr = new String[1000];

        for (int i = 0; i < arr.length; i++) {
            largeArr[i] = arr[i];
        }

        List <Employee> collection = new ArrayList<>();
        collection.add(new Employee("Jon", "Smith"));

        if (collection.size() > 0) {
            collection.set(0, new Employee()); // arr[0]
        }

        collection.remove(new Employee("Jon", "Smith"));

    }
}
