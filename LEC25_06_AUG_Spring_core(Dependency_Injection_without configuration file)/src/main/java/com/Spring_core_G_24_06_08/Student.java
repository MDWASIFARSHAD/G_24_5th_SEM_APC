package com.Spring_core_G_24_06_08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	
	@Autowired
	private Address1 add;
	
	
	public Address1 getAdd() {
		return add;
	}
	public void setAdd(Address1 add) {
		this.add = add;
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

}
