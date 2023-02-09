package oop;

import java.util.Scanner;

/**
 * @author 김정석
 * 자바 애플리케이션 실행을 위한 애플리케이션 클래스
 * 메인클래스라고도 합니다.
 *
 */
public class AccountApplication {

//	애플리케이션 엔트리포인트(실행진입점)
	public static void main(String[] args) {
		System.out.println("----------------------------\n"
				+ "애플리케이션 시작되었습니다.\n"
				+ "----------------------------");
		
//		참조변수 선언 및 인스턴스 할당(객체 생성)
		Account account = new Account("1111", "김정석", 0, 1000);
		MinusAccount maccount = new MinusAccount();
		
		
		
//		메모리에 생성된 인스턴스(객체)의 필드와 메소드 사용
		System.out.println("계좌번호는 " + account.getAccountNum() + "이고, 예금주는 " + account.getAccountOwner() + "입니다.\n"
				+ "현재 잔액은 " + account.getRestMoney() + "입니다.\n"
				+ "현재 대출금은 " + maccount.getRestMoney() + "입니다.\n"
				+ "----------------------------");
		
//		인스턴스 메소드 사용(호출)
		Scanner sc = new Scanner(System.in);
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
		
		
		
		
		

		
	}

}
