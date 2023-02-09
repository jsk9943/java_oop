package oop;

public class ExtansChild extends ExtansParent {
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public ExtansChild() {}
//		super(); -> 존재한다고 가정하면 됨
	
	public ExtansChild(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	public void song(String name) {
		System.out.println(name + "가 노래를 부릅니다");
	}
	
	
	
}
