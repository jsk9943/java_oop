package oop;

public class Student {
//	필드(인스턴스 변수, 클래스 변수, 상수)
	static final String SCHOOL_NAME = "인하대학교";
	static int sequence = 1;
	private String name;
	private int stuNum;
	private String subject;
	
	
//	초기화블럭
	{
		System.out.println("----------------------------------");
		System.out.println("학생 인스턴스가 생성되었습니다.");
	}
	
	static {
		System.out.println("프로그램 실행 중");
	}
	
	
	
	
	public Student() {
		this(null, null);
	}
	public Student(String name, String subject) {
		this.name = name;
		this.subject = subject;
		this.stuNum = sequence++;
		System.out.println("생성자 실행됨");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public void study() {
		System.out.println("공부합니다.");
	}
	
	public static void schoolName() {
		System.out.println(SCHOOL_NAME);
	}
	
	
	
	
	
}
