package com.java.SpringAop.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class LoggingAspect {
//	@Before("execution(public String getName())")
//	public void LoggingAdvice() {
//		System.out.println("Advice run. Get Method called");
//	}
//	/**
//	 * Specifying the Class which this getName Method
//	 */
//	@Before("execution(public String com.java.SpringAop.Model.Circle.getName())")
//	public void LoggingAdvice1() {
//		System.out.println("Advice run. Get Second  Method called");
//	}
//	/**
//	 * Same Expression I have Using WildCard
//	 * get() open close is zero Argument
//	 * get(*) apply star for match one or more arguments
//	 * get(...) apply dot dot expression for any match of know for zero or more Arguments
//	 * to get all getters and all Circle Methods
//	 */
//	@Before("allGetters() && allCircleMethods()")
//	public void LoggingAdvice2() {
//		System.out.println("Advice run. Get third Method called");
//	}
//
//
////	@Before("allGetters()")
////	public void LoggingAdvice3() {
////		System.out.println("Advice run. Get fourth Method called");
////	}
//	/**
//	 * one particular point cut expression to get applied to different advice methods
//	 * annotate a dummy method then use a dummy method reference for before annotation
//	 */
////	@Pointcut("execution (* get*())")
////	public void allGetters() {}
//	/**
//	 * A Point cut expression which is something like this at point cut execution,
//	 *  irrespective of public or anything,return type,method name ,parameter
//	 *  I Print all Circle Methods
//	 *
//	 */
////	@Pointcut("execution (* *com.java.SpringAop.Model.Circle.*(..))")
////	public void allCircleMethods() {}
//	/**
//	 * I Specify within and i give the class name again
//	 */
//	@Pointcut("within (com.java.SpringAop.Model.Circle)")
//	public void allCircleMethods() {}
////	/**
////	 * dot dot inside a method parameter is it can be the class add the route package
////	 * its 0 or more thats the dot dot means
////	 */
////	@Pointcut("within (com.java.SpringAop.Model..*)")
////	public void allCircleMethods() {}
//
//	/**
//	 * JoinPoint here which is an argument that spring passes whenever an advice is run contains 	information about the method.
//	 * JoinPoint has information about the actual method call that triggered this advice
//	 * If i write an advice with a join point as an argument
//	 *
//	 * Advice types of Spring Aop are @Before,@After,@AfterReturning,@AfterThrowing And @Around
//	 * @param joinPoint
//	 */
//	@Before("allCircleMethods()")
//	public void LoggingAdvice5(JoinPoint joinPoint) {
//		//System.out.println(joinPoint.getTarget());
//	}
//	/**
//	 * Arguments that passed to the target method and the same arguement passed to the advice
//	 * input argument that passed and enter the point cut expression and just specyfying the returning property
//	 * Mention this property in my advice argument
//	 *
//	 */
//	@AfterReturning(pointcut="args(name)",returning="returnString")
//	public void StringArgumentMethods(String name,String returnString) {
//		System.out.println("A Method that takes String Argument has  been called,The value is "+ name+". The OutPut Values is "+returnString);
//	}
//	/**
//	 * After throwing catch all methods that match the pointcut expression and they are throwing runtime exception
//	 * @param name
//	 * @param ex
//	 */
//	@AfterThrowing(pointcut="args(name)",throwing="ex")
//	public void exceptionAdvice (String name,Exception ex) {
//		System.out.println("An Exception has been thrown"+ex);
//	}
	/**
	 * To creating an Around Advice
	 * @Loggable using Apply to new method without having to change the point cut expression
	 * @param proceedingJoinPoint
	 * @return
	 */
	//@Around("allGetters()")
	//@Around("@annotation(com.java.SpringAop.Aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint  proceedingJoinPoint) {
		Object returnValue=null;
		try {
			System.out.println("Before Advice");
			returnValue =proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		}catch (Throwable e) {
			System.out.println("After Throwing");

		}
		System.out.println("After Finally");
		return returnValue;


	}
//	/**
//	 * @PointCut Containing Two information over here one is the name of the pointer and another one is Expression
//	 */
//	//@Pointcut("execution (* get*())")
//	public void allGetters() {}

	public void loggingAdvice() {
		System.out.println("Logging from the Advice");
	}

}
