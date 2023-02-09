package ezen.array;

import java.util.Scanner;

public class QuizAnswer {
	private String name;
	private int[] jumsu;

	public QuizAnswer() {
		this(null, null);
	}
	
	public QuizAnswer(String name, int[] jumsu) {
		this.name = name;
		this.jumsu = jumsu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getJumsu() {
		return jumsu;
	}
	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
	public double getAvg() {
		return (double)getSum() / jumsu.length;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuizAnswer qui = new QuizAnswer();
		int[] jumsu = new int[4];
		qui.jumsu = jumsu;
		System.out.print("이름을 입력하세요 : ");
		qui.setName(sc.nextLine());
		System.out.print("점수를 입력하세요 : ");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		}
		System.out.println("이름 : " + qui.getName());
		System.out.println("총점 : " + qui.getSum());
		System.out.println("평균 : " + qui.getAvg());
		sc.close();
	}

}
