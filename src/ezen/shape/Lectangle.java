package ezen.shape;

public class Lectangle extends Shape {
	protected double width, height;

	public Lectangle() {}


	public Lectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public void draw() {
		System.out.println(getX() + ", " + getY() + "인 좌표에 가로 " + width + "이고 세로 " + height + "인 도형");
	}
	
	@Override
	public double getLength(double width, double height) {
		return (Math.pow(width, 2) + Math.pow(height, 2)) / 2;
	}
	
	@Override
	public double getArea(double width, double height) {
		return width * height;
	}
	
	
	
	
	
	
}
