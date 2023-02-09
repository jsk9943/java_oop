package ezen.interfacee;

public class WeaponExample {

	public static void main(String[] args) {
//		인터페이스는 타입으로 선언 가능, 인터페이스 생성은 불가능
//		자동형변환, 다형성
		Weapon weapon = new Gun();
		weapon.attack();
		
		weapon = new Sword();
		weapon.attack();
		
		weapon = new Club();
		weapon.attack();
	}

}
