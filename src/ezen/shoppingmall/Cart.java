package ezen.shoppingmall;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 5.
 * 쇼핑몰에서 취급하는 모든 상품들을 담고, 제거하고, 검색하는 등의 기능 제공
 *
 */
public class Cart {
	
	private Item[] item;
	private int count;
//	private int capacity;
	
	public Cart() {}
	
	public Cart(int capacity) {
		item = new Item[capacity];
	}
	
//	카트에 담긴 전체상품 목록 확인
	public Item[] getItem() {
		return item;
	}

	public int getCount() {
		return count;
	}
	
	
//	카트에 상품 담기
//	매개변수의 다양성
	public void addItem(Item item) {
		this.item[count++] = item;
	}
	
//	담겨진 상품 리스트 불러오기
	public void cartInItem() {
		Item[] myItems = getItem();
		for (int i = 0; i < count; i++) {
			System.out.println(myItems[i] + "\n");
		}
		if(item[0] == null) {
			System.out.println("상품이 담겨져있지 않습니다");
			System.out.println();
		}
	}
	
//	상품이름으로 상품 검색기능
	public Item findByName(String name) {
		for (int i = 0; i < count; i++) {
			if(item[i].getName().equals(name)) {
				return item[i];
			}
		}
		return null;
	}
	
	
//	카트에 상품 빼기
	public boolean removeItem(String name) {
		for(int i = 0; i < count; i++) {
			if(item[i].getName().equals(name)) {
				for (int j = i; j < count; j++) {
					item[j] = item[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;
	}
	
	
	
//	카트 비우기
	public boolean allRemoveItem(String name) {
		if(name.equals("삭제")) {
			for (int i = count; i >= 0; i--) {
				item[i] = null;
				count--;
			}
			return true;
		}
		return false;
		
		
//		선생님 코드
//		item = new Item[capacity];
//		count = 0;
////		선생님 코드
//		for (int i = 0; i < count; i++) {
//			item[i] = null;
//		}
	}
	
	
	
	
	
	
	
	
	
	
}
