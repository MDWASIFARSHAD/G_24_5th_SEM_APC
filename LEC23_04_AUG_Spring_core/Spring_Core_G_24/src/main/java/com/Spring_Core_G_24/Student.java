package com.Spring_Core_G_24;

import java.util.List;
import java.util.Map;

public class Student {
	
	private int id;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Map<String, String> getCourseAndTrainer() {
		return courseAndTrainer;
	}
	public void setCourseAndTrainer(Map<String, String> courseAndTrainer) {
		this.courseAndTrainer = courseAndTrainer;
	}
	private String name;
	private List<String> course;
	private Map<String,String> courseAndTrainer;
	
	

}
