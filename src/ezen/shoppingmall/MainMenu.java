package ezen.shoppingmall;

import java.util.Scanner;

public class MainMenu extends ESM{
	
	String undo = "=============================";
	
	public MainMenu() {}
	
	
	
	
	
	
	
	public void mainMenu() {
		System.out.println();
		System.out.println("장바구니 살펴보기");
		System.out.println("1. 담겨진 상품\n"
				+ "2. 찾을 상품 검색\n"
				+ "3. 상품 추가\n"
				+ "4. 상품 삭제\n"
				+ "5. 상품 모두 삭제\n"
				+ "9. 종료");
		System.out.println();
		System.out.print("이용하고 싶은 기능을 눌러주세요 : ");
	}
	
	
	
	
	
	
	
	
	public void mainMenuSel(int sel) {
		Scanner sc = new Scanner(System.in);
		Item item = new Album();
		switch (sel) {
		case 1:
			System.out.println();
			System.out.println("현재 카트에 보관중인 아이템");
			System.out.println(undo);
			System.out.println();
			cart.cartInItem();
			System.out.println(undo);
			System.out.println();
			break;
		case 2:
			System.out.print("찾으실 상품명을 입력 : ");
			Item result = cart.findByName(sc.next());
			if (result != null) {
				System.out.println(undo);
				System.out.println(result);
				System.out.println(undo);
			} else {
				System.out.println(undo);
				System.out.println("검색된 상품이 없습니다");
				System.out.println(undo);
			}
			break;
		case 3:
			System.out.print("상품 종류를 선택해주세요\n"
					+ "1. Album\n"
					+ "2. Movie\n"
					+ "3. Book\n");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			System.out.println("추가하실 상품 정보를 입력해주세요");
			System.out.print("상품번호 : ");
			int productNum = sc.nextInt();
			System.out.print("상품명 : ");
			String productName = sc.next();
			System.out.print("상품가격 : ");
			int price = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("가수명 : ");
				String singer = sc.next();
				item = new Album(productNum, productName, price, singer);
				cart.addItem(item);
				break;
			case 2:
				System.out.print("영화감독 : ");
				String director = sc.next();
				System.out.print("주연배우 : ");
				String actor = sc.next();
				item = new Movie(productNum, productName, price, director, actor);
				cart.addItem(item);
				break;
			case 3:
				System.out.print("책 저자 : ");
				String author = sc.next();
				System.out.print("책 일련번호 : ");
				int isbn = sc.nextInt();
				item = new Book(productNum, productName, price, author, isbn);
				cart.addItem(item);
				break;
			default:
				System.out.println("잘못 입력되었습니다. 다시 진행해주세요.");
			}
			
			System.out.println("등록이 완료되었습니다.");
			break;
		case 4:
			System.out.print("삭제하실 상품 이름을 입력 : ");
			String name = sc.next();
			if(true == cart.removeItem(name)) {
				cart.removeItem(name);
				System.out.println("삭제되었습니다");
			} else {
				System.out.println("제품이 담겨져 있지 않습니다.");
			}
			break;
		case 5:
			System.out.println("상품을 모두 비우고 싶다면 '삭제'를 입력 : ");
			String result2 = sc.next();
			if(cart.allRemoveItem(result2)) {
				cart.allRemoveItem(result2);
				System.out.println("삭제되었습니다");
			} else {
				System.out.println("장바구니가 비어있어 삭제가 불가능합니다.");
			}
			break;
		case 9:
			System.out.println("이용해주셔서 감사합니다");
			this.exit = false;
			return;
		default:
			System.out.println("정확한 기능을 선택해주세요");
		}
	}
	
}
