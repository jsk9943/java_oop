package oop;

import java.util.Date;
import com.ezen.shop.Cart;
import static java.lang.System.out;
import static java.lang.Math.*;
//import com.ezen.shop.*;
//*표로 사용하면 패키지 내에 모든 클래스를 사용할 수 있으나 비권장

public class CartExample {

	public static void main(String[] args) {
		Cart cart = new Cart();
		com.ezen.shop.Cart cart2 = new Cart();
		
		cart.addItem("라면");
		cart2.addItem("냉면");
		
		Date today = new Date();
		String ymd = today.toLocaleString();
		out.println(ymd);
		
		out.println("스테틱 임포트 사용!"); // system 클래스명 생략 후 출력 사용
		
		int x = 40, y = 35;
		int result = max(x,y); // Math 클래스명 생략 후 max 사용
		System.out.println(result);
	}

}
