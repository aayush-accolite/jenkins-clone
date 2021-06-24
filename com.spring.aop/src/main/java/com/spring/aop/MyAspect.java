package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	
	@Pointcut("execution(* com.spring.aop.Rectangle.set*(..))")
	public void setPointCut() {}
	
	@Pointcut("within(com.spring.aop.Point)")
	public void within1(){}
	
	@Pointcut("args(Integer)")
	public void argsInt() {}
	
	@After("argsInt()")
	public void argsInt1(JoinPoint jp)
	{
		System.out.println("PointCut Args(Integer) -> "+jp.toString());
	}
	
	@After("within1()")
	public void aa(JoinPoint jp)
	{
		System.out.println("PointCut Within Point Class -> "+jp.toString());
	}
	
	@AfterReturning("within1()")
	public void returnAfter(JoinPoint jp)
	{
		System.out.println("AFTER RETURN -> "+jp.toString());
	}
	
	@AfterThrowing("within1()")
	public void afterThrowing()
	{
		System.out.println("After Throwing");
	}
	
	@After("setPointCut()")
	public void beforem(JoinPoint jp)
	{
		System.out.println("After -> Set Height -> "+jp.toString());
	}
	
	@Around("setPointCut()")
	public void aroun1d(ProceedingJoinPoint p) throws Throwable
	{
		System.out.println("Before Set Height :: Around");
		p.proceed();
		System.out.println("After Set Height :: Around");
	}
	
	
}
