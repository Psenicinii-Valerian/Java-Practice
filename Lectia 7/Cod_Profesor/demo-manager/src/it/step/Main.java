package it.step;

import it.step.banking.TransactionManager;
import it.step.calculator.SimpleCalculator;
import it.step.data.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println(SimpleCalculator.PI);
        int x = 20;
        // Stack -> HEAP (nor)
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        // System.out.println(calculator.PI); // nu se recomanda

        TransactionManager manager = TransactionManager.getInstance();
        TransactionManager manager2 = TransactionManager.getInstance();




    }
}
