package baekjoon;

import java.util.Scanner;

/*
 * int x, y
 * 1, 2, 3, 4 사분
 */
public class P14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > 0) {
			if (y > 0) {
				System.out.println(1);
			} else if (y < 0) {
				System.out.println(4);
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println(2);
			} else if (y < 0) {
				System.out.println(3);
			}
		}
		sc.close();
	}

}
