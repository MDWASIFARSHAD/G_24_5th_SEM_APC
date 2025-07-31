package com.Spring_Introduction_G24;

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
         BeansHello h= (BeansHello)  app.getBean("hello");
         
         System.out.println(h.getName() );
         System.out.println(h.getNumber() );
         
          BeansHello1 h1 =(BeansHello1)app.getBean("hello1");
          
          h1.getRollno();
          h1.getParentName();

    }
}
