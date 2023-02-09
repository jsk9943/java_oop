package ezen.array;
/**
 * 
 * @author 김정석
 * 2022. 12. 29.
 * 배열과 관련된 공통기능을 정의
 */
public class ArrayUtil {
	static int result;
	
	
//	배열추가기능
	public static int[] copyArray (int[] srcArray, int increament) {
		int[] copiedArray = new int[srcArray.length + increament];
		
		for (int i = 0; i < srcArray.length; i++) {
			copiedArray[i] = srcArray[i];
		}
		return copiedArray;
	}
	
	
//	배열정렬기능
//	동일한 주소값에 변경이 되기 때문에 리턴이 없어도 됨
	public static void ArrayArrange (int[] srcArray) {
		for (int i = 0; i < srcArray.length; i++) {
			for (int j = (i + 1); j < srcArray.length; j++) {
				if (srcArray[i] > srcArray[j]) {
					result = srcArray[i];
					srcArray[i] = srcArray[j];
					srcArray[j] = result;
				}
			}
		}
	}
	
	
}
