package it.step.inner.annonymous;

public interface Calculator {

    double sum();
}

class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator() {
            public double sum() {
                return 2.0 + 2;
            }
        };

//        Calculator calc = () -> 2.0 + 2; // expresie lambda

        System.out.println(calc.sum());
    }
}