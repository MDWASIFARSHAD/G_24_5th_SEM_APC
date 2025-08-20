package com.Hibernate_Project_G24;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entities.Address;
import Entities.Answer;
import Entities.Question;
import Entities.Student;

public class MainClass {
	
	public static void main(String[] args) {
	
		 Configuration cf = new Configuration();
	        cf.configure("hiber.cfg.xml");
	        SessionFactory sf = cf.buildSessionFactory();
	        
	        Session session = sf.openSession();
	        
//	        Student student = new Student();
//	        student.setSid(1);
//	        student.setSname("wasif");
//	        student.setScourse("java");
//	        
//	        Address add = new Address();
//	        add.setCity("rajpura");
//	        add.setState("punjab");
//	        add.setCountry("india");
//	        
//	        student.setAddress(add);
//	        
//	        session.beginTransaction();
//	        session.save(add);
//	        session.save(student);
//	        session.getTransaction().commit();
//	        session.close();
	        
	        Question q = new Question();
	        q.setQid(1);
	        q.setQuestion("What is Java");
	        
	        
	        Answer a = new Answer();
	        a.setAid(101);
	        a.setAnswer("Java is Programming lanaguage");
	        
	        Answer a1 = new Answer();
	        a.setAid(102);
	        a.setAnswer("Java has inheritance");
	        
	        List<Answer> l = new ArrayList<>();
	        l.add(a1);
	        l.add(a);
	        
	        
	        q.setAnswer(l);
	        
	        session.beginTransaction();
	        session.save(a);
	        session.save(q);
	        session.getTransaction().commit();
	        session.close();
	        
	        
	        
	}

}
