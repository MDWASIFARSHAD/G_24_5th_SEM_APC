package com.Spring_AOP_G24;

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
       Service service = (Service) app.getBean("service");
       service.payment();
        
    }
}
