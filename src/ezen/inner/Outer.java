package ezen.inner;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 10.
 * 
 *
 */
public class Outer {
	Inner in = new Inner();
	String name = "김정석";
	int age2 = in.age;
	
	public void outerMethod() {
		System.out.println("외부클래스 입니다");
		in.innerMethod();
		System.out.println(in.age);
	}
	
	
	
	
	
//	인스턴스 맴버 내부클래스
//	외부클래스의 보조적(Helper) 역할의 클래스
	class Inner {
		int age = 10;
		public void innerMethod() {
			System.out.println("내부클래스 입니다");
			System.out.println(name);  // 외부클래스의 맴버를 접근 할 수 있다.
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outerMethod();
		System.out.println(out.age2 + 10);
		
		
		Outer out2 = new Outer();
		Outer.Inner in = out2.new Inner();
		out2.new Inner();
		System.out.println(in.age);
		
		
		
	
	}
	
	
	
	
	
	
	
}
