package it.step;

import it.step.Employee;
import it.step.Gender;

import java.util.Scanner;

public class EnumDemo {

    public static void main(String[] args) {

        Employee empl = new Employee();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println(" Introduceti genul persoanei (MALE/FEMALE): ");
            String gen = sc.nextLine();

            try {
                Gender eGen = Gender.getGender(gen);
                empl.setGen(eGen);
                break;

            } catch (IllegalArgumentException ex) {
                System.out.println(" Nu putem lucra cu valorea respectiva!");
            }
        }

//        empl.setGen(gen);
//        if(gen.equalsIgnoreCase("M")) {
//            empl.setGen(Gender.MALE);
//        } else if (gen.equalsIgnoreCase("F")) {
//            empl.setGen(Gender.FEMALE);
//        } else {
//            System.out.println(" Nu putem lucra cu valorea respectiva!");
//        }

//        if (empl.getGen() == Gender.MALE) {
//
//        } else if (empl.getGen() == Gender.FEMALE) {
//
//        }

//        Gender[] genders = Gender.values();
//        for (Gender gender: genders){
//            System.out.println(gender);
//        }

        System.out.println(" Ati introdus genul persoanei: ");
        System.out.println(empl.getGen()); // toString()




    }
}
