package com.Spring_jdbc_G24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext app = new ClassPathXmlApplicationContext("Spring-jdbc.xml");
    	JdbcTemplate template=(JdbcTemplate)app.getBean("jdbctemplate");
    	
    	String query="insert into student(rollNo,name) values(?,?)";
    	template.update(query,909,"gfg");
    }
}
