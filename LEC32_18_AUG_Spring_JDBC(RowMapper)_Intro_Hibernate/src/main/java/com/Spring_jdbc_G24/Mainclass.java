package com.Spring_jdbc_G24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.StudentDao;
import Entity.Student;

public class Mainclass {
	
	public static void main(String[] args) {
	ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
	
	 StudentDao studentdao=(StudentDao)app.getBean("studentdao");
	 Student s = (Student)app.getBean("student");
	 
	
	 
	 studentdao.insert(s);
	 
	Student student = studentdao.fetch();
	System.out.println(student.getRollNo()+"  "+ student.getName());
	}

}
