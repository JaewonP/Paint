package com.bitacademy.java.paint.point;

public class ColorPoint extends Point {


	private String Color;
	
	public ColorPoint() {

		
	}
	
	public ColorPoint(int x, int y, String color) {
		setX(x);
		setY(y);
		this.Color = color;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		this.Color = color;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("점 [x =" + getX() + "," + "y =" + getY() + ",color ="+ Color +"]을 그렸습니다.");
	}
	
	

	
}
