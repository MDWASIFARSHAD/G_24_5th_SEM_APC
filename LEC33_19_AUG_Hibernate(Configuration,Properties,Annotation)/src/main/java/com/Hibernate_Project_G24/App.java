package com.Hibernate_Project_G24;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cf = new Configuration();
        cf.configure("hiber.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
//        Session session = sf.openSession();
//        session.beginTransaction();
//        Student s= new Student(1,"wasif","rajpura");
//        session.save(s);
//        session.getTransaction().commit();
//        session.close();
        
//        Session session1 = sf.openSession();
//        Student student = session1.get(Student.class, 1);
//        System.out.println(student.getRollNo()+"  "+student.getName()+"  "+ student.getCity());
        
        
        //update
       Session session2 = sf.openSession();
       Student student = session2.get(Student.class, 1);
       session2.beginTransaction();
       student.setCity("Chandigarh");
       session2.update(student);
       session2.getTransaction().commit();
       
       
       //delete
       Session session3 = sf.openSession();
       Student student1 = session2.get(Student.class, 1);
       session3.delete(student1);

       


        
    }
}
