package ezen.inner;

public class Outer3 {
	String name;
	
	public void doTask() {
		final int x = 10;
		System.out.println("doTask 실행중");
		
//		지역 내부 클래스
//		메소드 안에 지역클래스를 넣으면 사용 이후 바로 메모리에서 삭제 됨
		class Helper {
			
			public void someDo() {
				System.out.println("someDo 실행중");
				name = "오";
				System.out.println(x);
			}
			
		}
		
		Helper help = new Helper();
		help.someDo();
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.doTask();
		System.out.println(out.name);
	}
	
	
}
