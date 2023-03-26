package it.step.inner.annonymous;

public class Employee {

    public void hello() {
        System.out.println("Hello");
    }

    public void work() {
        hello();
        System.out.println(" Employee works!");
    }
}
