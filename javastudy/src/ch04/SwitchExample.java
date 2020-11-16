package ch04;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 제한된 경우의 수에 따라서 다르게 처리할 때
		System.out.print("메뉴: 1.더하기, 2.빼기, 3.곱하기, 4.나누기");
		int menu = sc.nextInt();
		switch (menu) { // 조건안에 int, byte, short, long, string
		case 1:
			System.out.println("더하기 수행");
			break;
		case 2:
			System.out.println("빼기 수행");
			break;
		case 3:
			System.out.println("곱하기 수행");
			break;
		case 4:
			System.out.println("나누기 수행");
			break;
		default: // if문의 else와 같음
			System.out.println("올바른 메뉴를 선택하세요.");
			break; // 쓰지않아도 됨(어차피 종료되므로)

		}

	}

}
