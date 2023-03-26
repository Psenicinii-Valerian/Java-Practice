package com.step.model;

import com.step.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.time.LocalDate;
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

    // select * from employees limit 10 offset 10; // 11 --> 20
    public List<Employee> findPage(int page, int rowsPerPage){
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Employee> query = (Query<Employee>) session.createQuery("FROM Employee ");
        query.setFirstResult((page-1) * rowsPerPage); // 1 - 0; 2 - 10
        query.setMaxResults(page * rowsPerPage); // 1 - 10; 2 - 20
        List<Employee> employees = query.list();
        tx.commit();
        session.close();
        return employees;
     }

    public List<Employee> findPage(int page, int rowsPerPage, String filter) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Employee> query = session.createQuery("FROM Employee where name like :name", Employee.class);
        query.setParameter("name", '%' + filter + '%');
        query.setFirstResult((page - 1) * rowsPerPage);
        query.setMaxResults(page * rowsPerPage);
        List<Employee> employees = query.list();
        tx.commit();
        session.close();
        return employees;
    }

    public long countAll() {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Long> query = (Query<Long>) session.createQuery("select count (*) FROM Employee");
        long count = query.getSingleResult();
        tx.commit();
        session.close();
        return count;
    }

     // select count(*) from employee
    public long countAll(String filter) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Long> query = (Query<Long>) session.createQuery("select count (*) FROM Employee where name like :filter or surname like :filter");
        // select * from T where name like 'test' --> select * from T where name = 'test'
        // select * from T where name like 'test%'
        // select * from T where name like '%test'
        // select * from T where name like '%test%' - wildcard
        query.setParameter("filter", '%' +  filter + '%');
        long count = query.getSingleResult();
        tx.commit();
        session.close();
        return count;
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
