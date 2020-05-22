package com.bitacademy.java.paint.point;

import com.bitacademy.java.paint.i.Drawable;

public class Point implements Drawable {

	private int x;
	private int y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x; // this. -> 객체 안에 있는 x (자기 자신을 가르킴 self reference)
					// this() -> 생성자를 호출
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
	
	public void show() {
		System.out.println("점 [x =" + 10 + "," + "y =" + 10 + "]을 그렸습니다.");
	}

	public void show(boolean visible) {
		if(visible) {
			//System.out.println("점 [x =" + 10 + "," + "y =" + 10 + "]을 그렸습니다.");
			show();
			}
		else
		{
			System.out.println("점 [x =" + 10 + "," + "y =" + 10 + "]을 지웠습니다.");
		}
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		show();
	}
	
	
	
}
