package ch04;

import java.util.Scanner;

// 명령 프롬프트

public class CmdWindow {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 exit을 입력하세요.");

		Scanner sc = new Scanner(System.in);
		String inString;

		do {
			System.out.print("C:\\Users\\Admin> ");
			inString = sc.nextLine();
			System.out.println("명령어를 실행 : " + inString);
		} while (!inString.equals("exit"));
		System.out.println("프로그램 종료");
		sc.close();

	}

}
