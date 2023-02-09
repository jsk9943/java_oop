package ezen.shape;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 4.
 * 
 * 모든 도형의 공통적인 속성과 기능 정의
 */
public abstract class Shape {

	protected double x, y;
		

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
	

	public abstract void draw ();

	public abstract double getLength(double x, double y);
	
	public abstract double getArea(double x, double y);
	}
}
