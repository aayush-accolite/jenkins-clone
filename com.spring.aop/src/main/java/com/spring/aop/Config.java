package com.spring.aop;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.accolite.spring2.shape.Circle;


@Configuration
public class Config {

	@Bean(name="Map")
	public HashMap<String, Point> mapPoints()
	{
		HashMap<String,Point> map = new HashMap<String, Point>();
	    map.put("x1",new Point(30,0));
	    map.put("x2", new Point(100,0));
	    map.put("y1", new Point(30,50));
		map.put("y2", new Point(100,50));
		
		return map;
	}
	
	@Bean(name="x1")
	public Point pointx1()
	{
		Point p = new Point();
		p.setX(0);
		p.setY(0);
		return p;
	}
	
	@Bean(name="x2")
	public Point pointx2()
	{
		Point p = new Point();
		p.setX(20);
		p.setY(0);
		return p;
	}
	
	@Bean(name="y1")
	public Point pointy1()
	{
		Point p = new Point();
		p.setX(0);
		p.setY(10);
		return p;
	}
	
	@Bean(name="y2")
	public Point pointy2()
	{
		Point p = new Point();
		p.setX(20);
		p.setY(10);
		return p;
	}
	
	@Bean
	public Rectangle rectangle()
	{
		 Rectangle r = new  Rectangle();
		 r.setHeight(10);
		 r.setWidth(20);
		return r;
	}
	
}
