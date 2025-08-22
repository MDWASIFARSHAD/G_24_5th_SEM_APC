package com.Spring_ORm_G24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
       
//       Student s =studentdao.fetch();
////       System.out.println(s.getSid()+"  "+ s.getSname());
       
    }
}
