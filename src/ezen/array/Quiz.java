package ezen.array;

public class Quiz {
	private String name;
	private int[] jumsu;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getJumsu() {
		return jumsu;
	}
	public void setJumsu(int[] i) {
		jumsu = i;
	}
	
	
	public void getSum() {
		int result = 0;
		for (int i = 0; i < jumsu.length; i++) {
			result += jumsu[i];
		}
		System.out.println(result);
	}
	public void getAvg() {
		
	}

	
	
	public static void main(String[] args) {
		Quiz qui = new Quiz();
		
		qui.setName("홍길동");
		System.out.println("이름 : " + qui.getName());
		
	}

}
