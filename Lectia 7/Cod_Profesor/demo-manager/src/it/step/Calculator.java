package it.step;

public class Calculator {

    public int sum(int a, int b){ // default
        return a + b;
    }

    public String sum(int a, double b){
        System.out.println(a + b);
        return "Suma:  " + (a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a + b);
    }

    public void calculateAge(String birthdate) {

    }
}
