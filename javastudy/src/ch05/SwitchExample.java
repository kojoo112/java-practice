package ch05;

import java.io.IOException;

public class SwitchExample {

	public static void main(String[] args) throws IOException {
		int num1 = 20;
		int num2 = 30;
		System.out.println("어떤 사칙연산을 수행할까요?");
		System.out.print("1: 더하기 2: 빼기 3: 곱하기 4: 나누기");
		int keyCode = System.in.read(); // 한 글자씩 읽는다.
		// '1'[enter]를 입력해야지 데이터 입력완료로 판단.
		switch (keyCode) {	// 제한된 범위에 대하여 조건에 따라 수행
		case 49:
			System.out.println(num1 + num2);
			break;
		case 50:
			System.out.println(num1 - num2);
			break;
		case 51:
			System.out.println(num1 * num2);
			break;
		case 52:
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("올바른 메뉴를 선택하세요.");
			break;
		}

	}

}
