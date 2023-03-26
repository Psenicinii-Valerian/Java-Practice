package com.step;

import com.step.hibernate.HibernateUtil;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello world hibernate");

        HibernateUtil.shutdown();
    }
}