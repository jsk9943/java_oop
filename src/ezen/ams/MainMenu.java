package ezen.ams;

import java.util.Scanner;

public class MainMenu {
	ArrayAccountRepository ar = new ArrayAccountRepository();
	Account account = new Account();
	AMS ams = new AMS();
	
	private boolean result = true;
	private int passwordCount;
	private int verifyPassword;
	
	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public int getPasswordCount() {
		return passwordCount;
	}

	public void setPasswordCount(int passwordCount) {
		this.passwordCount = passwordCount;
	}
	
	public int getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(int verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	
	
	
	
	
	
	

	public void topMenu() {
		System.out.println("메뉴를 입력해주세요");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 잔액확인 | 3. 예금입금 | 4. 예금출금 | 5. 종료");
		System.out.println("------------------------------------------------------------------");
		System.out.print("선택 > ");
	}

	
	
	
	
	
	
	
	public void mainMenu(int sel) {
		Scanner sc = new Scanner(System.in);
		switch (sel) {
		case 1:
			System.out.println("생성할 계좌 유형을 선택해주세요");
			System.out.println("1. 입출금계좌 | 2. 마이너스계좌(대출)");
			System.out.print("선택 > ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("계좌번호를 입력해주세요");
				System.out.print("입력 > ");
				String accountNum = sc.next();
				System.out.println("성함을 입력해주세요");
				System.out.print("입력 > ");
				String accountOwner = sc.next();
				System.out.println("사용하실 비밀번호를 입력해주세요");
				System.out.print("입력 > ");
				int password = sc.nextInt();
				ar.addAccount(new Account(accountNum, accountOwner, password, 0));
				System.out.println("입출금계좌 등록이 완료되었습니다\n");
				break;
			case 2:
				System.out.println("계좌번호를 입력해주세요");
				System.out.print("입력 > ");
				String minusAccountNum = sc.next();
				System.out.println("성함을 입력해주세요");
				System.out.print("입력 > ");
				String minusAccountOwner = sc.next();
				System.out.println("사용하실 비밀번호를 입력해주세요");
				System.out.print("입력 > ");
				int minuspassword = sc.nextInt();
				System.out.println("신청하실 대출금액을 입력해주세요");
				System.out.print("입력 > ");
				long borrowMoney = sc.nextLong();
				System.out.println("신청일자를 입력해주세요");
				System.out.print("입력 > ");
				String borrowDate = sc.next();
				System.out.println();
				ar.addAccount(new MinusAccount(minusAccountNum, minusAccountOwner, minuspassword, 0, borrowMoney, borrowDate));
				System.out.println("대출이 실행 되었습니다\n");
				break;
			default:
				System.out.println("다시 입력해주세요");				
				System.out.print("입력 > ");
				break;
			}
			break;
		case 2:
			System.out.println("잔액을 확인하실 계좌 유형을 선택해주세요");
			System.out.println("1. 입출금계좌 | 2. 마이너스계좌(대출) | 3. 전체계좌");
			System.out.print("선택 > ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("찾으실 계좌번호를 입력해주세요");
				System.out.print("입력 > ");
				account = ar.findByNumber(sc.next());
				if(account != null) {
					System.out.println("비밀번호를 입력해주세요");
					System.out.print("입력 > ");
					setVerifyPassword(sc.nextInt());
					if(account.checkPassword(getVerifyPassword())) {
						System.out.println("\n" + account);
					} else {
						System.out.println("비밀번호가 틀렸습니다");
					}	
				} else {
					System.out.println("입력하신 계좌는 조회되지 않습니다");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("찾으실 계좌번호를 입력해주세요");
				System.out.print("입력 > ");
				account = ar.findByNumber(sc.next());
				if(account != null) {
					System.out.println("비밀번호를 입력해주세요");
					System.out.print("입력 > ");
					setVerifyPassword(sc.nextInt());
					if(account.checkPassword(getVerifyPassword())) {
						System.out.println("\n" + account);
					} else {
						System.out.println("비밀번호가 틀렸습니다");
					}	
				} else {
					System.out.println("입력하신 계좌는 조회되지 않습니다");
				}
				System.out.println();
				break;
			case 3:
				int adminPassword = 0000;
				boolean passwordCounts = true;
				while(passwordCounts) {
					System.out.println("관리자 비밀번호를 입력해주세요");
					System.out.print("입력 > ");
					int passwordIdentify = sc.nextInt();
					if(adminPassword != passwordIdentify) {
						int c  = 0;
						System.out.println("비밀번호가 틀렸습니다\n");
						c += 1;
						setPasswordCount(c);
						return;
					} else if(adminPassword == passwordIdentify) {
						System.out.println("등록된 전체 계좌 목록 입니다");
						ar.allFindAccount();
						System.out.println();
						return;
					} else if(getPasswordCount() < 4) {
						passwordCounts = false;
						return;
					}
				}
				System.out.println("비밀번호 3회 이상 실패로 종료됩니다");
				setPasswordCount(0);
				break;
			default:
				System.out.println("다시 입력해주세요");				
				System.out.print("입력 > ");
				break;
			}
			break;
		case 3:
			System.out.println("입금하실 계좌번호를 입력해주세요");
			System.out.print("입력 > ");
			Account result = ar.findByNumber(sc.next());
			System.out.println("입금하실 금액을 입력해주세요");
			System.out.print("입력 > ");
			result.setDeposit(sc.nextLong());
			System.out.println("입금이 완료되었습니다\n");
			break;
		case 4:
			System.out.println("출금하실 계좌번호를 입력해주세요");
			System.out.print("입력 > ");
			Account result2 = ar.findByNumber(sc.next());
			if(result2 == null) {
				System.out.println("잘못 입력되었습니다");
				return;
			}
			System.out.println("출금하실 금액을 입력해주세요");
			System.out.print("입력 > ");
			long userWithdraw = sc.nextLong();
			try {
				result2.setWithdraw(userWithdraw);
				System.out.println("출금이 완료되었습니다\n");
			} catch (NotSufficientBalanceException e) {
				System.out.println(e.toString());
			}			
			break;
		case 5:
			setResult(false);
			return;
		default:
			System.out.println("다시 입력해주세요");				
			System.out.print("입력 > ");
			break;
		}
	}
}
