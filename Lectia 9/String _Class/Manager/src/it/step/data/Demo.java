package it.step.data;

import it.step.data.militar.PoliceOfficer;

public class Demo {
    public static void main(String[] args) {
//      Employee emp = new Employee();
//      emp.setIdnp("1234567982612");
//      emp.getName(); // null

        Employee emp2 = new Employee("John", "Smith");
        Employee peter = new Employee("Peter", "Smith");

        System.out.println("John equals Peter? " + emp2.equals(peter));
        System.out.println();

        emp2.getName();
        emp2.work();

        System.out.println();

        PoliceOfficer policeOfficer = new PoliceOfficer("John", "Smith");
        policeOfficer.work();

        System.out.println();

        Accountant accountant = new Accountant("Peter", "Smith");
        accountant.work();
    }
}
