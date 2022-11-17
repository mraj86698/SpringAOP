package com.java.SpringAop.Service;

import com.java.SpringAop.Aspect.LoggingAspect;
import com.java.SpringAop.Model.Circle;

public class ShapeServiceProxy extends ShapeService {
	@Override
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
