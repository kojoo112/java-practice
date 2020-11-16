package ch04;

/*
 * 구구단 출력 : 2 ~ 9
 * 2 * 1 ~ 2 * 9
 * */

public class GugudanEx {

	public static void main(String[] args) {
		// 2 ~ 9단 출력 -> 반복문
		for (int i = 2; i < 10; i++) { // i : 단 (2 ~ 9)
			System.out.println(i + "단");
			// i단 * 1 ~ i단 * 9까지 출력

			for (int j = 1; j < 10; j++) { // i * j
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
			// 단과 단사이를 구별하기 위해 빈 줄을 추가

		}
		// index는 관례로 i, j, k, l, m, n, o, p ...
	}

}
