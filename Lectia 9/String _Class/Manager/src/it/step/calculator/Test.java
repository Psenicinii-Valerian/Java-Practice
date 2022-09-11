package it.step.calculator;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

    // sa se afiseze primele 10 numere naturale pare

    /*
        for (int i=0, j=0; i < 10; i++, j+=2){
            System.out.println(i+1 + ". " + j);
        }
    */

    /*
        int i = 0;
        int j = 0;

        while (i++ < 10){

            System.out.println(i + ". " + j);
            j+=2;
        }
    */

        Scanner input = new Scanner(System.in);

    /*
        int[] v = new int[10];

        System.out.print("Dati numarul de numere dorite: ");
        int n = input.nextInt();
        input.nextLine();

        System.out.println("Dati numerele: ");

        for (int i=0; i < n; i++)
        {
            v[i] = input.nextInt();
        }

        System.out.println(' ');
        System.out.println("Inversul numerelor inversate este: ");

        for (int i = n-1; i>=0; i--)
        {
            System.out.println(v[i]);
        }
    */

        System.out.print("Insert the number you want to reverse: ");
        int number = input.nextInt();

        int reverseNumber = 0;
        int temporaryNumber = number;
        int remainder = 0; // or rest

        // 1 2 3 4

        while(temporaryNumber!=0){
            remainder = temporaryNumber%10;
            reverseNumber = reverseNumber*10 + remainder;
            temporaryNumber /= 10;
        }

        System.out.println("The reversed number is: " + reverseNumber);



    }
}

