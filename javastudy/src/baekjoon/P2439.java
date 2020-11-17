package baekjoon;

import java.util.Scanner;

// 별찍기-2
/**
 **
 ***
 ****
 *****
 *
 * 분석 : 한 줄씩 출력하는 것을 5번 반복 -> 반복문 사용(for) 한줄에서는 ' '와 *을 출력 
 * ' ' 출력 : 5-별의 수만큼 출력
 * '*' 출력 : 줄 수만큼 별을 출력 입력 : 5
 **/
public class P2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N을 입력받는다.
		// 별을 출력 : 1줄 ~ 5
		for (int i = 1; i <= N; i++) { // 1 ~ 5까지 반복
			// i : 1, 2, 3, 4, 5
			// ' ' 출력 : 5 - i 만큼 반복
			for (int j = 0; j < N - i; j++) {
				System.out.print(' ');
				// 줄을 바꾸지 않게 print문을사용
			}
			// '*' 출력
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄을 바꾸어 준다.
		}
		sc.close();
	}

}
