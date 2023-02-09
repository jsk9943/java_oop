package ezen.interfacee;

public class Club implements Weapon{
	@Override
	public void attack() {
		System.out.println("몽둥이를 휘두릅니다");
	}
}
