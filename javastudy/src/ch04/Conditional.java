package ch04;

import java.util.Scanner;

/*
 *  -제어문 : 조건문, 반복문
 *  -조건문 : if문, switch문
 *  -반복문 : for문, while문, do-while문
 *  -continue문, break문
 */

public class Conditional {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner (System.in); // 입력 받기 // console로부터 값을 입력 받는 방법
		 * 
		 * System.out.print("점수 : ");
		 * 
		 * int score = scanner.nextInt(); // 0 ~ 100 if(score >= 90) { // 시작
		 * System.out.println("A 학점 입니다."); } else if(score >= 80) { // 90보다 작고 80보다 크거나
		 * 같은 System.out.println("B 학점 입니다."); } else if(score >= 70) { // 80보다 작고 70보다
		 * 크거나 같은 System.out.println("C 학점 입니다."); } else if(score >= 60) { // 70보다 작고
		 * 60보다 크거나 같은 System.out.println("D 학점 입니다."); } else { // 60보다 작다.
		 * System.out.println("F 학점 입니다."); }
		 */
//		1번 조건문
		int num1 = 20;
		if (num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀");
		}

//		2번 조건문							1번 조건문 = 2번 조건문
		if (num1 % 2 == 0) {
			System.out.println("짝수");
		}
		if (num1 % 2 == 1) {
			System.out.println("홀");
		}

	}

}
