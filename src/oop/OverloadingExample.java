package oop;

/**
 * 
 * @author 김정석
 * @date   2023. 1. 4.
 * 중복정의 규칙
 * 메소드 이름을 똑같이 하여 정의하고자 할 때에는
 * 매개변수 갯수나 데이터 타입이 반드시 달라야 한다.
 */


class Calculator {
	
//	메소드 오버로딩(중복정의)
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	
	public static double sum(double x, double y, double z) {
		return x + y + z;
	}
	
}





public class OverloadingExample {

	public static void main(String[] args) {
		
		System.out.println(Calculator.sum(1, 2));
		System.out.println(Calculator.sum(1, 2, 3));
		System.out.println(Calculator.sum(1.5, 2.3, 4.0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
