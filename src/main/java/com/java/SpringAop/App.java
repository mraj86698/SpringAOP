package com.java.SpringAop;

import com.java.SpringAop.Service.FactoryService;
import com.java.SpringAop.Service.ShapeService;

public class App {
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		ShapeService shapeService=context.getBean("shapeService",ShapeService.class);
		// shapeService.getCircle().setName("DummyName");

		// shapeService.getCircle().setNameandReturn("DummyName");

		// shapeService.getCircle();
		/**
		 * To Create a Own factory service which initializing a bean and then we are calling a method of that bean
		 */

		FactoryService factoryService=new FactoryService();
		ShapeService shapeService=(ShapeService) factoryService.getBean("shapeService");
		shapeService.getCircle();
	}
}
