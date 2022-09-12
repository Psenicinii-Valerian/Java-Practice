package arrays;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean xxx = false;

        int x = 0;
        int[] array = new int[10];

        while (!xxx) {

            try {
                System.out.print("Enter array capacity = ");
                x = sc.nextInt();
                array = new int[x];

                xxx = true;

            } catch (NegativeArraySizeException ex) {
                System.out.println("Give a positive capacity of array!");
            }
        }

        int sumArray = 0;

        System.out.println("Give array numbers:");

        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
            sumArray += array[i];
        }

        System.out.println("Sum of the gives numbers = " + sumArray);

    }
}
