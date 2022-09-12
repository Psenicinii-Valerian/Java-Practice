package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandomNumber {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        boolean xxx = false;

        System.out.print("Give a random number to see if it coincides with array values = ");
        int x = sc.nextInt();

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(100)-50;
            System.out.println("array[" + (i+1) + "] = "  + array[i]);

            if (x == array[i]) {
                System.out.println("COINCIDENCE! array[" + (i+1) + "] = " + array[i] + " equals given number - " + x);
                xxx = true;
            }

            System.out.println("");
        }

        if (!xxx) {
            System.out.println("The given number - " + x + " isn't in the array");
        }
    }

}

