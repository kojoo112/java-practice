package baekjoon;

import java.util.Scanner;

/*
 *  3개의 자연수(A, B, C)를 입력 받고
 *  result = A * B * C -> 최대 : 1,000,000,000 -> 21억
 *  result의 각 자리수의 값이 몇 번 반복되는지 횟수를 출력
 */
public class P2577 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		int result = A * B * C; // 21억이므로 충분
		// 자리수의 갯수를 계수를 하려면 배열 : 0 ~ 9 -> 10개
		int remains[] = new int[10];	// 초기값은 0
		while(result > 0) {
			int remain = result % 10;	// 나머지
			remains[remain]++;	// 갯수를 계수
			result /= 10;	// 10분의 1씩 줄어든다.
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(remains[i]);
		}
		sc.close();
	}

}
