package com.java.SpringAop.Model;

public class Circle {
	private String name;
	//Getters and Setters
	public String getName() {
		//System.out.println("Circle getter is called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//System.out.println("Circle setter is called");
		throw (new RuntimeException());
	}
	public String setNameandReturn(String name) {
		this.name = name;
		//System.out.println("Circle setter is called");
		return name;
	}

}
