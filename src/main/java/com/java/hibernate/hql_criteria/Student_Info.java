package com.java.hibernate.hql_criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Random;

public class Student_Info {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student1.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
//        Random random=new Random();
//
//        for (int loop = 1; loop <= 20; loop++) {
//            Student1 student = new Student1();
//            student.setRollno(loop);
//            student.setName("name " + loop);
//            student.setMarks(random.nextInt(50));
//            session.save(student);
//        }
        Query query=session.createQuery(" from Student1");
        List<Student1> stu=query.list();
        for (Student1 s:stu)
        {
            System.out.println(s);
        }

        session.getTransaction().commit();
    }
}
