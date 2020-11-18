package baekjoon;

import java.util.Scanner;
//  *
// **
//***
// 입력값 3일때
// 첫째 줄엔 ' ' 2개 * 1개
// 둘째 줄 ' ' 1개 * 2개
// 셋째 줄 ' ' 0개 * 3
// 입력값은 줄의수 
// 줄의수 - 행의 수 = ' '
// 별의수 = 행의 수
public class P2439E1 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			for(int j = 1; j < x-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
