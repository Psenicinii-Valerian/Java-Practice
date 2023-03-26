package com.step.hibernate;

import org.hibernate.AnnotationException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {

    private static SessionFactory factory = buildSessionFactory();

    // Session Factory
    // Session

    public static SessionFactory getFactory() {
        return factory;
    }

    private static SessionFactory buildSessionFactory() {
        try{
            Configuration configure = new Configuration().configure(new File("src\\main\\resources\\hibernate.cfg.xml"));
            return configure.buildSessionFactory();
        } catch (Exception ex) {
            System.err.println(" Eroare de configurare hibernate: " + ex.getMessage());
            throw new RuntimeException(" NU PUTEM LANSA APLICATIA!\n");
        }
    }

    public static void shutdown(){
        factory.close();
    }

}
