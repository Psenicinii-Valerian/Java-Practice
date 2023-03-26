package com.step.test;

public class Person {

    String name;
    Passport passport;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", passport=" + passport +
                '}';
    }
}

class Passport
{
    String idnp;

    @Override
    public String toString() {
        return "Passport{" +
                "idnp='" + idnp + '\'' +
                '}';
    }
}

class Main
{
    public static void main(String[] args)
    {
        Passport passport = new Passport();
        passport.idnp="12314a412412s";

        Person pers  = new Person();
        pers.name = "John Smith";
        pers.passport = passport;

        System.out.println(pers);
        System.out.println(passport);
    }
}