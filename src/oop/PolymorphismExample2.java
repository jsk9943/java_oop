package oop;

/**
 * 
 * @author 김정석
 * @date   2023. 1. 5.
 * 자바는 다형성을 지원하기 위해 클래스 자동형변환과 메소드 오버라이딩을 지원한다
 *
 */
public class PolymorphismExample2 {

	public static void main(String[] args) {
		
		Account account1 = new Account("1111", "김정석", 1111, 10000);
		Account account2 = new Account("1111", "김정석", 1111, 10000);
		
		
		System.out.println(account1.equals(account2));
		
		
		
		
		String name = "김정석 노노";
		System.out.println(account1.equals(name));
		
		
		
		
		
		
	}

}
