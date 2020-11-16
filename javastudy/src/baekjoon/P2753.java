package baekjoon;

import java.util.Scanner;

// 윤년 4의 배수이면서, 100의배수가 아니고 400의 배수여야함.
// 4의 배수 : year % 4 == 0;
// 100의 배수 : year % 100 == 0;
// 400의 배수 : year % 400 == 0;
// 입력 : 1 <= 년도 <= 4000
// 출력 : 윤년 -> 1, 아니면 -> 0
public class P2753 {

	public static void main(String[] args) {
		// System.in : 콘솔(keyboard)로 입력받는다.
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); // int를 입력받음.
		// 윤년인지 아닌지 판단한다.
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		sc.close(); // 자원 반납

	}

}
