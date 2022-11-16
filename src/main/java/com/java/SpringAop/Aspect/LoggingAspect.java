package com.java.SpringAop.Aspect;

import org.aspectj.lang.JoinPoint;
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
	 * to get all getters and all Circle Methods
	 */
	@Before("allGetters() && allCircleMethods()")
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
	/**
	 * A Point cut expression which is something like this at point cut execution,
	 *  irrespective of public or anything,return type,method name ,parameter
	 *  I Print all Circle Methods
	 *
	 */
//	@Pointcut("execution (* *com.java.SpringAop.Model.Circle.*(..))")
//	public void allCircleMethods() {}
	/**
	 * I Specify within and i give the class name again
	 */
	@Pointcut("within (com.java.SpringAop.Model.Circle)")
	public void allCircleMethods() {}
//	/**
//	 * dot dot inside a method parameter is it can be the class add the route package
//	 * its 0 or more thats the dot dot means
//	 */
//	@Pointcut("within (com.java.SpringAop.Model..*)")
//	public void allCircleMethods() {}

	/**
	 * JoinPoint here which is an argument that spring passes whenever an advice is run contains 	information about the method.
	 * JoinPoint has information about the actual method call that triggered this advice
	 * If i write an advice with a join point as an argument
	 * @param joinPoint
	 */
	@Before("allCircleMethods()")
	public void LoggingAdvice5(JoinPoint joinPoint) {
		//System.out.println(joinPoint.getTarget());
	}
	/**
	 * Arguments that passed to the target method and the same arguement passed to the advice
	 *
	 */
	@Before("args(String)")
	public void StringArgumentMethods() {
		System.out.println("A Method that takes String Argument has  been called");
	}

}
