package it.step.calculator;

import it.step.data.Employee;

public class Arrays {
    public static void main(String[] args) {

        // declararea elementelor tabloului unidimensional se face in asa mod:
        int[] numbers = new int[]{1,2,3,4};
        int[] numbers2 = {1,2,3,4};

        // declararea elementelor tabloului bidimensional se face in asa mod:
        int[][] bidimensionNumbers = {{1,2,3}, {4,5,6}, {7,8}, {9}};

        // declararea elementelor tabloului tridimensional se face in asa mod:
        int[][][] tridimensionNumbers = { {{1,2,3},{4}}, {{5}, {6}, {7,8}}, {{9,10}, {11}} };


        Employee[] employees = new Employee[10];    // Employee, Employee, Employee
        for (int i = 0; i < employees.length ; i++) {
            employees[i] = new Employee("name" + i, "surname" + 1, i * 10);
        }

        for (Employee emp: employees){
            System.out.println(emp);;
        }



        Employee[][] empBiDimension = new Employee[3][30]; // Employee[], Employee[], Employee[]
        for (int i = 0; i < empBiDimension.length ; i++) {
            for (int j = 0; j < empBiDimension[i].length; j++) {
                empBiDimension[i][j] = new Employee("name" + i, "surname" + 1, i * 10);
                
            }
        }
        Employee[][][] empTriDimension = new Employee[4][][]; // Employee[][], Employee[][], Employee[][]
                                                                  // Employee[], Employee[], Employee[]
    }
}
