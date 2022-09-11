package it.step.data;

import java.util.Scanner;

public class EmployeeManager {

    int[] num = new int[10];
    String[] texts = new String[10];

    // Cerem de la utilizator numarul de angajati
    // Initializam datele despre angajatii introdusi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul de departamente:");
        int nr = scanner.nextInt(); // 1 {enter}
        scanner.nextLine();
        Employee[][] employees = new Employee[nr][];
        for(int i = 0; i<= nr-1; i++){
            System.out.println("Introduceti numarul de angajati din dep 1");
            int x = scanner.nextInt();
            scanner.nextLine();
            employees[i] = new Employee[x];
        }
        for (int i = 0; i <= nr-1; i++) {
            for (int j = 0; j <= employees[i].length; j++) {
                System.out.println("Introduceti numele:");
                String name = scanner.nextLine();
                System.out.println("Introduceti prenumele:");
                String surname = scanner.nextLine();
                System.out.println("Introduceti varsta:");
                int age = scanner.nextInt();
                employees[i][j] = new Employee(name, surname, age);
            }
        }
    }
}
