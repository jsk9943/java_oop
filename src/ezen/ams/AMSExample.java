package ezen.ams;

import java.util.Scanner;

public class AMSExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountRepository repository = new ArrayAccountRepository(100);
//		AccountRepository repository = new FileAccountRepository();
		
		System.out.println("----------------------------\n"
				+ "애플리케이션 시작되었습니다.\n"
				+ "----------------------------");
		
//		신규계좌등록
		Account account = new Account("1111", "김정석", 1111, 1000);
		repository.addAccount(account);
		repository.addAccount(new Account("2222", "홍길동", 2222, 2000));
		repository.addAccount(new MinusAccount("3333", "김기정", 3333, 3000, 10000000, "23.01.09"));
		/*
//		전체계좌조회
		Account[] list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i]);
		}
		
		
		System.out.print("검색하실 계좌번호 : ");
		repository.findByNumber(sc.next());
		*/
		
		
		
		Account findAccount = repository.findByNumber("1111");
		if(findAccount != null) {
			try {
				findAccount.setWithdraw(1000);
			} catch (NotSufficientBalanceException e) {
				System.out.println(e.toString());
			}
			System.out.println(findAccount);
			} else {
			System.out.println("검색된 결과가 없습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
//		인스턴스 메소드 사용(호출)
		System.out.print("비밀번호를 입력해주세요 : ");
		boolean password = account.checkPassword(sc.nextInt());
		if (password) {
			System.out.println("비밀번호가 맞습니다.");
			System.out.println();
			
			while (true) {
				System.out.print("사용 할 기능을 선택해주세요.\n"
						+ "1. 잔액조회\n"
						+ "2. 입금\n"
						+ "3. 출금\n"
						+ "4. 계좌번호 확인\n"
						+ "5. 비밀번호 변경\n"
						+ "6. 비밀번호 확인\n"
						+ "7. 대출잔액\n"
						+ "8. 대출신청\n"
						+ "9. 대출상환\n"
						+ "99. 종료\n"
						+ "선택 : ");
				
				switch (sc.nextInt()) {
				case 1:
					System.out.println();
					System.out.println("잔액은 " + account.getRestMoney() + "입니다.");
					System.out.println("대출금을 포함한 잔액은 " + maccount.getRestMoney() + "입니다.");
					System.out.println("----------------------------");
					break;
				case 2:
					System.out.println();
					System.out.print("입금 할 금액을 입력해주세요 : ");
					long deposit = account.setDeposit(sc.nextLong());
					System.out.println("입금된 금액은 " + deposit + "원 입니다.");
					System.out.println("잔액은 " + account.getRestMoney() + "원 입니다.");
					System.out.println("----------------------------");
					break;
				case 3:
					System.out.println();
					System.out.print("출금 할 금액을 입력해주세요 : ");
					long withdraw = account.setWithdraw(sc.nextLong());
					System.out.println("출금된 금액은 " + withdraw + "입니다.");
					System.out.println("잔액은 " + account.getRestMoney() + "원 입니다.");
					System.out.println("----------------------------");
					break;
				case 4:
					System.out.println();
					System.out.println("이용하시는 계좌번호는 " + account.getAccountNum() + "입니다.");
					System.out.println("----------------------------");
					break;
				case 5:
					System.out.print("기존 비밀번호를 입력 : ");
					Boolean passwordH = account.checkPassword(sc.nextInt());
					if (passwordH) {
						System.out.print("변경 할 비밀번호를 입력 : ");
						account.setPassword(sc.nextInt());
						System.out.println("비밀번호 변경이 완료되었습니다.");
						System.out.println("----------------------------");
					}
					break;
				case 6:
					System.out.print("비밀번호를 입력해주세요 : ");
					boolean password2 = account.checkPassword(sc.nextInt());
					if (password2) {
						System.out.println("비밀번호가 맞습니다");
						System.out.println("----------------------------");
					} else {
						System.out.println("비밀번호가 틀립니다.");
						System.out.println("----------------------------");
					}
					break;
				case 7:
					System.out.println("현재 대출잔액은 " + maccount.getRestMoney() + "원 입니다.");
					break;
				case 8:
					System.out.print("신청할 대출금액을 입력 : ");
					maccount.addBorrowMoney(sc.nextInt());
					System.out.println("대출금 신청이 완료되었습니다.");
					break;
				case 9:
					System.out.print("납부하실 대출금을 입력(계좌에서 바로 납부) : ");
					int result = sc.nextInt();
					if(maccount.getRestMoney() >= result) {
						maccount.minusBorrowMoney(result);
						System.out.println("납부되었습니다.");
						break;
					}
					System.out.println("잔고가 부족합니다.");
					break;
				case 99:
					System.out.println("----------------------------");
					System.out.println("애플리케이션 종료되었습니다.");
					System.out.println("----------------------------");
					return;
				default:
					System.out.println();
					System.out.println("입력되지 않아 다시 시작됩니다.");
					System.out.println("----------------------------");
				}
				
			}
		} else {
			System.out.println();
			System.out.println("비밀번호가 틀렸습니다.");
			System.out.println("----------------------------");
		}
		
		System.out.println("----------------------------");
		System.out.println("애플리케이션 종료되었습니다.");
		System.out.println("----------------------------");
		sc.close();
		*/
	}

}
