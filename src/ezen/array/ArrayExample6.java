package ezen.array;
/**
 * 
 * @author 김정석
 * @date 2023. 1. 2.
 * 참조열 배열 선언, 생성, 사용 방법
 */
public class ArrayExample6 {

	public static void main(String[] args) {
//		1차원참조형 배열 선언
		String[] strings;
//		생성
		strings = new String[5];
//		strings[0] = new String("하이"); // 명시적 생성
		strings[0] = "하이";  // 묵시적 생성 (String만 가능)
		strings[1] = "헬로";  // 묵시적 생성 (String만 가능)
		strings[2] = "Hello";  // 묵시적 생성 (String만 가능)
		strings[3] = "good";  // 묵시적 생성 (String만 가능)
		strings[4] = "bye";  // 묵시적 생성 (String만 가능)
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i].charAt(0) + "..");
			System.out.println("언어갯수("+strings[i].length()+") : "+strings[i]);
		}
		
//		배열 선언, 생성, 초기화를 동시에
//		String[] teams = new String[] {new String("SK"), new String("LG"), new String("Doosan")};
//		String[] teams = {new String("SK"), new String("LG"), new String("Doosan")};
		String[] teams = {"SK", "LG", "Doosan"};
		for (int i = 0; i < teams.length; i++) {
			System.out.print(teams[i]+"\t");
		}
		System.out.println();
		
		
		
//		다차원배열
		String[][] arrays = new String[3][5];
		arrays[0][0] = "자바";
		arrays[2][4] = "JAVA";
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
