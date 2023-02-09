package ezen.inner;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 10.
 * 
 *
 */
public class Outer2 {
	Inner in = new Inner();
	String name = "김정석";
	int age2 = in.age;
	
	public void outerMethod() {
		System.out.println("외부클래스 입니다");
		in.innerMethod();
		System.out.println(in.age);
	}
	
	
	
	
	
//	정적(static) 맴버 내부클래스
//	외부클래스의 보조적(Helper) 역할의 클래스
	static class Inner {
		int age = 10;
		public void innerMethod() {
			System.out.println("내부클래스 입니다");
			System.out.println();  // 외부클래스의 맴버를 접근 할 수 있다.
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.outerMethod();
		System.out.println(out.age2 + 10);
		
		
		Outer2.Inner in2 = new Outer2.Inner();
		Inner in = new Inner();
		in.innerMethod();
		in2.innerMethod();
		
		
		
	
	}
	
	
	
	
	
	
	
}
