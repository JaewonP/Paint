package com.bitacademy.java.paint.main;

import com.bitacademy.java.paint.i.Drawable;
import com.bitacademy.java.paint.point.ColorPoint;
import com.bitacademy.java.paint.point.Point;
import com.bitacademy.java.paint.shape.Circle;
import com.bitacademy.java.paint.shape.Rectangle;
import com.bitacademy.java.paint.shape.Shape;
import com.bitacademy.java.paint.shape.Triangle;
import com.bitacademy.java.paint.text.GraphicText;

public class PaintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		draw(point1);
		
		//point1.disappear();
		point1.show(false);
		
		Point point2 = new Point(100,200);
		draw(point2);
		
		
		Point point3 = new ColorPoint();
		point3.setX(30);
		point3.setY(20);
		((ColorPoint)point3).setColor("red");
		draw(point3);
	
		point3.show(false);
		point3.show(true);
		
		//=====================================
		Shape shape1 = new Triangle();
		//drawTriangle(triangle);
		draw(shape1);
				
		Shape shape2 = new Rectangle();
		draw(shape2);
				
		draw(new Circle());
		
		//============================================
		draw(new GraphicText("Hello"));
		
		//========================================
		
		//instatnceof 클래스 
		//상속관계만 연산 할 수 있다. 
		Shape s = new Rectangle();
		
		
		System.out.println( s instanceof Shape);
		System.out.println( s instanceof Rectangle);
		System.out.println( s instanceof Triangle);
		System.out.println( s instanceof Object);
		
		Rectangle r = new Rectangle();
		System.out.println( r instanceof Shape);
		System.out.println( r instanceof Rectangle);
	//	System.out.println( r instanceof Triangle);
		System.out.println( r instanceof Object);
		
		//Shape으로 참조하면 자식들이나 부모는 물어볼 수 있어도 옆은 호출 못함
	}

	
	private static void draw(Drawable d) {
		d.draw();
	}
	
//	private static void drawPoint(Point point) {
//		point.show();
//	}
	
//	private static void draw(Shape shape) {
//		shape.draw();
//	}
	

}
