package ezen.shoppingmall;

import java.util.Scanner;

public class ESM {
	boolean exit = true;
	Cart cart = new Cart(5);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainMenu mm = new MainMenu();
		ESM esm = new ESM();
		
		while(esm.exit) {
			mm.mainMenu();
//			mm.mainMenuSel(sc.nextInt());
			try {
				mm.mainMenuSel(sc.nextInt());
			} catch (Exception e) {
				System.out.println("메뉴 선택은 숫자만 입력해주세요");
			}
		}
		sc.close();
	}

}
