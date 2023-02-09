package ezen.shape;

public class ShapeExample {

	public static void main(String[] args) {
//		Shape shape = new Shape(10, 10);
//		shape.draw();
//		System.out.println(shape.getLength(0, 0));
//		System.out.println(shape.getArea(0, 0));
		
		System.out.println("====================================");
		
		Shape shape = new Circle(5, 5, 15);
		shape.draw();
		System.out.println("원의 둘레는 " + shape.getLength());
		System.out.println("원의 넓이는 " + shape.getArea());
		
		System.out.println("====================================");
		
		shape = new Lectangle(5, 5, 10, 15);
		shape.draw();
		System.out.println("둘레는 " + shape.getLength());
		System.out.println("넓이는 " + shape.getArea());
		
	}

}
