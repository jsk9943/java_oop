package ezen.array;

/**
 * @author 김정석
 * 2022. 12. 29.
 * 배열선언, 생성, 사용하기
 */
public class ArrayExample4 {

	public static void main(String[] args) {
//		로또 번호 6개 뽑기
		int[] lottos = new int[6];
//		random은 0.0 <= ~ < 1.0 사이의 값을 반환함.
		for (int i = 0; i < lottos.length; i++) {
			int result = (int) (Math.random() * 45) + 1;
			lottos[i] = result;
			System.out.print(lottos[i] + " ");
			for (int j = 0; j < i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		ArrayUtil.ArrayArrange(lottos);
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}

