package com.java.hibernate.mapping_Realtionships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();

        laptop.setLid(101);
        laptop.setLname("HP");


        Student student= new Student();
        student.setRollnumber(1);
        student.setName("Riyaz");
        student.setMarks(70);
        //student.setLaptop(laptop);
        student.getLaptop().add(laptop);
        laptop.getStudentList().add(student);

        Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(laptop);

        session.save(student);


        session.getTransaction().commit();
    }
}
