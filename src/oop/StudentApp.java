package oop;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "무역학과");
		System.out.println(student.getName()
				+ " / "
				+ student.getStuNum()
				+ " / "
				+ student.getSubject()
				+ " / "
				+ Student.SCHOOL_NAME);
		System.out.println("----------------------------------");
		
		Student student2 = new Student("김정석", "토목학과");
		System.out.println(student2.getName()
				+ " / "
				+ student2.getStuNum()
				+ " / "
				+ student2.getSubject()
				+ " / "
				+ Student.SCHOOL_NAME);
		System.out.println("----------------------------------");
		
		Student student3 = new Student("오징어", "초밥학과");
		System.out.println(student3.getName()
				+ " / "
				+ student3.getStuNum()
				+ " / "
				+ student3.getSubject()
				+ " / "
				+ Student.SCHOOL_NAME);
		System.out.println("----------------------------------");
		
		
//		클래스변수는 클래스이름.변수명
		student.study();
		System.out.println("----------------------------------");
		System.out.println(Student.SCHOOL_NAME);
		Student.schoolName(); // 권장
		
		
		
		
		
	}

}
