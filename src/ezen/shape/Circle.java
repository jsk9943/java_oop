package ezen.shape;

public class Circle extends Shape {
	private double radian;

	public Circle() {}

	public Circle(double x, double y, double radian) {
		this.x = x;
		this.y = y;
		this.radian = radian;
	}
	
	public double getRadian() {
		return radian;
	}

	public void setRadian(double radian) {
		this.radian = radian;
	}

	
	
	
	
	@Override
	public void draw () {
		System.out.println(getX()+", "+getY()+"인 반지름 " + radian + "의 원");
	}
	
	@Override
	public double getLength(double x, double y) {
		return 2 * Math.PI * radian;
	}
	
	@Override
	public double getArea(double x, double y) {
		return Math.PI * Math.pow(radian, 2);
	}
//
//	public double getLength() {
//		double result = (getX() + getY()) / 2;
//		result = 2 * Math.PI * result;
//		return result;
//	}
//
//	public double getArea() {
//		double result = (getX() + getY()) / 2;
//		result = Math.PI * Math.pow(result, 2);
//		return result;
//	}
	
	

	
	
	
}
