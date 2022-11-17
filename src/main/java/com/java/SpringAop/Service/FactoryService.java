package com.java.SpringAop.Service;

import com.java.SpringAop.Model.Circle;
import com.java.SpringAop.Model.Triangle;

public class FactoryService {
	public Object getBean(String beanType) {
		if(beanType.equals("shapeService"))return new ShapeServiceProxy();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triangle"))return new Triangle();
		return null;
	}

}
