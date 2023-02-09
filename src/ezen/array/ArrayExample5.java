package ezen.array;

/**
 * @author 김정석
 * 2022. 12. 29.
 * 다차원 배열 선언하기
 */
public class ArrayExample5 {

	public static void main(String[] args) {
		int[][] array = new int[2][5];
		array[0][0] = 88;
		array[0][1] = 90;
		array[0][2] = 76;
		array[0][3] = 93;
		array[0][4] = 66;
		array[1][0] = 100;
		array[1][4] = 60;	
		
		int[][] array2 = {
			{50, 50, 50, 50, 100, 50},
			{50, 60, 30, 50, 60, 10},
			{10, 20, 30, 40, 50, 60},
			};

		int result = 0;
		for (int i = 0; i < array2.length; i++) {
			System.out.println((i + 1) + "반 성적");
			result = 0;
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
				result += array2[i][j];
			}
			System.out.println();
			System.out.println("반 합계 : " + result);
			System.out.println("반 평균 : " + (double) result / array2[i].length);
			System.out.println("----------------------------");
		}
		System.out.println("============================");
		
		
	}
}

