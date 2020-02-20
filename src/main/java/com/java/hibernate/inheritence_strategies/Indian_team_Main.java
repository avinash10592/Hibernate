package com.java.hibernate.inheritence_strategies;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Indian_team_Main {
    public static void main(String[] args) {
        //creating sessionfactory obj
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        //creating session obj
        Session session = sessionFactory.openSession();

        //creating object's for teamindia/batsman/bowler class
        TeamIndia ravi=new TeamIndia("Ravi","Sastri");
        Batsman rohit=new Batsman("Right",256);
        rohit.setFirstname("Rohit");
        rohit.setLastname("Sharma");
        Batsman dhoni=new Batsman("Right",183);
        dhoni.setFirstname("Ms");
        dhoni.setLastname("Dhoni");
        Batsman virat=new Batsman("Right",183);
        virat.setFirstname("Virat");
        virat.setLastname("Kohli");
        Batsman raina=new Batsman("Left",153);
        raina.setFirstname("Suresh");
        raina.setLastname("Raina");

        Bowler nehera=new Bowler("Right","6/21");
        nehera.setFirstname("Ashish");
        nehera.setLastname("Nehera");
        Bowler bhuvi=new Bowler("Right","5/40");
        bhuvi.setFirstname("Bhuvaneswar");
        bhuvi.setLastname("Kumar");
        Bowler sir=new Bowler("Right","7/21");
        sir.setFirstname("Rvindara");
        sir.setLastname("Jadeja");


        Transaction transaction=session.beginTransaction();
        session.save(ravi);
        session.save(rohit);
        session.save(dhoni);
        session.save(virat);
        session.save(raina);
        session.save(nehera);
        session.save(bhuvi);
        session.save(sir);

        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Execution completed......");
    }
}
