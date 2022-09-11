package it.step.data;

import java.util.Scanner;

public class EmployeeManager {

    // Cerem de la utilizator numarul de angajati
    // Initializam datele despre angajatii introdusi

    int[] num = new int[10];
    String[] texts = new String[10];

    public static void main(String[] args) {

        // array unidimensional
    /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de angajati: ");

        int nr = scanner.nextInt(); // 1 {enter}
        scanner.nextLine();
        Employee[] employees = new Employee[nr];

        for( int i = 0; i <= nr-1; i++){
            System.out.println("Introduceti prenumele: ");
            String name = scanner.nextLine();
            System.out.println("Introduceti numele: ");
            String surname = scanner.nextLine();
            System.out.println("Introduceti varsta: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            employees[i] = new Employee();
        }
    */

        // array bidimensional

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul de departamente:");
        int nr = scanner.nextInt(); // 1 {enter}
        scanner.nextLine();
        Employee[][] employees = new Employee[nr][];

        for(int i = 0; i<= nr-1; i++){
            System.out.println("Introduceti numarul de angajati din dep " + (i+1));
            int x = scanner.nextInt();
            scanner.nextLine();
            employees[i] = new Employee[x];

            for (int j = 0; j < employees[i].length; j++) {
                System.out.println("Introduceti numele:");
                String name = scanner.nextLine();
                System.out.println("Introduceti prenumele:");
                String surname = scanner.nextLine();
                System.out.println("Introduceti varsta:");
                int age = scanner.nextInt();
                scanner.nextLine();
                employees[i][j] = new Employee(name, surname, age);
            }
        }
    }
}