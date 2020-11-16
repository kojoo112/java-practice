package ch04;

import java.io.IOException;

/*
 *  do-while문
 *  형식 : 
 *  do {
 *  실행문1;
 *  실행문2;
 *  } while(조건식);
 */

public class SpeedExample2 {

	public static void main(String[] args) throws IOException {

		int speed = 0;
		int keyCode = 0;
		do {
			if (keyCode != 13 /* '\n */ && keyCode != 10 /* '\r */) {
				System.out.println("----------------------");
				System.out.println("1: 가속, 2: 감속, 3: 정지");
				System.out.println("----------------------");
				System.out.println("선택 : "); // 커서를 유지
			}
			keyCode = System.in.read(); // 읽은 값
			// IO(InputOutput) 동작을 하므로 예외가 발생할 수 있으며
			// 예외처리를 해야 한다.
			if (keyCode == 49) { // '1' -> 가속
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) { // '2' -> 감속
				speed--;
				System.out.println("현재 속도 = " + speed);
			}

		} while (keyCode != 51);
		System.out.println("프로그램 종료");
	}

}
