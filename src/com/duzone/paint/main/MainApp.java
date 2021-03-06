package com.duzone.paint.main;

import com.duzone.paint.i.Drawable;
import com.duzone.paint.point.*;
import com.duzone.paint.shape.*;
import com.duzone.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		//p1.show();
		//drawPoint(p1);
		draw(p1);
		
		Point p2 = new Point(50, 50);
		//p2.show();
		//drawPoint(p2);
		draw(p2);
		p2.show(false);
		
		Point p3 = new ColorPoint();
		//ColorPoint p3 = new ColorPoint();	
		p3.setX(100);
		p3.setY(50);
		((ColorPoint)p3).setColor("red");
		//p3.show(); // ColorPoint의 show() 함수
		draw(p3);
		//p3.show(true);
		//p3.show(false);
		
		Point p4 = new ColorPoint(200, 100, "yellow");
		draw(p4);
		
		Shape triangle = new Triangle();
		triangle.setLineColor("black");
		
		((Triangle)triangle).setX1(10);
//		Triangle t = (Triangle)triangle; // down casting -> 명시적(Exlicity)
//		t.setX1(10);
//		//Triangle triangle = new Triangle();
//		Shape s = new Triangle();
		//drawTriagle(triangle);
		draw(triangle);
		
		Rect rect = new Rect();
		Shape r1 = rect;
		//drawRect(rect); // up casting -> 암시적(Implicity)
		draw(rect);
		
		Shape shape = new Rect();
		//shape.draw();
		draw(shape);
		
		Shape shape2 = new Triangle();
		shape2.draw();
		draw(shape2);
		
		Drawable shape3 = new Circle();
		shape3.draw();
		draw(shape3);
		
		GraphicString gs = new GraphicString("hello");
		draw(gs);
		
		// 연산자 : instanceof 테스트
		Shape s = new Circle();
		System.out.println(s instanceof Shape); // == 와 동일
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		Circle c = (Circle)s;
		
		// 자식 부모는 되나 형제는 쓸수 없음
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Object);
		// System.out.println(c instanceof Rect); // 에러 : 계층관계가 아닌 경우 연상을 할 수 없음
		
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void draw(Shape shape) {
//		shape.draw();
//	}
//	
//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	
//	public static void drawTriagle(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
}
