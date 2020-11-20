package ch05;

import java.util.Scanner;

/*
 * 	학생들에 대한 최고점수와 평균점수를 구하는 프로그램 (선생님)
 * 메뉴 : 1.학생수 입력, 2. 점수입력, 3. 점수출력, 4. 분석(최고점수, 평균값), 5. 종료 
 * 	입력 : 학생수, 학생들의 점수
 */

public class Exercise09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int studentNo = 0; // 학생 수 (stack에 저장되므로 초기화를 하지 않고 사용하면 에러)
		int scores[] = null; // 학생의 점수를 저장하는 배열
		// 최고값을 구하는 방법
		// 각 학생의 점수를 비교해서 최고값을 알아낸다.
		// 점수 : 0 ~ 100
		int highScore = -1; // 초기값을 지정 : 가장 작은 값 -1
		// 입력받은 값이랑 비교를 하면 입력값이 최대값이 된다.
		// 최소값을 구하려면
		int lowScore = 101;
		// 처음의 초기값과 입력값을 비교하면 입력값이 최소가 된다.
		double avg; // 평균 값
		boolean run = true; // 반복문을 실행 (메뉴를 입력받고 메뉴에 따라서 수행)
		int menu; // 메뉴를 저장하는 변수

		while (run) {
			// 메뉴를 입력받기
			// 도움말 출력
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>"); // 메뉴를 입력하도록 안내 출력 (줄을 바꾸지 않음)
			// 메뉴를 입력받는다.
			menu = sc.nextInt(); // int를 입력받는다
			// 메뉴에 따라서 해야할 일을 수행
			if (menu == 1) {
				System.out.print("학생수: "); // 출력
				studentNo = sc.nextInt(); // 입력
			} else if (menu == 2) { // 점수입력
				// 반복문을 사용 : 학생 수만큼 점수를 입력받아야 하기 떄문에.
				// 점수를 저장하려면 배열을 생성 : 학생 수만큼.
				// 학생수가 입력이 되었는지를 우선 검사를 해야 한다.
				// 순서대로 진행한다고 가정을 하고 프로그래밍을 한다.
				scores = new int[studentNo];

				for (int i = 0; i < studentNo; i++) {
					System.out.print("scores[ " + i + " ]>");
					scores[i] = sc.nextInt();
				}
			} else if (menu == 3) { // 점수 리스트 출
				// 반복문을 사용
				for (int i = 0; i < studentNo; i++) {
					System.out.println("scores[ " + i + " ]: " + scores[i] + " ");
				}
			} else if (menu == 4) { // 분석 : 최대값과 평
				// 학생들의 점수를 비교를 해서 최대값과 평균을 구한다. -> 반복문
				int total = 0;
				for (int i = 0; i < studentNo; i++) { // 모든 학생에 대하여 반복
					// 최고값을 구한다. : 현재 최대값과 현재 값을 비교해서 새로운 최대값을 구한다.
					if (highScore < scores[i]) { // <, > 중에 <을 사용해야 함.
						highScore = scores[i];
					}
					total += scores[i]; // 학생점수를 누적
				}
				// 최대값과 총점이 구해진다.
				System.out.println("최고 점수 : " + highScore);
				avg = (double) total / studentNo;	// 소수점을 구하기 위해서 형변환
//				System.out.println("평균 점수 : " + avg);
				// 소수점 첫째자리까지 출력
				System.out.printf("평균점수 : %.1f\n", avg);
			} else if(menu == 5) {	// 종료
				run = false;	// 반복문 종료
				// 프로그램 종료를 써줘도 된다.
			}
		}
		System.out.println("프로그램 종료");
	}

}
