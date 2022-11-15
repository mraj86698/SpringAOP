package com.java.SpringAop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LoggingAspect {
	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method called");
	}
	/**
	 * Specifying the Class which this getName Method
	 */
	@Before("execution(public String com.java.SpringAop.Model.Circle.getName())")
	public void LoggingAdvice1() {
		System.out.println("Advice run. Get Second  Method called");
	}
	/**
	 * Same Expression I have Using WildCard
	 * get() open close is zero Argument
	 * get(*) apply star for match one or more arguments
	 * get(...) apply dot dot expression for any match of know for zero or more Arguments
	 */
	@Before("allGetters()")
	public void LoggingAdvice2() {
		System.out.println("Advice run. Get third Method called");
	}
	@Before("allGetters()")
	public void LoggingAdvice3() {
		System.out.println("Advice run. Get fourth Method called");
	}
	/**
	 * one particular point cut expression to get applied to different advice methods
	 * annotate a dummy method then use a dummy method reference for before annotation
	 */
	@Pointcut("execution (* get*())")
	public void allGetters() {}

}
