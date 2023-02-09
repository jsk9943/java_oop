package oop;

public class ExtensExample {

	public static void main(String[] args) {
		ExtansParent pa = new ExtansParent("홍길동", 90);
		
		System.out.println("부모이름 : " + pa.getName() + ", 부모나이 : " + pa.getAge());
		
		
		
		
		
		
		
		ExtansChild ch = new ExtansChild();
		
		ch.setAge(70);
		ch.setName("김정석");
		ch.setSchoolName("우주대학교");
		
		System.out.println("자식이름 : " + ch.getName() + ", 자식나이 : " + ch.getAge() + ", 자식학력 : " + ch.getSchoolName());
		
		
		
		
		
		
		
		
		
		ExtansChild ch2 = new ExtansChild("오징어", 40, "지구대학교");
		
		System.out.println("자식이름 : " + ch2.getName() + ", 자식나이 : " + ch2.getAge() + ", 자식학력 : " + ch2.getSchoolName());
		ch2.song(ch2.getName());
		
	}

}
