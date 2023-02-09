package ezen.array;

import java.util.Scanner;

import oop.Account;

/**
 * 
 * @author 김정석
 * @date 2023. 1. 2.
 * 배열을 이용한 은행 계좌 목록 관리
 */
public class ArrayExample7 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		int index = 0;
		
//		계좌 개설
		Account account1 = new Account("1111-2222", "김정석", 11111, 10000);
		
//		계좌 등록
		accounts[index++] = account1;
		accounts[index++] = new Account("1122-3344", "홍길동", 2222, 900);
		accounts[index++] = new Account("2233-4455", "오징어", 33333333, 100);
		
//		등록된 모든 계좌정보 출력
		for (int i = 0; i < index; i++) {
			Account acc = accounts[i];
//			계좌번호, 예금주명, 비밀번호(*), 잔액
//			String description = (acc.getAccountNum() + " " + acc.getAccountOwner() + " " + acc.getPassword() + " " + acc.getRestMoney());
//			System.out.println(description);
			
			System.out.println(acc.toString());
		}
		
		System.out.println("===============================");
		
//		계좌번호로 계좌 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색하실 계좌번호를 입력하세요 : ");
		String searchNum =  sc.nextLine();
		sc.close();
		int result = 0;
		String strResult = null;
		for (int i = 0; i < index; i++) {
			if (accounts[i].getAccountNum().equals(searchNum)) {
				result = 1;
				System.out.println(accounts[i].toString());
				strResult = accounts[i].getAccountOwner();
			}
		}
		if (result == 1) {
			System.out.println("찾은 계좌번호는 " + searchNum + "이며, 계좌주는 " + strResult + "입니다");
		} else {
			System.out.println("요청하신 계좌번호는 없습니다.");
		}

		
		
		
	}

}
