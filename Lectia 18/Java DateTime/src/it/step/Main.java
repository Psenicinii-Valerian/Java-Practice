package it.step;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in); // try with resources!!!
    static DbManager manager = new DbManager();

    public static void main(String[] args) {

        System.out.println(" Alegeti operatia");

        System.out.println(" 1 - Create ");
        // create
        System.out.println(" Introduceti numele angajatului:");
        String name = sc.nextLine();

        System.out.println(" Introduceti prenumele angajatului:");
        String surname = sc.nextLine();

        System.out.println(" Introduceti emailul angajatului:");
        String email = sc.nextLine();

        System.out.println(" Introduceti ziua de nastere a angajatului (zz/ll/aaaa)");
        String birthdate = sc.nextLine();
        LocalDate birth = LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("dd/MM/y"));

        Employee emp = new Employee(name, surname, email, birth);
        manager.create(emp);

        System.out.println("------------------------------------------------------------------------------------");

        // update
        System.out.println(" 2 - Update ");
        Employee toEdit = findEmployee("EDIT");

        System.out.println("Introduceti un nume nou sau apasati enter:");
        String newSurname = sc.nextLine();
        toEdit.setSurname(newSurname);

        System.out.println("Introduceti un prenume nou sau apasati enter:");
        String newName = sc.nextLine();
        toEdit.setName(newName);

        System.out.println("Introduceti un email nou sau apasati enter:");
        String newEmail = sc.nextLine();
        toEdit.setEmail(newEmail);

        System.out.println(" Introduceti o zi de nastere noua a angajatului (zz/ll/aaaa) sau apasati enter:");
        String newBirthdate = sc.nextLine();
        LocalDate newBirth = LocalDate.parse(newBirthdate, DateTimeFormatter.ofPattern("dd/MM/y"));
        toEdit.setBirthdate(newBirth);

        manager.update(toEdit);

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println(" 3 - Delete ");
        Employee toDelete = findEmployee("DELETE");
        manager.delete(toDelete);

        System.out.println(" 4 - List ");
        listEmployees();

    }

    // find employee
    public static Employee findEmployee(String action) {

        List<Employee> emps = listEmployees();
        System.out.println("------------------------------------------------------------------------------------");

        // de repetat daca nu se gaseste un astfel de obiect
        boolean objectFound = false;
        Employee found = null;
        while (!objectFound) {

            System.out.println("-- Alegeti va rog obiectul necesar pentru Operatia: " + action + " -->");
            int id = sc.nextInt();
            sc.nextLine();

            for (Employee employee : emps) {
                if (employee.getId() == id) {
                    found = employee;
                }
            }

            if(found != null) {
                objectFound = true;
            } else {
                System.out.println("Angajatul cu id-ul " + id + " nu a fost gasit");
            }

        }

        return found;
    }

    // list employee
    public static List<Employee> listEmployees() {
        List<Employee> emps = manager.selectAll();
        for (Employee e : emps) {
            System.out.println(e);
        }

        return emps;
    }

}








// other code :

/*

//        Employee emp = new Employee("David", "Smith", "dsmith@gmail.com");
//        Employee emp2 = new Employee("Peter", "Smith", "psmith@gmail.com");

//        manager.create(emp);
//        manager.create(emp2);

        //  list
        List<Employee> list = manager.selectAll();
        System.out.println(list.size());

        System.out.println();

        for(Employee employee: list){
            System.out.println("id = " + employee.getId());
            System.out.println("nume = " + employee.getName());
            System.out.println("prenume = " + employee.getSurname());
            System.out.println("email = " + employee.getEmail());
            System.out.println();
        }

        list.get(0).getEmail();

//        Employee first = list.get(2);
//        first.setName("Mihai");
//        first.setBirthdate("11.12.19799");
//
//        manager.update(first);
//       manager.delete(list.get( list.size()-1) );


    }

    public static void testScanner() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduceti numele angajatului");
            String name = sc.nextLine();

            System.out.println("Introduceti prenumele angajatului");
            String surname = sc.nextLine();

            System.out.println("Introduceti emailul angajatului");
            String email = sc.nextLine();

            Employee emp = new Employee(name, surname, email);
            manager.create(emp);
        }

        */


