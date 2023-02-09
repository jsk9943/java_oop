package oop;

public class StandardAPIExample {

	public static void main(String[] args) {
//		String message = "안녕하세요. 김정석입니다!!";
		String message = new String("안녕하세요. 김정석입니다!!");
		int meLen = message.length();
		
		System.out.println(message);
		System.out.println("위 문장은 총 "
				+ meLen
				+ "개의 문자로 구성되었습니다.");
		
		
		String ssn = new String("123456-1891234");
//		특정위치에 있는 단어 하나만 찾아야 할 경우
		char ssnGender = ssn.charAt(7);  
		switch (ssnGender) {
		case '1':
			System.out.println("이 주민번호 "
					+ ssn
					+ "는 남성입니다.");
			break;
		case '2':
			System.out.println("이 주민번호"
					+ ssn
					+ "는 여성입니다.");
			break;
		default:
			System.out.println("입력된 정보가 없습니다");
			break;
		}
		
		
//		컴파일 오류 발생 - 0으로는 나눌 수 없음
//		System.out.println(10 / 0);
		
		
		
		
		
		
		
		
		int number = 1234567;
		String numStr = String.valueOf(number);
		int numlen = numStr.length();
		System.out.println("int number는 "
				+ numlen
				+ "개의 숫자입니다.");
		
		
		int n = -10;
		int result = Math.abs(n);
		System.out.println(result);
		
		
		double radian = 45.3;
		double re = 2 * Math.PI * radian;
		System.out.println(re);
		
	}

}
