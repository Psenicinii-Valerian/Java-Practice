package it.step;

import it.step.calculator.Calculator;

public class Main {
    public static void main (String[] args)
    {
        Employee john = new Employee("John", "Smith", 30);
        // john.setName("John");
        // john.setAge((byte) 30);

        Employee peter = new Employee("Peter", "Smith", 45);
        // peter.setName("Peter");
        // peter.setAge((byte) 49);
        // peter.setAge((byte) -100);

        // System.out.println(peter.getAge());

        Calculator calculator = new Calculator();
        int result = calculator.sumWithReturn(2,2);
        calculator.sumWithoutReturn(2,result);
        calculator.calculateAge("22.07.1994");
    }

}
