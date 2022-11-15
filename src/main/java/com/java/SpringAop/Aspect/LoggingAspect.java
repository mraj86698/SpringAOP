package com.java.SpringAop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/**
 * Logging method to  run using aspect-oriented Configuration
 * We want a method that prints a simple log message to the console
 */
@Aspect
public class LoggingAspect {
	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method called");
	}

}
