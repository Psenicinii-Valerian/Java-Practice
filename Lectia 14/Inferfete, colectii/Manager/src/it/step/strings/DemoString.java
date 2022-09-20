package it.step.strings;

import java.util.SplittableRandom;

public class DemoString {
    public static void main(String[] args) {

        String hw = "Hello world!"; // String pool
        String hwCopy = "Hello world!";
        String hw2 = new String("Hello world!");

//      String hw3 = new String(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'});
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String hw3 = new String(chars);

        String msg = "";

        for (int i = 0; i < chars.length; i++) {
            msg += chars[i];
        } // results same as String hw3 = new String(chars);

        System.out.println(hw == hwCopy);
        System.out.println(hw2 == hw3);

        // Obiectele se compara prin metoda .equals()
        System.out.println("Equals: " + hw2.equals(hw3));

        String helloWorld = "HELLO WORLD!";

        // Obiectele se pot compara si fara a se lua in considerare daca literele sunt minuscule sau majuscule) prin .equalsIgnoreCase()
        System.out.println("Ignore case: " + hw3.equalsIgnoreCase(helloWorld));

        // Operatii interesante cu String

        //Concatinarea sirurilor
        String x = "hello" + "world";
        String x2 = "hello".concat(" world");

        // Aflarea marimii sirului
        System.out.println(hw.length());

        // Verificam daca sirul contine o parte specifica
        System.out.println(hw.contains("Hello"));

        // Putem modifica continutul sirului (caractere)
        System.out.println(hw.replace('l', 'R'));
        System.out.println(hw.replace("He", "Wo"));

        // Putem verifica indexul caracterului
        System.out.println(hw.indexOf('w'));

        // Putem separa valorile dupa un anumit caracter
        String names = "John, Peter, William";
        String[] namesArray = names.split(",");

        for( String name: namesArray) {
            System.out.println("Name: " + name);
        }






    }
}
