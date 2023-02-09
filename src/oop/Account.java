package oop;

/**
 * @author 김정석
 * 현실세계의 객체를 프로그램으로 표현하기
 * 은행계좌 추상화
 * 객체 추상화
 * 객체지향 프로그래밍의 4대 특징
 *  ㄴ 1. 추상화
 *  ㄴ 2. 캡슐화
 *  ㄴ 3. 상속
 *  ㄴ 4. 다형성
 */



//	클래스에 선언하는 접근제한자 : 생략, public
//	객체의 속성(정보)들을 저장하기 위한 변수 선언 = 필드
//	인스턴스변수들
//	필드에 선언 할 수 있는 접근제한자 : private, 생략(default), protected, public
//	다른말로 은닉화
public class Account {
	public static final String BANK_NAME = "한국은행";
	public static final int BANK_ID = 83;
	private String accountNum, accountOwner;
	private int password;
	private long restMoney;
	
	
	
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public boolean checkPassword(int password) {
		return this.password == password;
	}
	
	public long getRestMoney() {
		return restMoney;
	}
	
	public long setDeposit(long money) {
		return restMoney += money;
	}
	public long setWithdraw(long money) {
		return restMoney -= money;
	}
	
	
//	모든 계좌정보 확인
//	overriding
	public String toString() {
		String pass = String.valueOf(password);
		String passStar = "*";
		String result = passStar.repeat(pass.length());
		return accountNum + " " + accountOwner + " " + result + " " +restMoney;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) {
			return false;
		} else if(obj.toString().equals(toString())) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		Account account = (Account) obj;
		if(accountNum.equals(account.getAccountNum())) {
			if(accountOwner.equals(account.getAccountOwner())) {
				return true;
			}
		}
		return false;
	}
	*/
//	완벽한 캡슐화를 위해 setter/getter 메소드 정의
//	객체의 행위(동작)를 정의하기 위한 메소드
//	인스턴스 메소드들
	
	
	
	
	
//	디폴트 생성자
//	public Account() {
//		accountNum = null;
//		accountOwner = null;
//		password = 0;
//		restMoney = 0;
//	}
//	생성자 오버로딩(overloading) : 중복정의
//	오버로딩 생성시 디폴트 생성자는 생성되지 않음
	public Account() {
		
	}
	
	public Account(String accountNum, String accountOwner) {
//		this.accountNum = accountNum;
//		this.accountOwner = accountOwner;
//		this.password = 0;
//		this.restMoney = 0l;
		this(accountNum, accountOwner, 0 , 0l);
	}
	
	public Account(String accountNum, String accountOwner, int password, long restMoney) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.password = password;
		this.restMoney = restMoney;
	}
	
	
}
