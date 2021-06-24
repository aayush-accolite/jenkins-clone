package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rectangle {

	@Autowired
	Point x1;
	@Autowired
	Point x2;
	@Autowired
	Point y1;
	@Autowired
	Point y2;
	
	int width;
	int height;
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Point getX1() {
		return x1;
	}
	public void setX1(Point x1) {
		this.x1 = x1;
	}
	public Point getX2() {
		return x2;
	}
	public void setX2(Point x2) {
		this.x2 = x2;
	}
	public Point getY1() {
		return y1;
	}
	public void setY1(Point y1) {
		this.y1 = y1;
	}
	public Point getY2() {
		return y2;
	}
	public void setY2(Point y2) {
		this.y2 = y2;
	}
	
	@Override
	public String toString() {
		return "Rectangle:\nx1=" + x1 + "\nx2=" + x2 + "\ny1=" + y1 + "\ny2=" + y2 + "\nwidth=" + width + "\nheight="
				+ height + "";
	}
	
	
	
}
