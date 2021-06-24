package com.spring.aop;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	 public static void main(String[] args)
	{
		 
	//Question 1	 
	ApplicationContext context = new  AnnotationConfigApplicationContext(Config.class);
	Rectangle r = (Rectangle) context.getBean(Rectangle.class);
	Point x1 = (Point) context.getBean("x1",Point.class);
	Point x2 = (Point) context.getBean("x2",Point.class);
	Point y1 = (Point) context.getBean("y1",Point.class);
	Point y2 = (Point) context.getBean("y2",Point.class);
	
	HashMap<String,Point> map = (HashMap<String, Point>) context.getBean("Map");
	
	r.setX1(x1);
	r.setX2(x2);
	r.setY1(y1);
	r.setY2(y2);
	
	System.out.println(r+"\n");

	r.setX1(map.get("x1"));
	r.setX2(map.get("x2"));
	r.setY1(map.get("y1"));
	r.setY2(map.get("y2"));
	
	System.out.println(r);
	
	
	//Question 2
	
	AbstractApplicationContext context1 =  new ClassPathXmlApplicationContext("Spring.xml"); 
	System.out.println("For After Throwing Please Uncomment the x.throwException() Line 52");
	Point x = (Point) context1.getBean("x1",Point.class);
	Rectangle r1 = (Rectangle) context1.getBean(Rectangle.class);
	r1.setHeight(20);
	r1.getHeight();
	x.getX();
	x.setX(10);
	
//	x.throwException();
	
	}
	
}
