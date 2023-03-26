package com.step.model.dao;

import com.step.hibernate.HibernateUtil;
import com.step.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;

public class DepartmentDao { // Data Acces Object

    // Create with return
    public Integer create(Department department) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Integer id = (Integer)session.save(department);

        session.save(department);
        transaction.commit();
        session.close();

        return id;
    }

    // Create without return (void)
    public void createVoid(Department depart) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(depart);
        transaction.commit();
        session.close();

    }

    // create with List<Department>
    public void create(List<Department> departments) {
        SessionFactory sessionFactory = HibernateUtil.getFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        for (int index = 0; index < departments.size(); index++) {
            session.save(departments.get(index));
            if(index % 20 == 0) {
                session.flush();
                session.clear();
            }
        }
        tx.commit();
        session.close();
    }

    // Read
    public List<Department> findAll(){
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        // Structured query language
        // --> HQL - Hibernate query language
        Query findAll = session.createQuery("FROM Department");
        List<Department> departments = findAll.list();
        transaction.commit();
        session.close();

        return departments;
    }

    // select * from departments limit 10 offset 10; // 11 --> 20
    public List<Department> findPage(int page, int rowsPerPage){
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Department> query = (Query<Department>) session.createQuery("FROM Department ");
        query.setFirstResult((page-1) * rowsPerPage); // 1 - 0; 2 - 10
        query.setMaxResults(page * rowsPerPage); // 1 - 10; 2 - 20
        List<Department> departments = query.list();
        tx.commit();
        session.close();
        return departments;
    }

    public List<Department> findPage(int page, int rowsPerPage, String filter) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Department> query = session.createQuery("FROM Department where name like :name", Department.class);
        query.setParameter("name", '%' + filter + '%');
        query.setFirstResult((page - 1) * rowsPerPage);
        query.setMaxResults(page * rowsPerPage);
        List<Department> departments = query.list();
        tx.commit();
        session.close();
        return departments;
    }

    public long countAll() {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Long> query = (Query<Long>) session.createQuery("select count (*) FROM Department");
        long count = query.getSingleResult();
        tx.commit();
        session.close();
        return count;
    }

    // select count(*) from department
    public long countAll(String filter) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query<Long> query = (Query<Long>) session.createQuery("select count (*) FROM Department where name like :filter");
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
    public List<Department> findByName(String name) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Department where name like :name");
        query.setParameter("name", name);
        List<Department> departments = query.list();
        transaction.commit();
        session.close();

        return departments;
    }

    // Find by id
    public Department findById(Integer id){
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Department depart = session.get(Department.class, id);
        transaction.commit();
        session.close();

        return depart;
    }

    // Update
    public void update(Department updated) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(updated);
        transaction.commit();
        session.close();
    }


    public Department update(Integer id, String name, String description) {
        SessionFactory sessionFactory = HibernateUtil.getFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Department department = session.get(Department.class, id);
        department.setName(name);
        department.setDescription(description);
        session.update(department);
        tx.commit();
        session.close();
        return department;
    }

    // Delete
    public void delete(Integer id){
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Department department = session.get(Department.class, id);
        session.delete(department);
        transaction.commit();
        session.close();
    }

}
