package com.step.util;

import com.step.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {

    private final static SessionFactory factory = buildSessionFactory();

    public static SessionFactory getFactory() {
        return factory;
    }

    public static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure(new File("src\\main\\resources\\hibernate.cfg.xml"));
        configuration.addAnnotatedClass(Employee.class);

        return configuration.buildSessionFactory();
    }

    public static void shutDown() {
        if (factory!=null) {
            factory.close();
        }
    }
}
