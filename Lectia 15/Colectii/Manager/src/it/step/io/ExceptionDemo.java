package it.step.io;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String path = null;
        boolean pathCorrect = false;

        while (!pathCorrect){

            // open file from the disk
            try {
                path = getPath();
                verifyPermission(path);
                pathCorrect = true;
            } catch (FileNotFoundException | FileNotAccessibleException ex) {
                System.out.println("Fisierul nu poate fi gasit sau accesat. Introduceti din nou: " +  ex.getMessage());
            } catch (InterruptedException ex) {
                System.out.println("Thread sleep");
            }

            timer();
        }

        // copy the file into another directory
        copy("C:\\dest\\file.txt", "C:\\dest\\file.txt");

        // show the file size of the disk
        showSize("C:\\dest\\file.txt");

    }

    public static String getPath() throws InterruptedException {
        try {
            System.out.println("Introduceti o cale");
            return sc.nextLine();
        } catch (Exception ex){
            System.out.println("Am prins o eroare");
            Thread.sleep(2000);
            return "C:\\calea default.txt";
        }
    }

    public static void verifyPermission (String path) throws FileNotFoundException, FileNotAccessibleException {
        // verify path
        if (path.startsWith("C:")) {
            System.out.println("Tot okay, calea este acceptata");
        } else {
            throw new FileNotFoundException("Nu se accepta cai care nu incep cu C:");
        }

        if (!path.contains(".txt")) {
            throw new FileNotAccessibleException("No acces");
        }

        // open file;
    }

    public static void copy (String source, String dest) {
        // verify dest
        // copy from source to dest
    }

    public static void showSize (String file) {
        // open file
        // extract size
    }

    public static void timer() {
        try{
            for (int i = 1; i <= 60; i++) {
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Am prins eroarea interrupted exception");
        }
    }

}
