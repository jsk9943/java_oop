package ezen.array;

import oop.Account;

/**
 * 
 * @author 김정석
 * 2023. 1. 2.
 * 여러개의 계좌를 저장하고 관리(추가, 검색, 수정, 삭제)하는 역할의 클래스
 */
public class AccountRepository {
	
//	다형성 Up Casting
	private Account[] accounts;
	private int count;
	

	
	
	
	public AccountRepository() {  // 디폴트
		this(10);
	}
	
	public AccountRepository(int capacity) {
		this.accounts = new Account[capacity];
	}
	
	public int getCount() {
		return count;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	
	
	
	
//	계좌 등록기능
	public void addAccount(Account account) {
		accounts[count++] = account;
	}
	
	
	
//	계좌 검색기능
	public Account findByNumber(String number) {
		Account result = null;
		for (int i = 0; i < count; i++) {
			if(accounts[i].getAccountNum().equals(number)) {
				System.out.println("찾았다!");
				System.out.println(accounts[i].toString());
				result = accounts[i];
			} 
		}
		return result;
	}
	
	
	
//	계좌 삭제기능
	public boolean removeAccount(String number) {
		Account result = null;
		boolean result2 = false;
		for (int i = 0; i < count; i++) {
			for (int j = i+1; j < count; j++) {
				if(accounts[i].getAccountNum().equals(number)) {
					result = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = result;
					result2 = true;
				} 
			}
		}
		for (int i = 0; i < count; i++) {
			if(accounts[i].getAccountNum().equals(number)) {
				count--;
			}
		}
		return result2;
	}
	
//	계좌 삭제기능 선생님 버전
	public boolean removeAccount2(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNum();
			if(an.equals(number)) {
				for(int j=i; j < count - 1; j++) {
					accounts[j] = accounts[j+1];
				}
				count--;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
