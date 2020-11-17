package ch05;

import java.util.Scanner;

/* 제어문 : 조건문, 반복문, break문, continue문, goto
 * 조건문 : 조건에 따라서 프로그램의 흐름을 다르게 처리
 * 	if문, switch문
 *  
 */
public class ControlExample {

	public static void main(String[] args) {
		// println : 줄을 바꿔줌
		// print : 줄을 바꿔주지 않음
		System.out.print("점수 입력 : ");	// 모니터에 출력
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();			// 입력을 기다린다.
		// 사용자로부터 어떤 글자를 입력하기를 기다린다. -> 사용자는 글자를 입력해야 한다.
		// 입력하지 않으면 프로그램이 진행하지 않음.
		// 점수에 따라서 학점을 출력
		if(score >= 90) {
			System.out.println("A학점 입니다.");
		} else if(score >= 80){
			System.out.println("B학점 입니다.");
		} else if(score >= 70){
			System.out.println("C학점 입니다.");
		} else if(score >= 60){
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		
		

	}

}
