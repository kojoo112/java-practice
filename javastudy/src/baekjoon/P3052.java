package baekjoon;

import java.util.Scanner;

/*
 * 10개의 자연수
 * 42로 나눴을 때 나머지 -> 계수 > 0
 * 나머지가 몇가지 나오느냐
 */
public class P3052 {

	public static void main(String[] args) {
		int remains[] = new int[42];	//0 ~ 41
		// 데이터를 10개 입력 받는다.
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int value = sc.nextInt();
			int remain = value % 42;
			remains[remain]++;
		}
		// 나머지가 몇 가지인지 계수
		int count  = 0;
		for(int i = 0; i < 42; i++) {
			if(remains[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
