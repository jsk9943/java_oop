package ezen.abstraction;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 6.
 * 자식 클래스들이 반드시 구현해야 하는 기능(메소드)을 위한 수직적명세 역할 클래스
 *
 */
//추상클래스
public abstract class Animal {
	
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	
	
	public void walk() {
		System.out.println("걸어갑니다");
	}
	
//	추상메소드 (반드시 구현해야 함)
	public abstract void cry();
	public abstract void eat();
	
}

