package it.step.data;

public class Accountant extends Employee {

    private String grad; // superior, principal
    private String listaDeCompanii;

    public Accountant(String name, String surname) {
        super(name, surname);
    }

    public void work() {
        super.work();
        System.out.println("Accountant is checking numbers");
    }

}
