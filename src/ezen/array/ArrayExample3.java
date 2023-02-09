package ezen.array;

/**
 * @author 김정석
 * 2022. 12. 29.
 * 배열선언, 생성, 사용하기
 */
public class ArrayExample3 {

	public static void main(String[] args) {
		int[] array = {99,78,90,100,80};
		int[] copyArray = ArrayUtil.copyArray(array, 5);
		
		for (int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		ArrayUtil.ArrayArrange(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println();
		
		ArrayUtil.ArrayArrange(copyArray);
		for (int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i] + " ");
		}

		System.out.println();
		System.out.println();
		
	}
}

