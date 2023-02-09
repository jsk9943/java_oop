package ezen.interfacee;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 6.
 * 인터페이스간에도 상속이 가능하며, 다중상속까지 가능하다
 *
 */
public interface Spec2 extends Spec1, Weapon{
	public void doTask3();
}
