package baekjoon;

import java.util.Scanner;

/*
 * 윤년이면 1, 아니면 0
 * 4의배수이면서 100의배수가아니거나 400의배수여야함
 */
public class P2753E1 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		if(x % 4 ==0 && x % 100 !=0 || x % 400 ==0){
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
