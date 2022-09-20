package it.step.data.militar;

import it.step.data.Auto;
import it.step.data.Employee;

public class PoliceOfficer extends Employee {

    private String gradMilitar;
    private Auto automobil;

    public PoliceOfficer(String name, String surname) {
        super(name, surname);
//      this.setName(name);
//      this.setSurname(surname);
    }

    public void work() {
        super.work();
        System.out.println("POLICE DEPARTMENT...");
        System.out.println("Catching criminals!");
    }

}
