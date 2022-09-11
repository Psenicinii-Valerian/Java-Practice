package it.step.decision;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        // atat timp cat a = 10, fa te rog operatiile
        Scanner scanner = new Scanner(System.in);
        boolean result = 10 < 5;
        int number = scanner.nextInt();
        String text = scanner.nextLine();
        boolean logical = scanner.nextBoolean();

        if(number > 2){
            System.out.println("Numarul introdus e > 2");
        }

        if(result) {
            System.out.print("Result is true");
            System.out.print("Result is true");
            System.out.print("Result is true");
        }
        else
            System.out.print("Other message");

//        if () {
//
//        } else if (checkCondition() && number > 20) {
//
//        } else if (checkCondition() && number < 20) {
//
//        } else if (checkCondition() && number >= -20) {
//
//        } else if (checkCondition() && number > 0) {
//
//        } else if (checkCondition() && number > 20) {
//
//        } else if (checkCondition() && number > 20) {
//
//        } else {
//
//        }

        int temp = 10;
        String command = "write";
        char ch = 'a';

        switch(command) {
            case "write": {

                break;
            }
            case "edit":
            case "update":
            case "delete":
        }
    }

    public static boolean checkCondition() {
        return true;
    }
}
