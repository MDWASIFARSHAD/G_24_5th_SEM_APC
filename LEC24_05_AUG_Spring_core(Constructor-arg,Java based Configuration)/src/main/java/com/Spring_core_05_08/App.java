package com.Spring_core_05_08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
//       Student s= (Student) app.getBean("student");
//       
//       System.out.println(s.getId()+"  "+ s.getName()+"  "+s.getCourse()+"   "+s.getCourseAndTrainer());
//       
//       
//       Address add = (Address) app.getBean("address");
//       System.out.println(add.getCity()+"   "+ add.getStreet()+"  "+ add.getState());
    	
    	ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
    	Student s = (Student) app.getBean(Student.class);
    	
    System.out.println(s.getId()+"   "+ s.getName()+"   "+ s.getCourse()+"  "+s.getCourseAndTrainer());
       
    }
}
