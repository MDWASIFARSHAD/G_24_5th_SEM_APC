package com.Spring_ORm_G24;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import Dao.StudentDao;
import Entity.Student;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
       StudentDao studentdao = (StudentDao) app.getBean("studentdao");
          HibernateTemplate h= (HibernateTemplate) app.getBean("hibernateTemplate");
       
//       Student s =studentdao.fetch();
//       System.out.println(s.getSid()+"  "+ s.getSname());
       
//       List<Student> s=studentdao.fetchAll();
//       for(Student s1:s)
//       {
//    	   System.out.println(s1.getSid()+"  "+s1.getSname());
//       }
       
//       Student s = new Student();
//       s.setSid(2);
//       s.setSname("Varun");
//       studentdao.insert(s);
          
//        Student s2=  h.get(Student.class, 1);
//        s2.setSname("Rohit");
//        studentdao.update(s2);
        
        
        Student s3 = h.get(Student.class, 2);
        studentdao.delete(s3);
        
       
       
       
       
       
    }
}
