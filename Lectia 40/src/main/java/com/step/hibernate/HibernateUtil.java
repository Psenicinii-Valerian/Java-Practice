package com.step.hibernate;

import com.step.model.Address;
import com.step.model.Department;
import com.step.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private final static SessionFactory factory = buildSessionFactory();

    public static SessionFactory getFactory() {
        return factory;
    }

    public static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        // In loc de:: new File("src\\main\\resources\\hibernate.cfg.xml")
        configuration.configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Department.class);


        return configuration.buildSessionFactory();
    }

    public static void shutdown() {
        if (factory!=null) {
            factory.close();
        }
    }

}
