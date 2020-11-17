package ch05;

import java.util.Scanner;

/* 데이터타입 : 기본데이터타입, 참조타입
 * 기본 데이터타입 : 8가지 (byte, char, short, int, 
 * long, float, double, boolean -> 값 자체가 사라짐)
 * 
 * 참조 데이터타입 : 주소를 저장
 *  array, enum, class, interface
 *  내용은 heap 영역에 저장이 된다.
 *  참조변수 : heap 영역에 있는 데이터의 주소를 저장하며, 
 *  참조변수를 통해서만 데이터에 접근가능
 * 
 */
public class ReferenceType {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * for(int i = 0; i < 10; i++) { // new String : 필요할 때 저장공간을 확보해서 값을 저장 
		 * String str = sc.next(); // 문자열을 입력
		 * String name5 = new String("홍길동"); 
		 * name5 = new String(str);
		 * 
		 * }
		 */
		if (name3 == name4) { // 다른 주소값을 저장
			System.out.println("같은 홍길동을 가리킨다.");
		} else { // 동명이인
			System.out.println("다른 홍길동을 가리킨다.");
		}
		if (name3.equals(name4)) {
			System.out.println("같은 내용입니다.");
		} else {
			System.out.println("다른 내용입니다.");
		}
	}
}
