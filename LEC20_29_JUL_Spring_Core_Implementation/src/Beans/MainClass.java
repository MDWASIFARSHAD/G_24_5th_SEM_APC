package Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
	ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
		HelloBeans  h =(HelloBeans)app.getBean("hello");
		
		System.out.println(h.getName());
		System.out.println(h.getNumber());

	}

}
