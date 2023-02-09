package ezen.interfacee;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 6.
 * 유닛이 사용하는 모든 무기들에 대한 표준규약(명세)
 * 인터페이스 역할
 * 인터페이스는 100% 추상메소드로만 구성된다.
 *
 */
public interface Weapon {
	int weight = 1;  // 컴파일 시 public static final 이 앞에 자동으로 생성된다
	void attack();  // 컴파일 시 public abstract 가 앞에 자동으로 생성된다
}
