package ezen.abstraction;

public class AbstractExample {

	public static void main(String[] args) {
//		추상클래스는 객체를 생성할 수 없다
//		Animal animal = new Animal();  // 오류발생
//		추상클래스는 자동형변환에서 타입으로 사용 할 수 있다.
//		다형성 적용할 수 있다.
		
		Animal animal = new Bird();
		animal.setName("참새");
		animal.eat();
//		추가된 메소드 호출을 위해 다운캐스팅 필요(강제형변환)
		Bird bird = (Bird) animal;
		bird.fly();
		animal = new Cat();
		animal.setName("러시안");
		animal.eat();
		animal = new BisongDog();
		animal.setName("진돗개");
		animal.eat();
		
		
	}

}
