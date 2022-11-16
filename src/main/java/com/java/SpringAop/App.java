package com.java.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.SpringAop.Service.ShapeService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService=context.getBean("shapeService",ShapeService.class);
		//shapeService.getCircle().setName("DummyName");

		//shapeService.getCircle().setNameandReturn("DummyName");

		shapeService.getCircle();

	}
}
