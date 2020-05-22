package com.bitacademy.java.paint.text;

import com.bitacademy.java.paint.i.Drawable;

public class GraphicText implements Drawable {

	
	
	private String text;
	public GraphicText(String text) {
		this.text = text;
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("" +text + "를 그렸습니다.");
	}

}
