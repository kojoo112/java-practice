package ch04;

/* 반복문 : 조건을 만족하면 계속 반복 실행. 조건을 만족하지 않으면 종료
 *  - while문
 *  - do-while문
 *  - for문
 * */

public class LoopExample {

	public static void main(String[] args) {
		// 1 ~ 10까지의 수를 더한 값을 출력하라.
		int hab = 0; // 누적치를 저장하는 변수
		for (int i = 1; i <= 10; i++) {
			// i : 1 ~ 10까지 변하는 수를 저장한 변수
			hab += i;
		}
		System.out.println("합 = " + hab);

		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
	}

}
