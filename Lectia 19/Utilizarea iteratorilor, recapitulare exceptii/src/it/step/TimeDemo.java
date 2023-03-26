package it.step;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) throws InterruptedException {

//  !!! Clasa LocalDate are constructorii privati, deci obiectele acesteia nu pot fi creati prin cuvantul-cheie "new":
//        LocalDate l = new LocalDate();
//        LocalDate l1 = new LocalDate(1978, 19, 10);
//        LocalDate l2 = new LocalDate("");

        String s = "Text";
        s = new String("Text"); // tot nu este corect


//       LocalDateTime current = LocalDateTime.now(); // 25/10/2022 - este aceeasi ca si instructiunea de mai jos
//       LocalDateTime current = LocalDateTime.from(LocalDateTime.now()); // 25/10/2022 - este aceeasi ca si instructiunea de mai sus

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");

        LocalDate current = LocalDate.now();
//        System.out.println(formatter.format(current));

        LocalDate date = LocalDate.parse("05-07-22", formatter);

        System.out.println(date.format(formatter)); // este aceeasi ca si instructiunea de mai jos
        System.out.println(formatter.format(date)); // este aceeasi ca si instructiunea de mai sus
        System.out.println(date);


        LocalDateTime time = LocalDateTime.now();

        LocalDate specific = LocalDate.of(1990, 10, 25);
        LocalDateTime full = specific.atTime(10,10,10);

        long value = specific.toEpochDay();
//        System.out.println(value);

        LocalDate obj = LocalDate.ofEpochDay(value);
//        System.out.println("OBJ = " + obj  );

        LocalDate specific2 = LocalDate.of(1990, Month.OCTOBER, 10);
        LocalDate fromString = LocalDate.parse("1978-10-10"); // ISO 8601 - YYYY-MM-DD

        LocalTime now = LocalTime.now();

//        LocalDateTime dateTime = LocalDateTime.of(LocalDate, LocalTime);
//        LocalDateTime dateTime2 = LocalDateTime.of();


//        System.out.println("Current date = " + current);
//
//        current = current.plusDays(1545);
//        System.out.println("Current date +1545 days = " + current);
//
//        System.out.println("Current time = " + time);

//        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME; // DD/MM/YYYY
        DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd-MMMMM-yy");

//        while (true) {
//            time = LocalDateTime.now();
//            System.out.println(custom.format(time));
//            Thread.sleep(1000);
//        }



    }
}
