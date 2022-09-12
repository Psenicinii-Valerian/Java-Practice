package arrays;

import java.util.Random;

public class ShowCharacters {

    public static void main(String[] args) {

        char[] characters = new char[100];
        Random randomCharacter = new Random();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) randomCharacter.nextInt(255);
        }

        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }

    }
}
