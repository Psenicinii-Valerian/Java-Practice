package com.step.model;

import com.step.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sun.awt.EmbeddedFrame;

import java.util.List;

public class EmployeeDAO { // Data Acces Object

    // Create
    public void create(Employee employee) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee);
        transaction.commit();
        session.close();
    }

    // Read
    public List<Employee> findAll(){
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        // Structured query language
        // --> HQL - Hibernate query language
        Query findAll = session.createQuery("FROM Employee");
        List<Employee> employees = findAll.list();
        transaction.commit();
        session.close();

        return employees;
    }

    // Find by name
    public List<Employee> findByName(String name) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Employee where name like :name");
        query.setParameter("name", name);
        List<Employee> employees = query.list();
        transaction.commit();
        session.close();

        return employees;
    }

    // Find by id
    public Employee findById(Integer id){
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee emp = session.get(Employee.class, id);
        transaction.commit();
        session.close();

        return emp;
    }

    // Update
    public void update(Employee updated) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(updated);
        transaction.commit();
        session.close();
    }

    // Delete
    public void delete(Integer id){
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = session.get(Employee.class, id);
        session.delete(employee);
        transaction.commit();
        session.close();
    }

}
