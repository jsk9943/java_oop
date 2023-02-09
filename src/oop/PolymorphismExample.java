package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 5.
 * 자바는 다형성을 지원하기 위해 클래스 자동형변환과 메소드 오버라이딩을 지원한다
 *
 */
public class PolymorphismExample {

	public static void main(String[] args) {
//		기본타입 자동형변환
		double weight = 70;  // 70으로 입력했으나 자동으로 70.0으로 입력 됨
		
		
//		부모, 자식간에는 타입을 부모로 선언하면 모든 자식 개체를 할당할 수 있다. 클래스 자동형변환
		Shape shape = new Circle();
		shape.draw();
		
		
		
		System.out.println("======================================");
//		Circle circle = new Circle();  // 원래는 이렇게 새로 선언해야 하지만 아래처럼 입력해도 형변환 가능
		shape = new Circle();  // 자동형변환
		shape.draw();
		Circle shape2 = (Circle) shape;
		shape2.setRadian(10);
		System.out.println("강제형변환 된 원의 넓이 : " + shape2.getArea());

		
		System.out.println("======================================");
//		Lectangle lect = new Lectangle();  // 원래는 이렇게 새로 선언해야 하지만 아래처럼 입력해도 형변환 가능
		shape = new Lectangle();  // 자동형변환
		shape.draw();
		Lectangle shape3 = (Lectangle) shape;
		shape3.setHeight(10);
		shape3.setWidth(20);
		System.out.println("강제형변환 된 도형의 넓이 : " + shape3.getArea());
		
		
		
		System.out.println("======================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
