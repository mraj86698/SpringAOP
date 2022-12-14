package com.java.SpringAop.Service;

import com.java.SpringAop.Aspect.Loggable;
import com.java.SpringAop.Model.Circle;
import com.java.SpringAop.Model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	/**
	 * Apply to new method without having to change the point cut expression
	 * @return
	 */
	@Loggable
	//Getters and Setters
	public Circle getCircle() {
		System.out.println("Circle getter is called");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}


}
