package com.Spring_Core_G_24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
        
         Address a=(Address) app.getBean("address");
         
         System.out.println(a.getStreet()+"  "+ a.getCity()+"  "+a.getState());
         
         
         Student s = (Student) app.getBean("student");
         System.out.println(s.getId() +"  "+ s.getName()+  "   "+ s.getCourse()+"  "+s.getCourseAndTrainer()+ " "+ s.getAddress().getCity()+"  "+ s.getAddress().getStreet());
         
         
         
         
    }
}
