package it.step.testpackage;

import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {

        // deleting array's elements code:

        Scanner sc = new Scanner(System.in);

        // from elements Hello, World, Brian, Conan

        String[] elements = new String[4];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = sc.nextLine();
        }

        for (int i = 0; i < elements.length; i++) {
            System.out.println("element["+ (i+1) + "] = " + elements[i]);
        }

        System.out.println("After change!!!\n");

        for (int i = 2; i < elements.length; i++) {
            elements[i-1] = elements[i];
        }

        elements[elements.length-1] = null;

        // to elements Hello, Brian, Conan
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null)
            System.out.println("element["+ (i+1) + "] = " + elements[i]);
        }

    }

}
