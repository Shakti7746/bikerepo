package com.shakti.Bike;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Bike {
	private int id;
	private String name;
	
	public Bike() {
		this.id=5;
		this.name="Shakti";
		System.out.println("running constructer");
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
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + "]";
	}
}
