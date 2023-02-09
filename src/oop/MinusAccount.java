package oop;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 4.
 * Account 클래스를 상속받는 마이너스 계좌
 */
public class MinusAccount extends Account {
//	새롭게 추가된 속성
	private long borrowMoney;
	private String borrowDate;
	
	public MinusAccount() {}

	public MinusAccount(String accountNum, String accountOwner, int password, long restMoney, long borrowMoney, String borrowDate) {
		super(accountNum, accountOwner, password, restMoney);
		this.borrowMoney = borrowMoney;
		this.borrowDate = borrowDate;
	}

	public long getBorrowMoney() {
		return borrowMoney;
	}

	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}
	
	public void addBorrowMoney(long borrowMoney) {
		this.borrowMoney += borrowMoney;
	}
	
	public void minusBorrowMoney(long borrowMoney) {
		if(super.getRestMoney() > borrowMoney) {
			this.borrowMoney -= borrowMoney;			
		}
	}
	
	
	
	
	
	
	

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	public long getRestMoney() {
		return super.getRestMoney() - borrowMoney;
	}
	
	
	public String toString() {
		return super.toString() + " " + borrowMoney + " " + borrowDate;
	}
	
	
	
	
	
	
	
}
