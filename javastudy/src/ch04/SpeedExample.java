package ch04;

import java.io.IOException;

/*
 *  while 반복문 : 어떤 조건을 만족하지 않을 때까지 반복 수행
 *  			 조건을 만족하면 계속 반복 수행
 *  			 어떤 조건에서 종료하도록 할 때 
 *  자동차 -> 속도(speed = 0)
 *  메뉴 : 1 : 가속
 *  	  2 : 감속
 *  	  3 : 정지
 */

public class SpeedExample {

	public static void main(String[] args) throws IOException {
		boolean run = true; // 조건이 true
		int speed = 0;
		int keyCode = 0;
		while (run) {
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
			} else if (keyCode == 51) { // '3' -> 정지
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
