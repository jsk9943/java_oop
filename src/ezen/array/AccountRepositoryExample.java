package ezen.array;

import java.util.Scanner;


import oop.Account;
import oop.MinusAccount;

public class AccountRepositoryExample {

	public static void main(String[] args) {
		AccountRepository ar = new AccountRepository(20);
		Scanner sc = new Scanner(System.in);
		Account account = new Account("1111", "김기정", 2222, 99999999);
		
//		입출금 신규 계좌 생성 및 등록
		ar.addAccount(account);
		ar.addAccount(new Account("2222", "홍길동", 3333, 100));
		ar.addAccount(new Account("3333", "김정석", 4444, 999999999));
		ar.addAccount(new Account("4444", "부처님", 5555, 9));
		ar.addAccount(new Account("5555", "예수님", 6666, 1004));
		
		
//		마이너스 신규계좌 등록
		MinusAccount ma = new MinusAccount("9999", "김대출", 1111, 10000, 10000000, "2023.01.05");
//		자동형변환
		ar.addAccount(ma);
		ar.addAccount(new MinusAccount("7777", "쏘나타", 0000, 100, 9999999, "2023.01.05"));
		
		
		
		
		
		
		System.out.println("=============================");
		
		Account[] list = ar.getAccounts();
		for (int i = 0; i < ar.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		System.out.println("=============================");
		
		System.out.print("찾을 계좌번호 : ");
		String sa = sc.nextLine();
		Account result = ar.findByNumber(sa);
		if(result != null) {
			
		} else {
			System.out.println("그런거 없음!");
		}
		System.out.println("=============================");
		
		System.out.print("삭제할 계좌번호 : ");
		String del = sc.nextLine();
		boolean result2 = ar.removeAccount(del);
		if(result2) {
			System.out.println("계좌 삭제완료");
		} else {
			System.out.println("요청한 계좌 없음");
		}
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("|||||||||||최종 계좌 List|||||||||||");
		for (int i = 0; i < ar.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		System.out.println("총 : " + ar.getCount() + "개");
		

		System.out.println();
		System.out.println();
		ar.addAccount(new Account("6666", "오징어", 7777, 10000));
		System.out.println("|||||||||||최종 계좌 List|||||||||||");
		for (int i = 0; i < ar.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		System.out.println("총 : " + ar.getCount() + "개");
		
		
		
		
		
		
		sc.close();
	}

}
