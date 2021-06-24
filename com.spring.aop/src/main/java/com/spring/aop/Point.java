package com.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Point {

	int x;
	int y;
	
	public Point()
	{
		
	}
	

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void throwException()
	{
		int a = 10/0;	
		System.out.println("AA");
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
		
	
	
}
