package ezen.array;

/**
 * @author 김정석
 * 2022. 12. 29.
 * 배열선언, 생성, 사용하기
 */
public class ArrayExample {

	public static void main(String[] args) {
		int score1, score2, score3, score4, score5;
		score1 = 95;
		score2 = 80;
		score3 = 70;
		score4 = 100;
		score5 = 65;
		
		int sum = score1 + score2 + score3 + score4 + score5;
		
		int avg = sum / 5;
		System.out.println("평균 : " + avg);
		
		/*
//		배열 선언
		int[] scores;
//		int scores[];
//		배열 생성
		scores = new int[5];
//		배열 요소 접근
		scores[0] = 95;
		*/
		
//		선언, 생성, 초기화 동시에
//		int[] scores = new int[] {95, 80, 70, 100, 65};
		int[] scores = {100, 40, 20, 0, 95, 80, 70, 100, 65};
		sum = 0;
		avg = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / scores.length;
		System.out.println("합산점수 : " + sum);
		System.out.println("평균점수 : " + avg);
		
		
		
	}


}
