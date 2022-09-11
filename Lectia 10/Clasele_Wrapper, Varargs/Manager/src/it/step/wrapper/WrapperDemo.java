package it.step.wrapper;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {

        boolean x2 = true;
        Boolean x = new Boolean("tRuE");
        Integer num = new Integer("100");
        Integer num2 = new Integer(100);
        Integer num3 = 100; // asa de scris se poate doar in clasele Wrapper

        int a = 10;
        int b = 3;
        double c = (double) a / b;

        Integer a2 = 10;
        Integer b2 = 3;
        Double c2 = a2.doubleValue() / b;

    /*
        Integer num6 = val1; // error (nu putem converti din double in Integer)
        int val4 = 200;
        double test = val4; // error (nu putem converti din int in double)
        Double dbl = val4; // error (nu putem converti din int in Double)
    */

        Integer intValue = Integer.valueOf(100);
        Integer intValue2 = Integer.valueOf("100");
        Integer intValue3 = Integer.valueOf(100);
        Integer intValue4 = Integer.valueOf(10050);

        System.out.println(intValue2.doubleValue()); // facem conversie din clasa Wrapper in primitiva
        System.out.println(intValue + intValue2); // obtinem rezultat de tip valoare primitiva

        Integer sum = intValue + intValue2; // atribuim unei clase Wrapper rezultatul sumei a 2 primtive (o putem prelucra apoi ca obiect)
        System.out.println("BYTE: " + sum.byteValue());

        double val1 = 20.56;
        double val2 = 34.56;

        sum(val1, val2); // va apela metoda cu primitive

        sum(new Double(20.45), new Double(20.45)); // va apela metoda cu wrapperi

//      sum(val1, new Double(20.45)); // error apel ambiguu - avem atat functie cu parametri wrapperi, cat si functie cu parametri primitivi

        sum(1.1, 1.2, 1.3, 1.4, 1.5);
        sum( 1.2, 1.3, 1.4, 1.5, 1.8, 1.9);
        sum(2.2, 5.6, 9);
        sum(new double[]{1.1, 1.2, 1.3, 1.6, 1.9}); // putem apela vararg-ul si ca array

    }

    static Double sum(Double x, Double y) {
        System.out.println("Metoda cu wrapperi");
        return x + y;
    }

    static Double sum(double x, double y) {
        System.out.println("Metoda cu primitive");
        return x + y;
    }

    static Double sum(double...numbers) {
        double sum = 0.0;
        for (double db:numbers) {
            sum += db;
        }
        return sum;
    }
}

//    static Double sum(double[] numbers) {
//        double sum = 0.0;
//        for (double db:numbers) {
//            sum += db;
//        }
//        return sum;
//    }
//}
