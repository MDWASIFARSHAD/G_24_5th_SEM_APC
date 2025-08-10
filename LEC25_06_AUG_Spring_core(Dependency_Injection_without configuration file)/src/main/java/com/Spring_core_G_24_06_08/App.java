package com.Spring_core_G_24_06_08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import SpringBEan.Address;

/**
 * Hello world!
 *
 */

@ComponentScan("com.Spring_core_G_24_06_08")
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app = new AnnotationConfigApplicationContext(App.class);
       
       Student s = (Student) app.getBean(Student.class);
       s.setId(20);
       s.setName("wasif");
       System.out.println(s.getId());
       System.out.println(s.getName());
       
//       s.setAdd(null);
       
//       s.setAdd();
    
       System.out.println(s.getAdd().getCity());
       
       Address1 add1 = (Address1) app.getBean(Address1.class);
       System.out.println(add1.getCity());
    }
}
