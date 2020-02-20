package com.java.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String[] args) {

        //step1: Instantiate the object of Model class
        Employee e1 = new Employee();

        //step2: Set values
//        e1.setId(111);
//        e1.setFirstName("Srujan");
//        e1.setLastName("Varma");

        //step3: Create sessions from sessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();


        //creating sessions from SessionFactory
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Reading an element from the table
        e1=(Employee)session.get(Employee.class,106);
        System.out.println("Read first name of 106 from table: "+e1.getFirstName()+"\nRead last name of 106 from table: "+e1.getLastName());

        // Deleting element from table
       e1=(Employee)session.get(Employee.class,110);
        session.delete(e1);
        //saving the objects
       // session.save(e1);

        session.getTransaction().commit();
        System.out.println("***Successfully saved***");
        session.close();
        sessionFactory.close();
    }
}