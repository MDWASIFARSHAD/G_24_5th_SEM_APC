package com.Spring_core_05_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Student stud()
	{
//		return new Student();
		Student s = new Student();
		s.setId(1);
		s.setName("wasif");
		List<String> l = new ArrayList<>();
		l.add("java");
		l.add("python");
		l.add("c++");
		s.setCourse(l);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("java", "wasif");
		hm.put("python", "rohit");
		hm.put("c++:", "hasrh");
		s.setCourseAndTrainer(hm);
		
		return s;

	}
	
	@Bean
	public Address add()
	{
		return new Address();
	}

}
