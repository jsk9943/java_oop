package ezen.array;

/**
 * @author 김정석
 * 2022. 12. 29.
 * 배열선언, 생성, 사용하기
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = {99,78,90,100,80};
		int[] array2 = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2의 "+ (i + 1) +"번째 숫자는 " + array2[i]);
		}

		System.out.println();
		System.out.println();
		
		
//		오름차순
		System.out.println("기존 array의 인덱스 값");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = (i + 1); j < array.length; j++) {
				if (array[i] > array[j]) {
					result = array[i];
					array[i] = array[j];
					array[j] = result;
				} 
			}
		}

		System.out.println("변경 후 array의 인덱스 값");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		
		System.out.println();
		System.out.println();
		
		
			
		
		
	}


}
