package oop;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class AccountApplication2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		account = new Account("333-123-664644", "홍길동", 1234, 1000000);
		
		System.out.println(account.getAccountNum());
		System.out.println(account.getAccountOwner());
		
		

		System.out.println("-----------------------------");
		
		
		
		Account account2;
		account2 = new Account("444-124-512352", "장발장");
		
		System.out.println(account2.getAccountNum());
		System.out.println(account2.getAccountOwner());
		System.out.println("고정된 은행 번호는 "
				+ Account.BANK_ID
				+"이고, 은행 이름은 "
				+ Account.BANK_NAME
				+ "입니다.");
		
		
		
		
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
//		마이너스 계좌 작동 확인
		MinusAccount ma = new MinusAccount("1111", "김정석", 2222, 10, 10000000, "2023.01.04");
		
		System.out.println(ma.getRestMoney());
		System.out.println(ma.getBorrowDate());		
		System.out.println(ma.getBorrowMoney());
		
//		object 메소드 재사용
		int code = ma.hashCode();
		System.out.println(code); // 8진수
		String str = ma.toString();
		System.out.println(str); // 16진수 메모리주소값 아님
		System.out.println(ma);  // object toString이 자동호출되어 사용
		System.out.println("-----------------------------");
		
		
		
		
		System.out.println(ma.toString());		
		System.out.println("-----------------------------");
//		JOptionPane.showMessageDialog(null, ma.toStringPrint());  // 팝업 메세지 출력
		
		
		
		String name = "김정석";  // new String("김정석");
		System.out.println(name.toString()); // String 클래스에 재정의된 toString()메소드 자동 호출
		System.out.println(name.hashCode());
		
		
		
		
		
//		Object 클래스는 equals()메소드를 기본으로 제공, 레퍼런스를 비교(주소값)		
		System.out.println("-----------------------------");
		Account ac1 = new Account("1111", "홍길동", 2222, 99);
		Account ac2 = new Account("1111", "홍길동", 2222, 99);
		System.out.println(ac1 == ac2);
		System.out.println(ac1.equals(ac2));  // Object의 equals() 메소드 재사용, 위에와 동일하게 사용 됨
		
		System.out.println("-----------------------------");
		String message1 = "자바 어려움";
		String message2 = "자바 어려움";
		System.out.println(message1 == message2);
		System.out.println(message1.equals(message2));  // String 클래스는 Object가 제공하는 equals() 메소드를 재사용하는 것이 아니라 String 클래스 안에 제공되어있는 equals() 메소드를 재정의하여 문자열과 문자열을 비교하는 것이다. String Override!!
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
